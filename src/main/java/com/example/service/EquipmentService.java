package com.example.service;

import com.example.entity.*;

import java.util.List;

public interface EquipmentService {

    public List<Category> GetCategoryByType(String category_type);

    public List<Equipment> GetEquipmentListByType(String category_type);

    public List<Department> GetDepartment();

    public void AddSchemeEquipment(List<Scheme_Equipment> scheme_equipment_list);

}
