package com.example.entity;

public class Equipment {

    private Integer equipment_id;
    private Integer category_id;
    private String equipment_name;
    private String equipment_create;
    private String army_id;
    private double reliability;
    public Equipment() {
    }

    public Equipment(Integer equipment_id, Integer category_id, String equipment_name, String equipment_create, String army_id, double reliability) {
        this.equipment_id = equipment_id;
        this.category_id = category_id;
        this.equipment_name = equipment_name;
        this.equipment_create = equipment_create;
        this.army_id = army_id;
        this.reliability = reliability;
    }

    public Integer getEquipment_id() {
        return equipment_id;
    }

    public void setEquipment_id(Integer equipment_id) {
        this.equipment_id = equipment_id;
    }

    public Integer getCategory_id() {
        return category_id;
    }

    public void setCategory_id(Integer category_id) {
        this.category_id = category_id;
    }

    public String getEquipment_name() {
        return equipment_name;
    }

    public void setEquipment_name(String equipment_name) {
        this.equipment_name = equipment_name;
    }

    public String getEquipment_create() {
        return equipment_create;
    }

    public void setEquipment_create(String equipment_create) {
        this.equipment_create = equipment_create;
    }

    public String getArmy_id() {
        return army_id;
    }

    public void setArmy_id(String army_id) {
        this.army_id = army_id;
    }

    public double getReliability() {
        return reliability;
    }

    public void setReliability(double reliability) {
        this.reliability = reliability;
    }
}
