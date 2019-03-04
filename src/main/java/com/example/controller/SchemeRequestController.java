package com.example.controller;

import com.example.entity.*;
import com.example.service.DepartmentService;
import com.example.service.EquipmentService;
import com.example.service.SchemeService;
import com.example.util.JsonBuilder;
import com.example.util.JsonPaser;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Iterator;
import java.util.List;
import java.util.Map;


@Controller
public class SchemeRequestController {

    @Autowired
    private SchemeService schemeService;
    @Autowired
    private EquipmentService equipmentService;

    @GetMapping("/GetMsg")
    public String GetMsg(@Param("scheme_id") Integer scheme_id ,Model model) {
        model.addAttribute("scheme_id",scheme_id);
        List<Army> army_list = schemeService.RequestArmy();
        if(army_list != null)
        {
            model.addAttribute("army_list",army_list);
        }
        List<Department> department_list = equipmentService.GetDepartment();
        if (department_list != null)
        {
            model.addAttribute("department_list",department_list);
        }
        List<Equipment> equipment_list = equipmentService.GetEquipmentListByType("");
        if (equipment_list != null)
        {
            model.addAttribute("equipment_list",equipment_list);
        }
        List<Category> category_list = equipmentService.GetCategoryByType("");
        if (category_list != null)
        {
            model.addAttribute("category_list",category_list);
        }

        return "edit_step";
    }
    @GetMapping("/GetArmyMsg")
    public String GetArmyMsg(Model model) {
        List<Army> army_list = schemeService.RequestArmy();
        if(army_list != null)
        {
            model.addAttribute("army_list",army_list);
        }
        return "edit";
    }
    @GetMapping("/head")
    public String GetHead() {
        return "head";
    }
    @GetMapping("/left")
    public String GetLeft() {
        return "left";
    }
    @GetMapping("/next")
    public String GetNext() {
        return "edit_step";
    }
}