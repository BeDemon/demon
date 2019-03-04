package com.example.mappers;

import com.example.entity.Element_Repair;
import com.example.entity.Malfunction;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface Element_RepairMapper {

    public List<Element_Repair> GetElementRepairByElementId(@Param("equipment_element_id") Integer equipment_element_id);
    public List<Integer> GetRepairMalfunction(@Param("element_repair_id") Integer element_repair_id);
    public void AddElementRepair(Element_Repair element_repair);
    public void AddRepairMalfunction(@Param("element_repair_id") Integer element_repair_id,@Param("malfunction_id" ) Integer malfunction_id);
    public void DeleteRepairMalfunction(@Param("element_repair_id") Integer element_repair_id,@Param("malfunction_id" ) Integer malfunction_id);
    public void DeleteElementRepair(@Param("element_repair_id") Integer element_repair_id);
}
