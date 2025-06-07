package com.files.exceptions.spring_file_exceptions.Services;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
public class FileContent {

    public String FileRead(String filePath) {
        // Simulador de un lector de archivos
        // Este método recibe una ruta de archivo y devuelve su contenido como String
        try {
            Path route = Paths.get(filePath); //convertir la ruta de archivo a un objeto Path
            return Files.readString(route); //leer el contenido del archivo
        } catch (IOException e) {
            throw new RuntimeException("Error en la lectura de archivo: " + filePath, e);
        }
    }
}
