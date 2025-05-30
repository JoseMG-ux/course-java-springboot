package com.course.spring.app1.springboot_application.controllers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.course.spring.app1.springboot_application.models.Employees;
import com.course.spring.app1.springboot_application.models.dto.ClassDTO;

@RestController // Handler rest
@RequestMapping("/api") // Base URL for the controller
public class ExampleRestController {

    @GetMapping(path = "/details_info2") // Mapeo
    // @RequestMapping(path = "/details_info2", method = RequestMethod.GET) //
    // Optional, can be used to specify a different path
    public ClassDTO details_info2() {
        ClassDTO user1 = new ClassDTO();

        // Employees employee = new Employees(1, "John", "Doe", "123 Main St",
        // "Developer", 30);

        // Map<String, Object> response = new HashMap<>();
        // response.put("Datos de empleado", employee);

        user1.setTitle("Admin");
        user1.setUser("John Doe");

        return user1;
    }
}