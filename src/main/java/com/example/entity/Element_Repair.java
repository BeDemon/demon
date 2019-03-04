package com.example.entity;

import java.util.List;

public class Element_Repair {

    private Integer element_repair_id;
    private Integer equipment_element_id;
    private Integer user_id;
    private String element_repair_time;
    private List<Malfunction> malfunction_list;

    public Element_Repair() {
    }

    public Element_Repair(Integer element_repair_id, Integer equipment_element_id, Integer user_id, String element_repair_time, List<Malfunction> malfunction_list) {
        this.element_repair_id = element_repair_id;
        this.equipment_element_id = equipment_element_id;
        this.user_id = user_id;
        this.element_repair_time = element_repair_time;
        this.malfunction_list = malfunction_list;
    }

    public Integer getElement_repair_id() {
        return element_repair_id;
    }

    public void setElement_repair_id(Integer element_repair_id) {
        this.element_repair_id = element_repair_id;
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

    public String getElement_repair_time() {
        return element_repair_time;
    }

    public void setElement_repair_time(String element_repair_time) {
        this.element_repair_time = element_repair_time;
    }

    public List<Malfunction> getMalfunction_list() {
        return malfunction_list;
    }

    public void setMalfunction_list(List<Malfunction> malfunction_list) {
        this.malfunction_list = malfunction_list;
    }
}
