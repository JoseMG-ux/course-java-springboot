package com.spring_boot.controlhorario.interceptor.control_horario.interceptors;

import java.util.Calendar;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class Calendar_interceptor implements HandlerInterceptor {

    @Value("${config.calendar.open}")
    private int open;
    @Value("${config.calendar.close}")
    private int close;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {
        Calendar calendar = Calendar.getInstance();
        int hour = calendar.get(Calendar.HOUR_OF_DAY);

        if (hour >= open && hour < close) {
            StringBuilder message = new StringBuilder("Bienvenido al sistema de control de acceso. ");
            message.append("El horario de atención es desde las: ")
                    .append(open)
                    .append("AM")
                    .append("Hasta las: ")
                    .append(close)
                    .append("PM")
                    .append("Gracias por su visita.");
            request.setAttribute("message", message.toString());
            return true; // El horario es correcto y se permite el acceso
        } return false; // El horario no es correcto, se deniega el acceso
    }
}
