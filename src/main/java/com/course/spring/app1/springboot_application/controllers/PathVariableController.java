package com.course.spring.app1.springboot_application.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.course.spring.app1.springboot_application.models.Employees;
import com.course.spring.app1.springboot_application.models.dto.ParamDTO;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController //defino controlador
@RequestMapping("/api/variable")

public class PathVariableController {
    @GetMapping("/page1/{message}")
    public ParamDTO page1(@PathVariable String message) {
        ParamDTO param1 = new ParamDTO();
        param1.setInformation(message);
        return param1;
    }

    @PostMapping("/consult")
    public Employees createEmployee(@RequestBody Employees employee) {
        return employee;
    }
    
}
