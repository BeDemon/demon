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
    public List<Integer> ParseSchemeEquipment(String jsonStr)
    {
        JSONObject jsonObj = new JSONObject(jsonStr);
        List<Integer> list = new ArrayList<>();
        JSONArray list_json = jsonObj.getJSONArray("scheme_equipment");
        for (int i=0;i<list_json.length();i++)
        {
            JSONObject equipment_id_json = list_json.getJSONObject(i);
            Integer integer = equipment_id_json.getInt("equipment_id");
            list.add(integer);
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
    public Plan ParsePlan(String jsonStr) throws JSONException
    {
        JSONObject jsonObj = new JSONObject(jsonStr);
        JSONObject planObj = jsonObj.getJSONObject("plan");
        Plan plan = new Plan();
        JsonObjToBeanObj(jsonObj.getJSONObject("plan"),plan);
        JSONArray group_list_json = planObj.getJSONArray("group_list");
        List<Group> group_list = new ArrayList<>();
        for(int i= 0;i<group_list_json.length();i++)
        {
            JSONObject group_json = group_list_json.getJSONObject(i).getJSONObject("group");
            System.out.println(group_json.toString()+"..........");
            JSONArray team_list_json = group_json.getJSONArray("team_list");
            Group group = new Group();
            JsonObjToBeanObj(group_list_json.getJSONObject(i).getJSONObject("group"),group);
            List<Team> team_list = new ArrayList<>();
            for (int j=0;j<team_list_json.length();j++)
            {
                JSONObject team_json = team_list_json.getJSONObject(j).getJSONObject("team");
                JSONArray team_department_list_json = team_json.getJSONArray("team_department_list");
                JSONArray team_category_list_json = team_json.getJSONArray("team_category_list");
                Team team = new Team();
                JsonObjToBeanObj(team_list_json.getJSONObject(j).getJSONObject("team"),team);
                List<Team_Department> team_department_list = new ArrayList<>();
                for (int k=0;k<team_department_list_json.length();k++)
                {
                    JSONObject team_department_json = team_department_list_json.getJSONObject(k);
                    Team_Department team_department = new Team_Department();
                    JsonObjToBeanObj(team_department_json.getJSONObject("team_department"),team_department);
                    team_department_list.add(team_department);
                }
                List<Team_Category> team_category_list = new ArrayList<>();
                for (int k=0;k<team_category_list_json.length();k++)
                {
                    JSONObject team_category_json = team_category_list_json.getJSONObject(k);
                    Team_Category team_category = new Team_Category();
                    JsonObjToBeanObj(team_category_json.getJSONObject("team_category"),team_category);
                    team_category_list.add(team_category);
                }
                team.setTeam_department_list(team_department_list);
                team.setTeam_category_list(team_category_list);
                team_list.add(team);
            }
            group.setTeam_list(team_list);
            group_list.add(group);
        }
        plan.setGroup_list(group_list);
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
