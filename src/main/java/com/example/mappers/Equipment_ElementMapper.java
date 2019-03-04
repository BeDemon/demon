package com.example.mappers;

import com.example.entity.Equipment_Element;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface Equipment_ElementMapper {
    public List<Equipment_Element> GetEquipmentElements(@Param("equipment_id") Integer equipment_id);
    public Equipment_Element GetEquipmentElement(@Param("equipment_id") Integer equipment_id, @Param("element_id") Integer element_id);
    public void AddEquipmentElement(@Param("equipment_id") Integer equipment_id,@Param("element_id") Integer element_id);
    public void DeleteEquipmentElement(@Param("equipment_id") Integer equipment_id,@Param("element_id") Integer element_id);
}
