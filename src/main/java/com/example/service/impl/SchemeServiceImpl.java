package com.example.service.impl;

import com.example.entity.*;
import com.example.mappers.*;
import com.example.service.SchemeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
    public class SchemeServiceImpl implements SchemeService {
    @Autowired
    private ArmyMapper armyMapper;
    @Autowired
    private SchemeMapper schemeMapper;
    @Autowired
    private LocationMapper locationMapper;
    @Autowired
    private PlanMapper planMapper;
    @Autowired
    @Override
    public List<Army> RequestArmy() {

        return armyMapper.GetAllArmy();
    }

    @Override
    public Integer AddScheme(Scheme scheme) {
        Scheme scheme1 = schemeMapper.GetSchemeBySchemeCode(scheme.getScheme_code());
        if (scheme1 != null)
        {
            return null;
        }
        else
        {
            schemeMapper.AddScheme(scheme);
            return schemeMapper.GetSchemeBySchemeCode(scheme.getScheme_code()).getScheme_id();
        }
    }

    @Override
    public Integer GetLocationID(Integer longitude, Integer latitude) {
        Integer locationID = locationMapper.GetLocationID(longitude,latitude);
        if (locationID != null)
            return locationID;
        else
        {
            Location location = new Location(null,longitude,latitude);
            locationMapper.AddLocation(location);
            locationID = locationMapper.GetLocationID(longitude,latitude);
            return locationID;
        }
    }

    @Override
    public void AddSchemeArmy(Scheme_Army scheme_army) {
        Scheme_Army schemeArmy = schemeMapper.GetSchemeArmyNumber(scheme_army);
        if (schemeArmy != null)
        {
            schemeMapper.ModifySchemeArmy(scheme_army);
        }
        else
        {
            schemeMapper.AddSchemeArmy(scheme_army);
        }
    }

    @Override
    public Scheme GetSchemeIdByPlanId(Integer plan_id) {
        return planMapper.GetSchemeByPlanId(plan_id);
    }

    @Override
    public String AddPlanMsg(Plan plan) {
        Integer plan_id = planMapper.GetPlan(plan);
        if (plan_id == null || plan_id == 0)
        {
            planMapper.AddPlan(plan);

            plan_id = planMapper.GetPlan(plan);
            plan.setPlan_id(plan_id);
            List<Group> group_list = plan.getGroup_list();
            for (int i=0;i<group_list.size();i++)
            {
                Group group = group_list.get(i);
                group.setPlan_id(plan.getPlan_id());
                planMapper.AddGroup(group);
                Integer group_id = planMapper.GetGroup(group);
                List<Team> team_list = group.getTeam_list();
                for (int j=0;j<team_list.size();j++)
                {
                    Team team = team_list.get(j);
                    team.setGroup_id(group_id);
                    planMapper.AddTeam(team);
                    Integer team_id = planMapper.GetTeam(team);
                    team.setTeam_id(team_id);

                    List<Team_Department> team_department_list = team.getTeam_department_list();
                    for(int k=0;k<team_department_list.size();k++)
                    {
                        Team_Department team_department = team_department_list.get(k);
                        team_department.setTeam_id(team_id);
                        Integer department_people = planMapper.GetTeamDepartment(team_department);
                        if (department_people == null||department_people ==0)
                        {
                            planMapper.AddTeamDepartment(team_department);
                        }
                        else {
                            planMapper.ModifyTeamDepartment(team_department);
                        }
                    }
                    List<Team_Category> team_category_list= team.getTeam_category_list();
                    for (int k=0;k<team_category_list.size();k++)
                    {
                        Team_Category team_category = team_category_list.get(k);
                        team_category.setTeam_id(team_id);
                        Integer category_number = planMapper.GetTeamCategory(team_category);
                        if (category_number == null || category_number == 0)
                        {
                            planMapper.AddTeamCategory(team_category);
                        }
                        else {
                            planMapper.ModifyTeamCategory(team_category);
                        }
                    }
                }

            }

            return "Success";
        }
        else {
            return "{\"Error\"}";
        }

    }

}
