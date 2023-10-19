package org.example.primera_evaluacion.numero_aleatorio;

import java.io.*;
import java.util.Scanner;

public class ProcesoMain {
    static File file = new File(".\\src\\main\\java\\org\\example\\primera_evaluacion\\numero_aleatorio\\num_ramdom.txt");

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int contIntentos = 5;

        while (contIntentos != 0){
            System.out.println("Introduce un numero: " + "(" + contIntentos + " intentos restantes)");
            contIntentos--;
            int numero;

            //Recoger por teclado la elección nuestra.
            numero = sc.nextInt();


            ProcessBuilder pb = new ProcessBuilder("java", "ProcesoMaquina.java");
            pb.directory(new File(".\\src\\main\\java\\org\\example\\primera_evaluacion\\numero_aleatorio"));
            Process p = pb.start();

            //Enviar al proceso hijo información:
            PrintStream ps = new PrintStream(p.getOutputStream());
            ps.println(numero);
            ps.flush();

            //Recoger la salida que nos envía el proceso hijo:
            InputStreamReader in = new InputStreamReader(p.getInputStream());
            BufferedReader br = new BufferedReader(in);
            String salida = br.readLine();

            System.out.println(salida);
                if (salida.equals("Enorabuena!!! Has acertado el numero")){
                    contIntentos = 0;
                }
        }

        }

}
