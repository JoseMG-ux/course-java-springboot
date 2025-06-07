package com.files.exceptions.spring_file_exceptions.Controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.files.exceptions.spring_file_exceptions.Services.FileContent;

@RestController
@RequestMapping("/file")
public class FileController {

    private final FileContent fileContent; // Inyección de dependencias del servicio FileContent

    public FileController(FileContent fileContent) {
        this.fileContent = fileContent;
    }

    @GetMapping("/read")
    public ResponseEntity<String> readFile(@RequestParam String filePath) {
        try {
            String file = fileContent.FileRead(filePath); // Llama al método FileRead del servicio FileContent
            if (file == null || file.isEmpty()) {
                //Leer el contenido del archivo y verificar si está vacío
                return ResponseEntity
                        .status(HttpStatus.NOT_FOUND) // Devuelve un error HTTP 404 si el archivo está vacío
                        .body("El archivo está vacío o no existe: " + filePath);
            }
            
            return ResponseEntity.ok(file); // Devuelve el contenido del archivo como respuesta HTTP 200 OK
        } catch (RuntimeException e) {
            return ResponseEntity
                    .status(HttpStatus.INTERNAL_SERVER_ERROR) // Devuelve un error HTTP 500
                    .body("Error al leer el archivo: " + e.getMessage()); // Devuelve un error HTTP 500 con el mensaje de error
        }
    }
}