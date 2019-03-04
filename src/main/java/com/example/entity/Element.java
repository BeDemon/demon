package com.example.entity;

public class Element {

    private Integer element_id;
    private Integer category_id;
    private String element_name;
    private String element_type;
    private Integer supplier_id;

    public Element() {
    }

    public Element(Integer element_id, Integer category_id, String element_name, String element_type, Integer supplier_id) {
        this.element_id = element_id;
        this.category_id = category_id;
        this.element_name = element_name;
        this.element_type = element_type;
        this.supplier_id = supplier_id;
    }

    public Integer getElement_id() {
        return element_id;
    }

    public void setElement_id(Integer element_id) {
        this.element_id = element_id;
    }

    public Integer getCategory_id() {
        return category_id;
    }

    public void setCategory_id(Integer category_id) {
        this.category_id = category_id;
    }

    public String getElement_name() {
        return element_name;
    }

    public void setElement_name(String element_name) {
        this.element_name = element_name;
    }

    public String getElement_type() {
        return element_type;
    }

    public void setElement_type(String element_type) {
        this.element_type = element_type;
    }

    public Integer getSupplier_id() {
        return supplier_id;
    }

    public void setSupplier_id(Integer supplier_id) {
        this.supplier_id = supplier_id;
    }
}


