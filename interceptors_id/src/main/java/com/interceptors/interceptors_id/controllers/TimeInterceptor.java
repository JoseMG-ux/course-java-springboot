package com.interceptors.interceptors_id.controllers;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

//Que es jakarta: Jakarta EE es una plataforma de desarrollo de aplicaciones empresariales basada en Java. Proporciona un conjunto de especificaciones y APIs para construir aplicaciones robustas y escalables.

public class TimeInterceptor implements HandlerInterceptor {

    // Analiza la consulta del usuario antes de enviar al controlador
    private static final String START_TIME = "Inicio de la consulta";

    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        long startTime = System.currentTimeMillis(); // Captura el tiempo de inicio de la consulta
        request.setAttribute(START_TIME, startTime); // Almacena el tiempo de inicio en los atributos de la solicitud

        return true; // Permite que la solicitud continúe hacia el controlador
    }

    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        // Calcular el tiempo transcurrido desde el inicio de la consulta
        long startTime = (long) request.getAttribute(START_TIME); // Recupera el tiempo de inicio de los atributos de la solicitud
        long endtime = System.currentTimeMillis() - startTime; // Captura el tiempo actual

        System.out.println("Tiempo de ejecucion:" + endtime + "ms para URL" + request.getRequestURI()); // Imprime el tiempo de ejecución en la consola
    }
}
