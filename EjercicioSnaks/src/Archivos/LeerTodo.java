package Archivos;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class LeerTodo {
    public static void main(String[] args) {
        String nombreArchivo = "mi_archivo.txt" ;
        try {
            //leer todas la lineas de una vez
            List<String> lineas = Files.readAllLines(Paths.get(nombreArchivo));
            System.out.println("Contenido del archivo: ");
            //for (String linea : lineas) {
            //    System.out.println(linea);
            //}
            lineas.forEach(System.out::println); //en lambda

        }catch (Exception e) {
            System.out.println("Error al leer el archivo" + e.getMessage());
            e.printStackTrace();
        }
    }
}
