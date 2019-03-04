package com.example.entity;

public class Reason {
    private Integer reason_id;
    private Integer malfunction_id;
    private String reason_description;

    public Reason() {
    }

    public Reason(Integer reason_id, Integer malfunction_id, String reason_description) {
        this.reason_id = reason_id;
        this.malfunction_id = malfunction_id;
        this.reason_description = reason_description;
    }

    public Integer getReason_id() {
        return reason_id;
    }

    public void setReason_id(Integer reason_id) {
        this.reason_id = reason_id;
    }

    public Integer getMalfunction_id() {
        return malfunction_id;
    }

    public void setMalfunction_id(Integer malfunction_id) {
        this.malfunction_id = malfunction_id;
    }

    public String getReason_description() {
        return reason_description;
    }

    public void setReason_description(String reason_description) {
        this.reason_description = reason_description;
    }
}
