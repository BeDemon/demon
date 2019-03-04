package com.example.mappers;

import com.example.entity.Plan;
import com.example.entity.Task;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface PlanMapper {

    public List<Plan> GetAllPlan();
    public Plan GetPlan(@Param("scheme_id") Integer scheme_id,@Param("plan_name") String plan_name);
    public List<Plan> GetPlanBySchemeId(@Param("scheme_id") Integer scheme_id);
    public List<Task> GetPlanTask(@Param("plan_id") Integer plan_id, @Param("task_number") Integer task_number);

    public void AddPlan(Plan plan);
    public void AddPlanTask(Task task);
    public void ModifyPlanTask(Task task);
    public void DeletePlanTask(@Param("task_id") Integer task_id);
    public void DeletePlan(Integer plan_id);
}
