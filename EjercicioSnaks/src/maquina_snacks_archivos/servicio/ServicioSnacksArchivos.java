package maquina_snacks_archivos.servicio;

import maquina_snacks_archivos.dominio.Snack;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ServicioSnacksArchivos implements IServicioSnacks{

    private final String NOMBRE_ARCHIVO = "Snacks.txt";
    //creamos la lista de Snacks
    private List<Snack> snacks = new ArrayList<>();

    //constructor clase
    public ServicioSnacksArchivos(){
        //creamos en caso no exista el archivo
        File archivo = new File(NOMBRE_ARCHIVO); //variable de nuestro archivo
        boolean existe = false;
        //para enlazarlo tenemos primero que comprovar que exista tal archivo
        try {
            existe = archivo.exists();
            if (existe){ //en caso existe lo inicializamos
                this.snacks = obtenerSnacks();
            } else { //en caso no , lo creamos
                PrintWriter Salida = new PrintWriter(archivo); //crea el archivo
                Salida.close();//guarda el archivo en el disco
                System.out.println("Se ha creado el archivo");
            }

        } catch (Exception e ) {
             System.out.println("Error al crear el archivo " + NOMBRE_ARCHIVO + ": " + e.getMessage());
        }

        if (!existe) { //como no existe tenemos que agregarle algo de info
            cargarSnacksInciales();
        }


    }

    private void cargarSnacksInciales() {
        this.agregarSnack(new Snack("Papa",3));
        this.agregarSnack(new Snack("Jugo",4));
        this.agregarSnack(new Snack("Keke",2));
    }

    private List<Snack> obtenerSnacks() {
        ArrayList<Snack> snacks = new ArrayList<>();
        try {
            List<String> lineas = Files.readAllLines(Paths.get(NOMBRE_ARCHIVO));
            for (String linea : lineas) {
                String [] lineaSnack = linea.split(","); //Parseo separado por una coma
                int idSnack = Integer.parseInt(lineaSnack[0]); // igual no se usa
                String nombre = lineaSnack[1];
                double precio = Double.parseDouble(lineaSnack[2]);
                Snack snack = new Snack(nombre , precio );
                snacks.add(snack); //Agregamos lo que leemos
            }
        }catch (Exception e) {
            System.out.println("Error al leer el archivo snacks" + e.getMessage());
        }
        return snacks; //en esta parte es la normal la que va al la memoria
    }

    @Override
    public void agregarSnack(Snack snack) {
        //Agregamos los nuevos Snacks
        //1.Se guarda en Memoria
        this.snacks.add(snack);
        //2.Se guarda en el Archivo
        this.agregarSnackArchivo(snack);
    }

    private void agregarSnackArchivo(Snack snack) {
        boolean anexar = false;
        File archivo = new File(NOMBRE_ARCHIVO);
        try {
            anexar = archivo.exists();
            PrintWriter Salida = new PrintWriter(new FileWriter(archivo , anexar));
            Salida.println(snack.escribirSnack());
            Salida.close(); //cerramos flujo para q se escriva en el archivo

        }catch (Exception e) {
            System.out.println("Error al Anexar el archivo " + NOMBRE_ARCHIVO + ": " + e.getMessage());
        }
    }



    @Override
    public void mostrarSnacks() {
        System.out.println("----- Snacks en el inventario -----");
        //mostramos la lista de Snacks en el archivo
        String inventarioSnacks = "";

        for (Snack snack : this.snacks) {
            inventarioSnacks += snack.toString() + "\n";
        }
        System.out.println(inventarioSnacks);
    }

    @Override
    public List<Snack> getSnacks() {
        return this.snacks;
    }
}
