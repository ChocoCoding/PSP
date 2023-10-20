package primera_evaluacion.leer_nombres_v2;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {

        //Creamos proceso
        ProcessBuilder pb = new ProcessBuilder("java","primera_evaluacion.leer_nombres_v2.LeerNombre");

        //Establecemos el directorio donde esta nuestro proceso hijo
        pb.directory(new File(".\\out/production/PSP/"));

        //Iniciamos el proceso
        Process p = pb.start();

        String line;

        PrintStream ps = new PrintStream(p.getOutputStream());

        BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));

        Scanner sc = new Scanner(System.in);

        String nombre = "";

        while (!nombre.equals("salir")){
            System.out.println("Nombre: ");
            nombre = sc.nextLine();
            //Enviamos el nombre a la memoria compartida
            ps.println(nombre);
            //Enviamos la informacion de la memoria compartida al hijo
            ps.flush();

            if ((line = br.readLine()) != null){
                System.out.println(line);
            }
        }
        int codigo = p.waitFor();

        if (codigo == 0){
            System.out.println("Saliendo del programa...");
        }
    }
}
