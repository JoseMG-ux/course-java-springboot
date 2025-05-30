package com.course.spring.app1.springboot_application.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.course.spring.app1.springboot_application.models.Employees;

@Controller
public class ExampleController {

    @GetMapping("/details_info")
    public String info(Model model) {

        Employees employee = new Employees(1, "John", "Doe", "Panama", "Developer", 30);

        model.addAttribute("title", "Información del Colaborador");
        model.addAttribute("employee", employee);

        return "details_info";
    }

    @ModelAttribute("Employees")
    public List<Employees> EmployeesList() {
        return Arrays.asList(
                new Employees(1, "Nombre1", "Apellido1", "Panama1", "Developer", 21),
                new Employees(2, "Nombre2", "Apellido2", "Panama2", "Developer", 22),
                new Employees(3, "Nombre3", "Apellido3", "Panama3", "Developer", 23),
                new Employees(4, "Nombre4", "Apellido4", "Panama4", "Developer", 24));
    }
}