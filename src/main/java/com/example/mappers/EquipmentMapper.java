package com.example.mappers;

import com.example.entity.Equipment;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface EquipmentMapper {

    public List<Equipment> GetEquipmentByType(@Param("category_type") String category_type);

}
