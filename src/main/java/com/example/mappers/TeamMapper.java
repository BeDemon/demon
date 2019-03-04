package com.example.mappers;

import com.example.entity.Task;
import com.example.entity.Team;
import com.example.entity.Team_Category;
import com.example.entity.Team_Department;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface TeamMapper {

    public Team GetTeam(@Param("group_id") Integer group_id,@Param("team_name") String team_name);
    public List<Team> GetTeamByGroupId(@Param("group_id") Integer group_id);
    public Integer GetDepartmentNumber(@Param("team_id") Integer team_id,@Param("department_id") Integer department_id);
    public Integer GetCategoryNumber(@Param("team_id") Integer team_id,@Param("category_id") Integer category_id);
    public List<Task> GetTeamTask(@Param("team_id") Integer team_id,@Param("task_number") Integer task_number);

    public void AddTeam(Team team);
    public void AddDepartNumber(Team_Department team_department);
    public void AddCategoryNumber(Team_Category team_category);
    public void AddTeamTask(Task task);

    public void ModifyDepartmentNumber(@Param("team_id") Integer team_id,@Param("department_id") Integer department_id,@Param("people_number") Integer people_number);
    public void DeleteDepartment(@Param("team_id") Integer team_id,@Param("department_id") Integer department_id);
    public void ModifyCategoryNumber(@Param("team_id") Integer team_id,@Param("category_id") Integer category_id,@Param("category_number") Integer category_number);
    public void DeleteCategory(@Param("team_id") Integer team_id,@Param("category_id") Integer category_id);
    public void ModifyTeamTask(Task task);
    public void DeleteTeamTask(@Param("task_id") Integer task_id);

    public void DeleteTeam(@Param("team_id") Integer team_id);

}
