package com.example.controller;

import com.example.entity.*;
import com.example.service.EquipmentService;
import com.example.service.SchemeService;
import com.example.util.JsonPaser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/rest-api")
public class SchemeResponseController {

    @Autowired
    private SchemeService schemeService;

    @Autowired
    private EquipmentService equipmentService;

    JsonPaser jsonPaser = new JsonPaser();

    @ResponseBody
    @RequestMapping(value = "/AddSchemeMsg", method = {RequestMethod.POST}, produces = "application/json;charset=UTF-8")
    public String AddScheme(@RequestBody String jsonStr) {
        System.out.println(jsonStr);
        Scheme scheme = jsonPaser.ParseScheme(jsonStr);
        scheme.setScheme_name("方案");
        Location location = jsonPaser.ParseLocation(jsonStr);
        Integer locationID= schemeService.GetLocationID(location.getLongitude(),location.getLongitude());

        scheme.setLocation_id(locationID);
        Integer scheme_id = schemeService.AddScheme(scheme);

        if(scheme_id == null)
        {
            System.out.println("error");
            throw new AssertionError("任务代号已存在");
        }
        else
        {
            List<Scheme_Army> list = jsonPaser.ParseSchemeArmy(jsonStr);
            for (int i=0;i<list.size();i++)
            {
                Scheme_Army scheme_army = list.get(i);
                scheme_army.setScheme_id(scheme_id);
                schemeService.AddSchemeArmy(scheme_army);
            }
            System.out.println("success");
            return "{\"scheme_id\":"+scheme_id+"}";
        }
    }

    @ResponseBody
    @RequestMapping(value = "/AddPlanMsg", method = {RequestMethod.POST}, produces = "application/json;charset=UTF-8")
    public String AddPlan(@RequestBody String jsonStr) {
        System.out.println(jsonStr);
        Plan plan = jsonPaser.ParsePlan(jsonStr);
        List<Integer> integer_list = jsonPaser.ParseSchemeEquipment(jsonStr);
        if (plan.getScheme_id() == null || plan.getScheme_id() == 0)
        {
            System.out.println("error");
            throw new AssertionError("方案不存在！");
        }
        else {


            String str =  schemeService.AddPlanMsg(plan);
            if (str.equals("Success"))
            {
                List<Scheme_Equipment> scheme_equipment_list = new ArrayList<>();
                for (int i=0;i<integer_list.size();i++)
                {
                    Scheme_Equipment scheme_equipment = new Scheme_Equipment(plan.getScheme_id(),integer_list.get(i));
                    scheme_equipment_list.add(scheme_equipment);
                }
                equipmentService.AddSchemeEquipment(scheme_equipment_list);
                return "Success";
            }
            else
                return "Error2";

        }
    }
}
