package Archivos;

import javax.swing.*;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

/* public FileWriter(File file,boolean append)
 * Construye un objeto FileWriter dado un objeto File. Si el segundo argumento es verdadero,
 * los bytes se escribirán al final del archivo en lugar de al principio.
 * */

public class AgregarContenidoArchivo {
    public static void main(String[] args) {
        boolean anexar = false; //x comprobar que el archivo existe no sobreescribamos
                                // la informacion (que ya estaba) si no que la anexemos
        String nombreArchivo = "mi_archivo.txt";
        File archivo = new File(nombreArchivo);

        try {
            //revisar si existe el archivo :
            anexar = archivo.exists();
            PrintWriter salida = new PrintWriter(new FileWriter(archivo , anexar)); //explicacion arriba
            String nuevoContenido = "Nuevo\nContenido";
            salida.println(nuevoContenido);
            salida.close(); //siempre serrar cualquier flujo q se abre
            System.out.println("Contenido agregado correctamente");

        } catch (Exception e ){
            System.out.println("Error al escribir el archivo" + e.getMessage());
            e.printStackTrace();
        }



    }
}
