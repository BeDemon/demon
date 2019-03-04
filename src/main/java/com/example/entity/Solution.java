package com.example.entity;

public class Solution {

    private Integer solution_id;
    private Integer malfunction_id;
    private String solution_description;

    public Solution() {
    }

    public Solution(Integer solution_id, Integer malfunction_id, String solution_description) {
        this.solution_id = solution_id;
        this.malfunction_id = malfunction_id;
        this.solution_description = solution_description;
    }

    public Integer getSolution_id() {
        return solution_id;
    }

    public void setSolution_id(Integer solution_id) {
        this.solution_id = solution_id;
    }

    public Integer getMalfunction_id() {
        return malfunction_id;
    }

    public void setMalfunction_id(Integer malfunction_id) {
        this.malfunction_id = malfunction_id;
    }

    public String getSolution_description() {
        return solution_description;
    }

    public void setSolution_description(String solution_description) {
        this.solution_description = solution_description;
    }
}
