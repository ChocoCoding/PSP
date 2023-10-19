package org.example.primera_evaluacion.leer_nombre;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        ProcessBuilder pb = new ProcessBuilder("java", "LeerNombre.java", "Pepe");
        pb.directory(new File("C:\\Users\\34645\\IdeaProjects\\PSP\\src\\main\\java\\org\\example\\primera_evaluacion\\leer_nombre\\"));

        Process p = pb.start();
        //Aquí recogemos la salida que nos dejó nuestro proceso hijo
        BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));

        String line;
        while((line = br.readLine()) != null){
            System.out.println(line);
        }

        //Recogemos la salida del proceso
        System.out.println("El proceso hijo a finalizado con la salida: " + p.waitFor());

        //En caso de que hubiera algún error, lo podemos recoger con la siguiente linea
        BufferedReader brError = new BufferedReader(new InputStreamReader(p.getErrorStream()));
        while((line = brError.readLine()) != null){
            System.out.println(line);
        }

    }
}