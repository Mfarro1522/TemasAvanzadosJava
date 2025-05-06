package Archivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class leerArchivos {
    public static void main(String[] args) {
        //leer archivo
        String nombreArchivo = "mi_archivo.txt";
        File archivo = new File(nombreArchivo);

        try {
            System.out.println("Contenido del archivo: ");
            //el objeto bufferedReader nos ayuda a leer las lineas completas del archivo
            BufferedReader entrada = new BufferedReader(new FileReader(archivo)); //por q solo con file reader no lee la lineas completas
            //leemos linea a linea el archivo
            String linea = entrada.readLine();
            //leemos todas la lineas
            while (linea != null) {
                 System.out.println(linea);
                 linea = entrada.readLine();
            }
            //cerrar archivo
            entrada.close();

        } catch (Exception e ){
            System.out.println("error en el archivo" + e.getMessage());
        }
    }
}
