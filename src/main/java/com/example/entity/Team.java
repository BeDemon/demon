package com.example.entity;

import java.util.HashMap;
import java.util.List;

public class Team {

    private Integer team_id;
    private Integer group_id;
    private String team_name;
    private Integer army_id;//需保障的队伍
    private Integer location_id;//部署地点
    private List<Team_Department> team_department_list;
    private List<Team_Category> team_category_list;

    public Team() {
    }

    public Team(Integer team_id, Integer group_id, String team_name, Integer army_id, Integer location_id, List<Team_Department> team_department_list, List<Team_Category> team_category_list) {
        this.team_id = team_id;
        this.group_id = group_id;
        this.team_name = team_name;
        this.army_id = army_id;
        this.location_id = location_id;
        this.team_department_list = team_department_list;
        this.team_category_list = team_category_list;
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

    public Integer getLocation_id() {
        return location_id;
    }

    public void setLocation_id(Integer location_id) {
        this.location_id = location_id;
    }

    public List<Team_Department> getTeam_department_list() {
        return team_department_list;
    }

    public void setTeam_department_list(List<Team_Department> team_department_list) {
        this.team_department_list = team_department_list;
    }

    public List<Team_Category> getTeam_category_list() {
        return team_category_list;
    }

    public void setTeam_category_list(List<Team_Category> team_category_list) {
        this.team_category_list = team_category_list;
    }
}
