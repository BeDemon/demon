package com.example.entity;

import java.util.HashMap;
import java.util.List;

public class Team {

    private Integer team_id;
    private Integer group_id;
    private String team_name;
    private Integer army_id;//需保障的队伍
    private List<Task> task_list;
    private List<HashMap<Department,Integer>> personnel_list;
    private List<HashMap<Category,Integer>> category_list;

    public Team() {
    }

    public Team(Integer team_id, Integer group_id, String team_name, Integer army_id, List<Task> task_list, List<HashMap<Department, Integer>> personnel_list, List<HashMap<Category, Integer>> category_list) {
        this.team_id = team_id;
        this.group_id = group_id;
        this.team_name = team_name;
        this.army_id = army_id;
        this.task_list = task_list;
        this.personnel_list = personnel_list;
        this.category_list = category_list;
    }

    public Integer getTeam_id() {
        return team_id;
    }

    public void setTeam_id(Integer team_id) {
        this.team_id = team_id;
    }

    public Integer getGroup_id() {
        return group_id;
    }

    public void setGroup_id(Integer group_id) {
        this.group_id = group_id;
    }

    public String getTeam_name() {
        return team_name;
    }

    public void setTeam_name(String team_name) {
        this.team_name = team_name;
    }

    public Integer getArmy_id() {
        return army_id;
    }

    public void setArmy_id(Integer army_id) {
        this.army_id = army_id;
    }

    public List<Task> getTask_list() {
        return task_list;
    }

    public void setTask_list(List<Task> task_list) {
        this.task_list = task_list;
    }

    public List<HashMap<Department, Integer>> getPersonnel_list() {
        return personnel_list;
    }

    public void setPersonnel_list(List<HashMap<Department, Integer>> personnel_list) {
        this.personnel_list = personnel_list;
    }

    public List<HashMap<Category, Integer>> getCategory_list() {
        return category_list;
    }

    public void setCategory_list(List<HashMap<Category, Integer>> category_list) {
        this.category_list = category_list;
    }
}
