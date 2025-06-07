package com.interceptors.interceptors_id.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/api")
public class Saludo {

    @GetMapping("/saludo")
    public String Saludar() throws InterruptedException { //InterrupterException para simular un retraso
        
        //Que son los hilos (Thread): Son unidades de ejecución dentro de un proceso. Permiten que múltiples tareas se ejecuten simultáneamente.
        // Que es un Thread.sleep(): Es un método que pausa la ejecución del hilo actual durante un período de tiempo especificado.

        Thread.sleep(1000); // Simula delay de 1 segundo
        return "Hola, bienvenido a la API de Interceptors!";
    }
    
}
