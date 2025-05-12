package Retos;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Leertxt {
    public static void main(String[] args) {
        String nombreArchivo = "Challenge21.txt";
        try {
            //funcion para leer todo de golpe
            List<String> lineas = Files.readAllLines(Paths.get(nombreArchivo));
            lineas.forEach(System.out::println);

            resolverOperaciones(lineas , "*");
            resolverOperaciones(lineas , "/");
            resolverOperaciones(lineas , "+");
            resolverOperaciones(lineas , "-");

            lineas.forEach(System.out::println);



        }catch (Exception e) {
            System.out.println("Error en la lectura del archivo " + e.getMessage());
            e.printStackTrace();

        }
    }

    public static void resolverOperaciones (List<String> lineas  , String simbolo ) {
        int i = 0 ;
        while (i < lineas.size()) {
            if (lineas.get(i).equals(simbolo)) {
                double a = Double.parseDouble(lineas.get(i-1));
                double b = Double.parseDouble(lineas.get(i+1));
                double result = 0;

                //segun operador
                switch (simbolo) {
                    case "*": result = a * b; break;
                    case "/": result = a / b; break;
                    case "+": result = a + b; break;
                    case "-": result = a - b; break;
                }

                lineas.set(i-1,String.valueOf(result)); // el resultado lo pongo el primeor de los 3 elementos de la lista
                lineas.remove(i); //al borrar 1 no queda ese espacio si no que se corre hacia la izquierda
                lineas.remove(i);

                i=0;//para empezar de nuevo y resolver todas la multiplicaciones priemero
            } else {
                i++;
            }
        }
    }
}
