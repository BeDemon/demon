package com.example.mappers;

import com.example.entity.Environment;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EnvironmentMapper {

    public List<Environment> GetAllEnvironment(@Param("currentNumber") int currentNumber, @Param("pageNumber")int pageNumber);
    /*
    * location_id : 位置id，month：月份
    * */
    public List<Environment> GetEnvironment(Integer location_id,Integer month_time);

    public void AddEnvironment(Environment environment);

    public void ModifyEnvironment(Environment environment);
}
