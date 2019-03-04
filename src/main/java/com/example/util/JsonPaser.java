package com.example.util;

import com.example.entity.*;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class JsonPaser {
    private void JsonArrayToList(JSONArray jsonArray, List<Object> list) throws JSONException {
        for (int i = 0; i < jsonArray.length(); i++)
            list.add(jsonArray.get(i));
    }
    private Object JsonObjToBeanObj(JSONObject jsonObj, Object bean) {
        Field[] fields = bean.getClass().getDeclaredFields();
        for (Field field: fields) {
            if (!jsonObj.has(field.getName()))
                continue;
            field.setAccessible(true);
            try {
                String type = field.getType().getName();
                switch (type) {
                    case "java.util.List":
                        List<Object> list = new ArrayList<>();
                        JsonArrayToList((JSONArray)jsonObj.get(field.getName()), list);
                        field.set(bean, list);
                        break;
                    case "java.lang.String":
                    case "java.lang.Integer":
                    case "int":
                    case "long":
                    case "java.lang.Long":
                        field.set(bean, jsonObj.get(field.getName()));
                        break;
                    default:
                        Object obj = Class.forName(type).newInstance();
                        JsonObjToBeanObj((JSONObject)jsonObj.get(field.getName()), obj);
                        field.set(bean, obj);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return bean;
    }
    public Location ParseLocation(String jsonStr) throws JSONException
    {
        JSONObject jsonObj = new JSONObject(jsonStr);
        Location location = new Location();
        JsonObjToBeanObj(jsonObj.getJSONObject("location"),location);
        return location;
    }
    public Scheme ParseScheme(String jsonStr) throws JSONException
    {
        JSONObject jsonObj = new JSONObject(jsonStr);
        Scheme scheme = new Scheme();
        JsonObjToBeanObj(jsonObj.getJSONObject("scheme"),scheme);
        return scheme;
    }
    public List<Scheme_Army> ParseSchemeArmy(String jsonStr) throws JSONException
    {
        JSONObject jsonObj = new JSONObject(jsonStr);
        List<Scheme_Army> list = new ArrayList<>();
        JSONArray scheme_army_list_json = jsonObj.getJSONArray("scheme_army_list");
        for(int i=0;i<scheme_army_list_json.length();i++)
        {
            JSONObject id_json = scheme_army_list_json.getJSONObject(i);
            Scheme_Army scheme_army = new Scheme_Army();
            JsonObjToBeanObj(id_json.getJSONObject("scheme_army"),scheme_army);
            list.add(scheme_army);
        }
        return list;
    }
    public Task ParseTask(String jsonStr) throws JSONException
    {
        JSONObject jsonObj = new JSONObject(jsonStr);
        Task task = new Task();
        JsonObjToBeanObj(jsonObj.getJSONObject("task"),task);
        return task;
    }
    public HashMap<Integer,List<Integer>> ParseEquipmentIDList(String jsonStr) throws JSONException
    {
        HashMap<Integer,List<Integer>> map = new HashMap<>();
        JSONObject jsonObj = new JSONObject(jsonStr);
        List<Integer> list = new ArrayList<>();
        Integer integer = jsonObj.getInt("scheme_id");
        JSONArray id_list_json = jsonObj.getJSONArray("equipment_list");
        for (int i=0;i<id_list_json.length();i++)
        {
            JSONObject id_json = id_list_json.getJSONObject(i);
            Integer ig = id_json.getInt("equipment_id");
            list.add(ig);
        }
        map.put(integer,list);
        return map;
    }
    public Plan ParsePlan(String jsonStr) throws JSONException
    {
        JSONObject jsonObj = new JSONObject(jsonStr);
        Plan plan = new Plan();
        JsonObjToBeanObj(jsonObj.getJSONObject("plan"),plan);
        return plan;
    }
    public Group ParseGroup(String jsonStr) throws JSONException
    {
        JSONObject jsonObj = new JSONObject(jsonStr);
        Group group = new Group();
        JsonObjToBeanObj(jsonObj.getJSONObject("group"),group);
        return group;
    }

    public Team ParseTeam(String jsonStr) throws JSONException
    {
        JSONObject jsonObj = new JSONObject(jsonStr);
        Team team = new Team();
        JsonObjToBeanObj(jsonObj.getJSONObject("team"),team);
        return team;
    }

    public Team_Department ParseTeamDepartment(String jsonStr) throws JSONException
    {
        JSONObject jsonObj = new JSONObject(jsonStr);
        Team_Department team_department = new Team_Department();
        JsonObjToBeanObj(jsonObj.getJSONObject("team_department"),team_department);
        return team_department;
    }

    public Team_Category ParseTeamCategory(String jsonStr) throws JSONException
    {
        JSONObject jsonObj = new JSONObject(jsonStr);
        Team_Category team_category = new Team_Category();
        JsonObjToBeanObj(jsonObj.getJSONObject("team_category"),team_category);
        return team_category;
    }
}
