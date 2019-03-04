package com.example.mappers;

import com.example.entity.Element_Maintain;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface Element_MaintainMapper {
    public List<Element_Maintain> GetElementMaintainByElementId(@Param("equipment_element_id") Integer equipment_element_id);
    public void AddElementMaintain(Element_Maintain element_maintain);
    public void DeleteElementMaintain(@Param("element_maintain_id") Integer element_maintain_id);
}
