package Archivos;

import java.io.File; //io significa input output
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Archivos {

    public static void main(String[] args) {

        String nombreArchivo = "mi_archivo.txt";
        File archivo = new File(nombreArchivo);

        try{ //tiene que ir tru catch
            if(archivo.exists()){
                System.out.println("PAPI El archivo ya existe!");
            } else {
                //creamos el Archivo
                PrintWriter salida = new PrintWriter(new FileWriter(nombreArchivo)); //genera un psible error
                //se guarda el archivo en el disco
                salida.close();
                System.out.println("El archivo se ha guardado correctamente");
            }
        } catch (IOException e) {
            System.out.println("No se pudo abrir el archivo :"+e.getMessage());
            e.printStackTrace(); //con esto se muetra el detalle del error;
        }


    }

}
