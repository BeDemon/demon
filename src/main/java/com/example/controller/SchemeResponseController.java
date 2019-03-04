package com.example.controller;

import com.example.entity.Location;
import com.example.entity.Scheme;
import com.example.service.SchemeService;
import com.example.util.JsonPaser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/rest-api")
public class SchemeResponseController {

    @Autowired
    private SchemeService schemeService;
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
            System.out.println("success");
            return "{\"scheme_id\":"+scheme_id+"}";
        }
    }


}