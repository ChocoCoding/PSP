package primera_evaluacion.leer_nombres_v2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LeerNombre {
    public static void main(String[] args) throws IOException {
        String line;

        while (true){
            //Recibe el nombre
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            //Recoge el nombre en una variable
            line = br.readLine();
            //Devuelve el nombre

            //Si el nombre es salir que salga
            if (line.equalsIgnoreCase("salir")){
                System.exit(0);
            }
            System.out.println(line);
        }


    }
}
