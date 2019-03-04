package com.example.mappers;

import com.example.entity.Element;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ElementMapper {

    public List<Element> GetAllElement();
    public List<Element> GetElementByName(@Param("element_name")String element_name);
    public List<Element> GetElementByCategoryId(@Param("category_id")Integer category_id);
    public Element GetElementByElementId(Integer element_id);
    public void AddElement(Element element);

}
