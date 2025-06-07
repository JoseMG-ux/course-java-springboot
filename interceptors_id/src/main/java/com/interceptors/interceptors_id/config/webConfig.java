package com.interceptors.interceptors_id.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration // Anotación que indica que esta clase es una configuración de Spring
public class webConfig implements WebMvcConfigurer { // WebMvcConfigurer es una interfaz que permite personalizar la configuración de nuestras aplicaciones: Vistas, Interceptores, manejo de recursos estaticos, etc.

    public void addInterceptors(InterceptorRegistry registry) { // InterceptorRegistry pertenece a WebMcv..., Método que permite registrar interceptores personalidados en nuestra aplicacion

        // Interceptor: Un componente que permite ejecutar la logica de negocio antes o después de que se procese una solicitud HTTP.

        registry.addInterceptor(new TimeInterceptor()); //Time
    }
}


//Cuando utilizar interceptores?
// Los interceptores son útiles cuando necesitamos realizar acciones antes o después de que se procese una solicitud HTTP, como medir el tiempo de ejecución, autenticar usuarios, registrar solicitudes, etc. Se pueden utilizar para agregar lógica común a múltiples controladores sin duplicar código.