package com.example.util;


import com.example.entity.*;
import org.json.JSONException;
import org.json.JSONObject;

import java.lang.reflect.Field;
import java.util.List;

public class JsonBuilder {
    private JSONObject getBeanJsonObj(Object bean) {
        JSONObject resObj = new JSONObject();

        Field[] fields = bean.getClass().getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            try {
                String type = field.getType().getName();
                switch (type) {
                    case "java.util.List":
                    case "java.lang.String":
                    case "int":
                    case "java.lang.Integer":
                    case "long":
                    case "java.lang.Long":
                        resObj.put(field.getName(), field.get(bean));
                        break;
                    default:
                        resObj.put(field.getName(), getBeanJsonObj(field.get(bean)));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return resObj;
    }
    public String buildArmy(Army army) throws JSONException
    {
        JSONObject resObj = new JSONObject();
        resObj.put("type_code","army");
        resObj.put("army",getBeanJsonObj(army));
        return resObj.toString();
    }
    public String buildArmyList(List<Army> army) throws JSONException
    {
        JSONObject resObj = new JSONObject();
        resObj.put("type_code","army_list");
        resObj.put("army_list",army);
        return resObj.toString();
    }
    public String buildLocationList(List<Location> locations) throws JSONException
    {
        JSONObject resObj = new JSONObject();
        resObj.put("type_code","location_list");
        resObj.put("location_list",locations);
        return resObj.toString();
    }
    public String buildScheme(Scheme scheme) throws JSONException
    {
        JSONObject resObj = new JSONObject();
        resObj.put("type_code","scheme");
        resObj.put("scheme",getBeanJsonObj(scheme));
        return resObj.toString();
    }

    public String buildTask(List<Task> task) throws JSONException
    {
        JSONObject resObj = new JSONObject();
        resObj.put("type_code","task_list");
        resObj.put("task_list",task);
        return resObj.toString();
    }

    public String buildEnvironment(List<Environment> environment_list,Location location) throws JSONException
    {
        JSONObject resObj = new JSONObject();
        resObj.put("type_code","environment_list");
        resObj.put("environment_list",environment_list);
        resObj.put("location",getBeanJsonObj(location));
        return resObj.toString();
    }
    public String buildCategory(List<Category> categories) throws JSONException
    {
        JSONObject resObj = new JSONObject();
        resObj.put("type_code","category_list");
        resObj.put("category_list",categories);
        return resObj.toString();
    }
    public String buildDepartment(List<Department> departments) throws JSONException
    {
        JSONObject resObj = new JSONObject();
        resObj.put("type_code","department_list");
        resObj.put("department_list",departments);
        return resObj.toString();
    }
    public String buildPlanList(List<Plan> plans) throws JSONException
    {
        JSONObject resObj = new JSONObject();
        resObj.put("type_code","plan_list");
        resObj.put("plan_list",plans);
        return resObj.toString();
    }
    public String buildGroupList(List<Group> groups) throws JSONException
    {
        JSONObject resObj = new JSONObject();
        resObj.put("type_code","group_list");
        resObj.put("group_list",groups);
        return resObj.toString();
    }
    public String buildTeamList(List<Team> teams) throws JSONException
    {
        JSONObject resObj = new JSONObject();
        resObj.put("type_code","team_list");
        resObj.put("team_list",teams);
        return resObj.toString();
    }
}
