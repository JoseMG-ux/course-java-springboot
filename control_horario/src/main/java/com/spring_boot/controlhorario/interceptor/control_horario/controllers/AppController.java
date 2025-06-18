package com.spring_boot.controlhorario.interceptor.control_horario.controllers;

import java.util.HashMap;
import java.util.Map;
import java.util.Date;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/api")
public class AppController {
    
    @GetMapping("/index")
    public ResponseEntity<?> index(HttpServletRequest request) { //<?>: Tipo genérico, puede ser cualquier tipo de objeto
        Map<String, Object> data = new HashMap<>();
        data.put("title", "Sistema de control de acceso");

        data.put("hour", new Date());
        data.put("message", request.getAttribute("message"));
        
        return ResponseEntity.ok(data);
    }
}