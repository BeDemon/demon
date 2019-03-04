package com.example.mappers;

import com.example.entity.Army;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArmyMapper {
    public List<Army> GetAllArmy();
    public Integer GetArmyCount();
    public Army GetArmyById(Integer army_id);
    public Army GetArmyByName(String army_name);
    public void AddArmy(Army army);
}
