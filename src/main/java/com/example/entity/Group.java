package com.example.entity;

import java.util.List;

public class Group {

    private Integer group_id;
    private Integer plan_id;
    private String group_name;
    private int group_type;
    private List<Task> task_list;

    public Group() {
    }

    public Group(Integer group_id, Integer plan_id, String group_name, int group_type, List<Task> task_list) {
        this.group_id = group_id;
        this.plan_id = plan_id;
        this.group_name = group_name;
        this.group_type = group_type;
        this.task_list = task_list;
    }

    public Integer getGroup_id() {
        return group_id;
    }

    public void setGroup_id(Integer group_id) {
        this.group_id = group_id;
    }

    public Integer getPlan_id() {
        return plan_id;
    }

    public void setPlan_id(Integer plan_id) {
        this.plan_id = plan_id;
    }

    public String getGroup_name() {
        return group_name;
    }

    public void setGroup_name(String group_name) {
        this.group_name = group_name;
    }

    public int getGroup_type() {
        return group_type;
    }

    public void setGroup_type(int group_type) {
        this.group_type = group_type;
    }

    public List<Task> getTask_list() {
        return task_list;
    }

    public void setTask_list(List<Task> task_list) {
        this.task_list = task_list;
    }
}
