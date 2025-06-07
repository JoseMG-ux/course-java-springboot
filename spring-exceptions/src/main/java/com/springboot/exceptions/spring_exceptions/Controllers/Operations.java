package com.springboot.exceptions.spring_exceptions.Controllers;

import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/api/divition")
public class Operations {

    @GetMapping
    public String Divide(@RequestParam(name = "numerador") String numeradorStr,
            @RequestParam(name = "denominador") String denominadorStr) {
        // int value = 20 / 0;
        // return "Resultado: " + value;
        try {
            int numerador = Integer.parseInt(numeradorStr);
            int denominador = Integer.parseInt(denominadorStr);
            int result = numerador / denominador;
            
            return "Resultado: " + result;
        } catch (ArithmeticException e) {
            throw e;
        } catch (NumberFormatException e) {
            throw e;
        }
    }
}

