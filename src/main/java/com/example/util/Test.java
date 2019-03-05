package com.example.util;

import com.example.entity.Army;
import com.example.entity.Category;
import com.example.entity.Department;
import com.example.entity.Equipment;

import java.util.List;

public class Test {
    List<Army> armyList;
    List<Department> departmentList;
    List<Equipment> equipment_list;
    List<Category> category_list;

    public Test() {
    }

    public Test(List<Army> armyList, List<Department> departmentList, List<Equipment> equipment_list, List<Category> category_list) {
        this.armyList = armyList;
        this.departmentList = departmentList;
        this.equipment_list = equipment_list;
        this.category_list = category_list;
    }

    public List<Army> getArmyList() {
        return armyList;
    }

    public void setArmyList(List<Army> armyList) {
        this.armyList = armyList;
    }

    public List<Department> getDepartmentList() {
        return departmentList;
    }

    public void setDepartmentList(List<Department> departmentList) {
        this.departmentList = departmentList;
    }

    public List<Equipment> getEquipment_list() {
        return equipment_list;
    }

    public void setEquipment_list(List<Equipment> equipment_list) {
        this.equipment_list = equipment_list;
    }

    public List<Category> getCategory_list() {
        return category_list;
    }

    public void setCategory_list(List<Category> category_list) {
        this.category_list = category_list;
    }
}
