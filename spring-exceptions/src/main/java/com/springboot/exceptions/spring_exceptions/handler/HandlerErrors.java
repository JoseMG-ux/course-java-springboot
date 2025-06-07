package com.springboot.exceptions.spring_exceptions.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


/**
 * Clase HandlerErrors que maneja excepciones globales en la aplicación Spring.
 * Utiliza la anotación @ControllerAdvice para capturar y gestionar excepciones específicas
 * lanzadas en los controladores, devolviendo respuestas personalizadas al cliente.
 *
 * Maneja los siguientes tipos de excepciones:
 * - ArithmeticException: Por ejemplo, cuando ocurre una división por cero.
 * - NumberFormatException: Cuando un valor no puede convertirse a un número.
 * - NullPointerException: Cuando se intenta acceder o manipular un objeto que es null.
 *
 * El método handleNullPointerException captura los errores inesperados relacionados con referencias nulas,
 * devolviendo un mensaje genérico y un código de estado HTTP 500 (INTERNAL_SERVER_ERROR).
 */


@ControllerAdvice // Esta anotación permite manejar excepciones de manera global en la aplicación
public class HandlerErrors {

    @ExceptionHandler(ArithmeticException.class) // Maneja excepciones de tipo ArithmeticException
    public ResponseEntity<String> handleArithmeticException(ArithmeticException e) {
        // Aquí puedes registrar el error o realizar alguna acción adicional
        return new ResponseEntity<>("Error: División por 0 no permitida.", HttpStatus.BAD_REQUEST); // Retorna un mensaje de error personalizado
    }

    @ExceptionHandler(NumberFormatException.class) // Maneja excepciones de tipo NumberFormatException
    public ResponseEntity<String> handleNumberFormatException(NumberFormatException e) {
        // Aquí puedes registrar el error o realizar alguna acción adicional
        return new ResponseEntity<>("Error: El valor ingresado no es numerico.", HttpStatus.BAD_REQUEST); // Retorna un mensaje de error personalizado
    }
    
    @ExceptionHandler(NullPointerException.class) // Maneja excepciones de tipo NullPointerException
    public ResponseEntity<String> handleNullPointerException(NullPointerException e) {
        // Aquí puedes registrar el error o realizar alguna acción adicional
        return new ResponseEntity<>("Error: El valor del dato ingreso es Null.", HttpStatus.INTERNAL_SERVER_ERROR); // Retorna un mensaje de error personalizado
    }

}
