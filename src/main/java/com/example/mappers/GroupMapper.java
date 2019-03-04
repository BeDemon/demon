package com.example.mappers;

import com.example.entity.Group;
import com.example.entity.Task;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface GroupMapper {

    public Group GetGroup(@Param("plan_id") Integer plan_id , @Param("group_name") String group_name);
    public List<Group> GetGroupByPlanId(@Param("plan_id") Integer plan_id);
    public List<Task> GetGroupTask(@Param("group_id") Integer group_id, @Param("task_number") Integer task_number);

    public void AddGroup(Group group);
    public void AddGroupTask(Task task);
    public void ModifyGroupTask(Task task);
    public void DeleteGroupTask(@Param("task_id") Integer task_id);
    public void DeleteGroup(Integer group_id);
}
