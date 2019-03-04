package com.example.mappers;

import com.example.entity.Location;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface LocationMapper {

    public Location GetAllLocationByID(Integer location_id);
    public Integer GetLocationID(Integer longitude,Integer latitude);
    public void AddLocation(Location location);
}
