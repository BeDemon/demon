package com.example.mappers;

import com.example.entity.Equipment;
import com.example.entity.Scheme_Equipment;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface EquipmentMapper {

    public List<Equipment> GetEquipmentByType(@Param("category_type") String category_type);

    public Integer GetSchemeEquipment(Scheme_Equipment scheme_equipment);

    public List<Scheme_Equipment> GetSchemeEquipmentBySchemeId(Integer scheme_id);

    public void AddSchemeEquipment(Scheme_Equipment scheme_equipment);

}
