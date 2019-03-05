package com.example.mappers;

import com.example.entity.*;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface PlanMapper {
    public Scheme GetSchemeByPlanId(Integer plan_id);
    public List<Plan> GetPlanBySchemeId(Integer scheme_id);
    public Integer GetPlan(Plan plan);
    public Integer GetGroup(Group group);
    public Integer GetTeam(Team team);
    public Integer GetTeamDepartment(Team_Department team_department);
    public Integer GetTeamCategory(Team_Category team_category);


    public void AddPlan(Plan plan);
    public void AddGroup(Group group);
    public void AddTeam(Team team);
    public void AddTeamDepartment(Team_Department team_department);
    public void AddTeamCategory(Team_Category team_category);

    public void ModifyTeamDepartment(Team_Department team_department);
    public void ModifyTeamCategory(Team_Category team_category);

}
