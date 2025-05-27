package com.course.spring.app1.springboot_application.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ExampleController {

    @GetMapping("/details_info")
    public String info(Model model) {

        model.addAttribute("title", "Details Information");
        model.addAttribute("description", "This is a detailed information page.");
        model.addAttribute("author", "John Doe");
        model.addAttribute("version", "1.0.0");
        
        return "details_info";
    }


}










