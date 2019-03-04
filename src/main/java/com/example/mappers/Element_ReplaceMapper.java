package com.example.mappers;

import com.example.entity.Element_Replace;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface Element_ReplaceMapper {

    public List<Element_Replace> GetElementReplaceByElementId(@Param("equipment_element_id") Integer equipment_element_id);

    public void AddElementReplace(Element_Replace element_replace);
    public void DeleteElementReplace(@Param("element_replace_id") Integer element_replace_id);
}
