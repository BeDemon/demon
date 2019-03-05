package com.example.service.impl;

import com.example.entity.*;
import com.example.mappers.*;
import com.example.service.EquipmentService;
import com.example.util.Reliability;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class EquipmentServiceImpl implements EquipmentService {

    @Autowired
    private EquipmentMapper equipmentMapper;
    @Autowired
    private CategoryMapper categoryMapper;
    @Autowired
    private DepartmentMapper departmentMapper;

    private Reliability reliability = new Reliability();
    @Override
    public List<Category> GetCategoryByType(String category_type) {

        return categoryMapper.GetCategoryByCategoryType(category_type);
    }

    @Override
    public List<Equipment> GetEquipmentListByType(String category_type) {
        List<Equipment> equipment_list = equipmentMapper.GetEquipmentByType(category_type);
        for (int i=0;i<equipment_list.size();i++)
        {
            equipment_list.get(i).setReliability(1);
        }
        return equipment_list;
    }

    @Override
    public List<Department> GetDepartment() {
        return departmentMapper.GetAllDepartment();
    }

    @Override
    public void AddSchemeEquipment(List<Scheme_Equipment> scheme_equipment_list) {
        for (int i=0;i<scheme_equipment_list.size();i++)
        {
            Scheme_Equipment scheme_equipment = scheme_equipment_list.get(i);
            Integer count = equipmentMapper.GetSchemeEquipment(scheme_equipment);
            if (count == null || count == 0)
            {
                equipmentMapper.AddSchemeEquipment(scheme_equipment);
            }
        }
    }
}
