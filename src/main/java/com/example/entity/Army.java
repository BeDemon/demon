package com.example.entity;

import lombok.Data;

@Data
public class Army {

    private Integer army_id;
    private String platoon_name;
    private String battalion_name;

    public Army() {
    }

    public Army(Integer army_id, String platoon_name, String battalion_name) {
        this.army_id = army_id;
        this.platoon_name = platoon_name;
        this.battalion_name = battalion_name;
    }

    public Integer getArmy_id() {
        return army_id;
    }

    public void setArmy_id(Integer army_id) {
        this.army_id = army_id;
    }

    public String getPlatoon_name() {
        return platoon_name;
    }

    public void setPlatoon_name(String platoon_name) {
        this.platoon_name = platoon_name;
    }

    public String getBattalion_name() {
        return battalion_name;
    }

    public void setBattalion_name(String battalion_name) {
        this.battalion_name = battalion_name;
    }
}
