package com.example.entity;

import java.util.List;

public class Malfunction {

    private Integer malfunction_id;
    private Integer element_id;
    private String malfunction_description;
    private String malfunction_influences;
    private List<Reason> reason_list;
    private List<Solution> solution_list;

    public Malfunction() {
    }

    public Malfunction(Integer malfunction_id, Integer element_id, String malfunction_description, String malfunction_influences, List<Reason> reason_list, List<Solution> solution_list) {
        this.malfunction_id = malfunction_id;
        this.element_id = element_id;
        this.malfunction_description = malfunction_description;
        this.malfunction_influences = malfunction_influences;
        this.reason_list = reason_list;
        this.solution_list = solution_list;
    }

    public Integer getMalfunction_id() {
        return malfunction_id;
    }

    public void setMalfunction_id(Integer malfunction_id) {
        this.malfunction_id = malfunction_id;
    }

    public Integer getElement_id() {
        return element_id;
    }

    public void setElement_id(Integer element_id) {
        this.element_id = element_id;
    }

    public String getMalfunction_description() {
        return malfunction_description;
    }

    public void setMalfunction_description(String malfunction_description) {
        this.malfunction_description = malfunction_description;
    }

    public String getMalfunction_influences() {
        return malfunction_influences;
    }

    public void setMalfunction_influences(String malfunction_influences) {
        this.malfunction_influences = malfunction_influences;
    }

    public List<Reason> getReason_list() {
        return reason_list;
    }

    public void setReason_list(List<Reason> reason_list) {
        this.reason_list = reason_list;
    }

    public List<Solution> getSolution_list() {
        return solution_list;
    }

    public void setSolution_list(List<Solution> solution_list) {
        this.solution_list = solution_list;
    }
}
