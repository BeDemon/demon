package com.example.entity;

public class Person {

    private Integer person_id;
    private Integer army_id;
    private String person_name;
    private int person_job;

    public Person() {
    }

    public Person(Integer person_id, Integer army_id, String person_name, int person_job) {
        this.person_id = person_id;
        this.army_id = army_id;
        this.person_name = person_name;
        this.person_job = person_job;
    }

    public Integer getPerson_id() {
        return person_id;
    }

    public void setPerson_id(Integer person_id) {
        this.person_id = person_id;
    }

    public Integer getArmy_id() {
        return army_id;
    }

    public void setArmy_id(Integer army_id) {
        this.army_id = army_id;
    }

    public String getPerson_name() {
        return person_name;
    }

    public void setPerson_name(String person_name) {
        this.person_name = person_name;
    }

    public int getPerson_job() {
        return person_job;
    }

    public void setPerson_job(int person_job) {
        this.person_job = person_job;
    }
}
