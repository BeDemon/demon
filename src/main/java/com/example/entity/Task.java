package com.example.entity;

public class Task {

    private Integer task_id;
    private Integer type_id;
    private Integer task_number;
    private Integer task_type;
    private String item;

    public Task() {
    }

    public Task(Integer task_id, Integer type_id, Integer task_number, Integer task_type, String item) {
        this.task_id = task_id;
        this.type_id = type_id;
        this.task_number = task_number;
        this.task_type = task_type;
        this.item = item;
    }

    public Integer getTask_id() {
        return task_id;
    }

    public void setTask_id(Integer task_id) {
        this.task_id = task_id;
    }

    public Integer getType_id() {
        return type_id;
    }

    public void setType_id(Integer type_id) {
        this.type_id = type_id;
    }

    public Integer getTask_number() {
        return task_number;
    }

    public void setTask_number(Integer task_number) {
        this.task_number = task_number;
    }

    public Integer getTask_type() {
        return task_type;
    }

    public void setTask_type(Integer task_type) {
        this.task_type = task_type;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }
}
