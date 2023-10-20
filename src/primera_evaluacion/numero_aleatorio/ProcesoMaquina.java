package primera_evaluacion.numero_aleatorio;

import java.io.*;
import java.lang.reflect.Field;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProcesoMaquina {

    public static void main(String[] args) throws IOException {
        String numIntroducido = "";
        int numeroAleatorio = (int)(Math.random()*101);

        //Recoger la información que el proceso padre dejó en memoria:
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(in);
        numIntroducido = br.readLine();


        if (Integer.parseInt(numIntroducido) > numeroAleatorio){
            System.out.println(numIntroducido + " es Mayor que el numero");
        } else if (Integer.parseInt(numIntroducido) < numeroAleatorio) {
            System.out.println(numIntroducido + " es Mayor que el numero");
        }else if (Integer.parseInt(numIntroducido) == numeroAleatorio){
            System.out.println("Enorabuena!!! Has acertado el numero");
        }
    }


 /*   public static int guardarNumeroAleatorio() throws IOException {
        File file = new File(".\\src\\main\\java\\org\\example\\primera_evaluacion\\numero_aleatorio\\num_ramdom.txt");
        file.createNewFile();
        if (file.length()==0){
            FileWriter fw = new FileWriter(file);
            int numeroAleatorio = (int) (Math.random() * 101);
            fw.write(numeroAleatorio);
            fw.close();
            return numeroAleatorio;
        }else {
            BufferedReader br = new BufferedReader(new FileReader(file));
            int numero = br.read();
            br.close();
            return numero;
        }
    }*/


}
