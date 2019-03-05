package com.example.entity;

import java.util.List;

public class Plan {

    private Integer plan_id;
    private Integer scheme_id;
    private String plan_name;
    private Integer plan_type;
    private List<Group> group_list;

    public Plan() {
    }

    public Plan(Integer plan_id, Integer scheme_id, String plan_name, Integer plan_type, List<Group> group_list) {
        this.plan_id = plan_id;
        this.scheme_id = scheme_id;
        this.plan_name = plan_name;
        this.plan_type = plan_type;
        this.group_list = group_list;
    }

    public Integer getPlan_id() {
        return plan_id;
    }

    public void setPlan_id(Integer plan_id) {
        this.plan_id = plan_id;
    }

    public Integer getScheme_id() {
        return scheme_id;
    }

    public void setScheme_id(Integer scheme_id) {
        this.scheme_id = scheme_id;
    }

    public String getPlan_name() {
        return plan_name;
    }

    public void setPlan_name(String plan_name) {
        this.plan_name = plan_name;
    }

    public Integer getPlan_type() {
        return plan_type;
    }

    public void setPlan_type(Integer plan_type) {
        this.plan_type = plan_type;
    }

    public List<Group> getGroup_list() {
        return group_list;
    }

    public void setGroup_list(List<Group> group_list) {
        this.group_list = group_list;
    }
}
