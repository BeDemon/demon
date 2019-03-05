package com.example.entity;

import java.util.List;

public class Scheme_Equipment {
    private Integer scheme_id;
    private Integer Equipment_id;

    public Scheme_Equipment() {
    }

    public Scheme_Equipment(Integer scheme_id, Integer equipment_id) {
        this.scheme_id = scheme_id;
        Equipment_id = equipment_id;
    }

    public Integer getScheme_id() {
        return scheme_id;
    }

    public void setScheme_id(Integer scheme_id) {
        this.scheme_id = scheme_id;
    }

    public Integer getEquipment_id() {
        return Equipment_id;
    }

    public void setEquipment_id(Integer equipment_id) {
        Equipment_id = equipment_id;
    }
}
