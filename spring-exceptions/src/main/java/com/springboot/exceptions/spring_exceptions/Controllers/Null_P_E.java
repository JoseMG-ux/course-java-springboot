package com.springboot.exceptions.spring_exceptions.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Null_P_E {
    
    @GetMapping("nullvalue") 
    public String Null() {
        String Nullvalue = null;
        Nullvalue.length(); // Esto lanzará una NullPointerException
        
        return "Dato null";
    }
}
