package com.example.entity;

public class Team_Department {
    Integer team_id;
    Integer department_id;
    Integer person_number;

    public Team_Department() {
    }

    public Team_Department(Integer team_id, Integer department_id, Integer person_number) {
        this.team_id = team_id;
        this.department_id = department_id;
        this.person_number = person_number;
    }

    public Integer getTeam_id() {
        return team_id;
    }

    public void setTeam_id(Integer team_id) {
        this.team_id = team_id;
    }

    public Integer getDepartment_id() {
        return department_id;
    }

    public void setDepartment_id(Integer department_id) {
        this.department_id = department_id;
    }

    public Integer getPerson_number() {
        return person_number;
    }

    public void setPerson_number(Integer person_number) {
        this.person_number = person_number;
    }
}
