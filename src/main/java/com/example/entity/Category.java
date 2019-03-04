package com.example.entity;

import java.util.List;

public class Category {
    private Integer category_id;
    private String category_name;
    private String category_type;
    private String category_unit;
    private String category_comment;
    private List<Equipment> equipment_list;
    public Category() {
    }

    public Category(Integer category_id, String category_name, String category_type, String category_unit, String category_comment, List<Equipment> equipment_list) {
        this.category_id = category_id;
        this.category_name = category_name;
        this.category_type = category_type;
        this.category_unit = category_unit;
        this.category_comment = category_comment;
        this.equipment_list = equipment_list;
    }

    public Integer getCategory_id() {
        return category_id;
    }

    public void setCategory_id(Integer category_id) {
        this.category_id = category_id;
    }

    public String getCategory_name() {
        return category_name;
    }

    public void setCategory_name(String category_name) {
        this.category_name = category_name;
    }

    public String getCategory_type() {
        return category_type;
    }

    public void setCategory_type(String category_type) {
        this.category_type = category_type;
    }

    public String getCategory_unit() {
        return category_unit;
    }

    public void setCategory_unit(String category_unit) {
        this.category_unit = category_unit;
    }

    public String getCategory_comment() {
        return category_comment;
    }

    public void setCategory_comment(String category_comment) {
        this.category_comment = category_comment;
    }

    public List<Equipment> getEquipment_list() {
        return equipment_list;
    }

    public void setEquipment_list(List<Equipment> equipment_list) {
        this.equipment_list = equipment_list;
    }
}
