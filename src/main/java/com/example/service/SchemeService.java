package com.example.service;

import com.example.entity.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SchemeService {

    public List<Army> RequestArmy();

    //如果添加成功，则返回scheme_id；失败则返回null
    public Integer AddScheme(Scheme scheme);

    public Integer GetLocationID(Integer longitude,Integer a);

    public void AddSchemeArmy(Scheme_Army scheme_army);
}
