package com.example.entity;

public class Element_Replace {

    private Integer element_replace_id;
    private Integer user_id;
    private Integer equipment_element_id;
    private String element_replace_time;

    public Element_Replace() {
    }

    public Element_Replace(Integer element_replace_id, Integer user_id, Integer equipment_element_id, String element_replace_time) {
        this.element_replace_id = element_replace_id;
        this.user_id = user_id;
        this.equipment_element_id = equipment_element_id;
        this.element_replace_time = element_replace_time;
    }

    public Integer getElement_replace_id() {
        return element_replace_id;
    }

    public void setElement_replace_id(Integer element_replace_id) {
        this.element_replace_id = element_replace_id;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public Integer getEquipment_element_id() {
        return equipment_element_id;
    }

    public void setEquipment_element_id(Integer equipment_element_id) {
        this.equipment_element_id = equipment_element_id;
    }

    public String getElement_replace_time() {
        return element_replace_time;
    }

    public void setElement_replace_time(String element_replace_time) {
        this.element_replace_time = element_replace_time;
    }
}

