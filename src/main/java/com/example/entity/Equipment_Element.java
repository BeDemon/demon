package com.example.entity;

public class Equipment_Element {

    private Integer equipment_element_id;
    private Integer element_id;
    private Integer equipment_id;
    public Equipment_Element() {
    }

    public Equipment_Element(Integer equipment_element_id, Integer element_id, Integer equipment_id) {
        this.equipment_element_id = equipment_element_id;
        this.element_id = element_id;
        this.equipment_id = equipment_id;
    }

    public Integer getEquipment_element_id() {
        return equipment_element_id;
    }

    public void setEquipment_element_id(Integer equipment_element_id) {
        this.equipment_element_id = equipment_element_id;
    }

    public Integer getElement_id() {
        return element_id;
    }

    public void setElement_id(Integer element_id) {
        this.element_id = element_id;
    }

    public Integer getEquipment_id() {
        return equipment_id;
    }

    public void setEquipment_id(Integer equipment_id) {
        this.equipment_id = equipment_id;
    }
}
