package com.example.mappers;

import com.example.entity.Malfunction;
import com.example.entity.Reason;
import com.example.entity.Solution;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface MalfunctionMapper {

    public Malfunction GetMalfunctionById(@Param("malfunction_id") Integer malfunction_id);
    public List<Malfunction> GetMalfunctionByElementId(@Param("element_id") Integer element_id);
    public List<Malfunction> GetMalfunctionByCategoryId(@Param("category_id") Integer category_id);
    public List<Reason> GetMalfunctionReason(@Param("malfunction_id") Integer malfunction_id);
    public List<Solution> GetMalfunctionSolution(@Param("malfunction_id") Integer malfunction_id);

    public void AddMalfunction(Malfunction malfunction);
    public void AddMalfunctionReason(Reason reason);
    public void AddMalfunctionSolution(Solution solution);

    public void ModifyMalfunction(Malfunction malfunction);
    public void ModifyMalfunctionReason(Reason reason);
    public void ModifyMalfunctionSolution(Solution solution);

    public void DeleteMalfunction(@Param("malfunction_id") Integer malfunction_id);
    public void DeleteMalfunctionReason(@Param("reason_id") Integer reason_id);
    public void DeleteMalfunctionSolutin(@Param("solution_id") Integer solution_id);
}
