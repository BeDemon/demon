package com.example.entity;

public class Element_Maintain {

    private Integer maintain_id;
    private Integer equipment_element_id;
    private Integer user_id;
    private String maintain_time;
    private String maintain_method;

    public Element_Maintain() {
    }

    public Element_Maintain(Integer maintain_id, Integer equipment_element_id, Integer user_id, String maintain_time, String maintain_method) {
        this.maintain_id = maintain_id;
        this.equipment_element_id = equipment_element_id;
        this.user_id = user_id;
        this.maintain_time = maintain_time;
        this.maintain_method = maintain_method;
    }

    public Integer getMaintain_id() {
        return maintain_id;
    }

    public void setMaintain_id(Integer maintain_id) {
        this.maintain_id = maintain_id;
    }

    public Integer getEquipment_element_id() {
        return equipment_element_id;
    }

    public void setEquipment_element_id(Integer equipment_element_id) {
        this.equipment_element_id = equipment_element_id;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getMaintain_time() {
        return maintain_time;
    }

    public void setMaintain_time(String maintain_time) {
        this.maintain_time = maintain_time;
    }

    public String getMaintain_method() {
        return maintain_method;
    }

    public void setMaintain_method(String maintain_method) {
        this.maintain_method = maintain_method;
    }
}
