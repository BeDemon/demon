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

}
