package com.example.entity;

public class Scheme_Army {

    private Integer scheme_id;
    private Integer army_id;
    private Integer people_number;

    public Scheme_Army() {
    }

    public Scheme_Army(Integer scheme_id, Integer army_id, Integer people_number) {
        this.scheme_id = scheme_id;
        this.army_id = army_id;
        this.people_number = people_number;
    }

    public Integer getScheme_id() {
        return scheme_id;
    }

    public void setScheme_id(Integer scheme_id) {
        this.scheme_id = scheme_id;
    }

    public Integer getArmy_id() {
        return army_id;
    }

    public void setArmy_id(Integer army_id) {
        this.army_id = army_id;
    }

    public Integer getPeople_number() {
        return people_number;
    }

    public void setPeople_number(Integer people_number) {
        this.people_number = people_number;
    }
}
