package com.course.spring.app1.springboot_application.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.course.spring.app1.springboot_application.models.dto.ParamDTO;

import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/api/params")
public class ResquestParamController {

    @GetMapping("/detail")
    public ParamDTO detail(@RequestParam(required = false, defaultValue = "Mensaje por defecto") String information) {
        ParamDTO param1 = new ParamDTO();
        param1.setInformation(information);

        return param1;
    }
    
}
