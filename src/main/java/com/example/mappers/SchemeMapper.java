package com.example.mappers;

import com.example.entity.Equipment;
import com.example.entity.Scheme;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface SchemeMapper {

    public Scheme GetSchemeBySchemeName(String scheme_name);
    public Scheme GetSchemeBySchemeCode(String scheme_Code);
    public List<Equipment> GetSchemeEquipment(@Param("scheme_id")Integer scheme_id,@Param("currentNumber") int currentNumber, @Param("pageNumber")int pageNumber);
    public Scheme GetSchemeBySchemeID(Integer scheme_id);

    public void AddScheme(Scheme scheme);
    public void AddSchemeEquipment(@Param("scheme_id") Integer scheme_id,@Param("equipment_id") Integer equipment_id);

    public void ModifyScheme(Scheme scheme);
    public void DeleteSchemeEquipment(@Param("scheme_id") Integer scheme_id,@Param("equipment_id") Integer equipment_id);
    public void DeleteScheme(@Param("scheme_id") Integer scheme_id);
}
