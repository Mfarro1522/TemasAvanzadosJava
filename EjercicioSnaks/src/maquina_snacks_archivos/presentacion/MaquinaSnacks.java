package maquina_snacks_archivos.presentacion;

import maquina_snacks_archivos.dominio.Snack;
import maquina_snacks_archivos.servicio.IServicioSnacks;
import maquina_snacks_archivos.servicio.ServicioSnacksArchivos;
import maquina_snacks_archivos.servicio.ServicioSnacksLista;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaquinaSnacks {
    public static void main(String[] args) {
        maquinaSnacks();
    }

    public static void maquinaSnacks() {
        boolean salir = false;
        Scanner entrada = new Scanner(System.in);
        // Creamos el objeto usando una interfaz para asegurar la implementación
        // de ServicioSnacks y aplicar polimorfismo.
        //IServicioSnacks servicioSnacks = new ServicioSnacksLista();
        IServicioSnacks servicioSnacks = new ServicioSnacksArchivos();
        //  -->>vv
        // Podemos cambiar la implementación sin afectar el código gracias al uso de interfaces.



        //creamos la lista de productos

        List<Snack> productos = new ArrayList<>();
        System.out.println("*** Maquina Snacks ***");
        servicioSnacks.mostrarSnacks();
        while (!salir) {
            try {
                int opcion = mostrarMenu(entrada);
                salir = ejecutarOpciones(opcion, entrada, productos , servicioSnacks );
            } catch (Exception e) {
                System.out.println("Ocurrio un Error : " + e.getMessage());
            } finally {
                System.out.println(); //imprime si o si un salto de linea para poder ver el menu de nuevo
            }
        }

    }

    private static int mostrarMenu(Scanner entrada) {
        System.out.print("""
                Menu:
                1.Comprar Snack
                2.Mostrar Boleta
                3.Agregar Producto
                4.Inventario de Snacks
                5.Salir
                Elije una Opcion:\s""");
        //Leemos y seleccionamaos la opcion
        return Integer.parseInt(entrada.nextLine());
    }

    private static boolean ejecutarOpciones(int opcion, Scanner entrada,
                                            List<Snack> productos , IServicioSnacks servicioSnacks) { //esa lista es una referencia
        boolean salir = false;

        switch (opcion) {
            case 1 -> comprarSnack (entrada , productos , servicioSnacks);
            case 2 -> mostrarBoleta (productos);
            case 3 -> agregarSnack (entrada , servicioSnacks);
            case 4 -> listarInventarioSnacks(entrada , servicioSnacks);
            case 5 -> {
                System.out.println("Gracias!");
                salir = true;
            }
            default -> System.out.println("Opcion invalida : " + opcion);

        }
        return salir;

    }



    private static void comprarSnack(Scanner entrada,
                                     List<Snack> productos , IServicioSnacks servicioSnacks) {
        System.out.print("Que snack desea comprar? (id) ");
        int idSnack = Integer.parseInt(entrada.nextLine());
        //validar que exista el snack
        boolean snackEncontrado = false;
        for (Snack snack : servicioSnacks.getSnacks() ) {
            if(idSnack == snack.getIdSnack()){
                //agregamos el snack encontrado
                productos.add(snack);
                System.out.println("Snack Agregado Correctamente : Snack " + snack);
                snackEncontrado = true;
                break;
            }
        }
        if (!snackEncontrado) {
            System.out.println("Id del snack no existe : "+idSnack);
        }
    }

    private static void mostrarBoleta(List<Snack> productos) {
        String Boleta = "*** Boleta ***";
        double total = 0.0;
        for (Snack producto : productos) {
            Boleta += "\n\t - " + producto.getNombre() + " - $"+producto.getPrecio();
            total += producto.getPrecio();
        }
        Boleta += "\n\t Total -> $" + total;
        System.out.println(Boleta);
    }

    private static void agregarSnack (Scanner entrada , IServicioSnacks servicioSnacks) {
        System.out.println("Nombre del snack: ");
        String nombre = entrada.nextLine();
        System.out.println("Precio del snack: ");
        double precio = Double.parseDouble(entrada.nextLine());
        servicioSnacks.agregarSnack(new Snack(nombre, precio ));
        System.out.println("Snack Agregado Correctamente");
        servicioSnacks.mostrarSnacks();

    }

    private static void listarInventarioSnacks (Scanner entrada, IServicioSnacks servicioSnacks) {
        servicioSnacks.mostrarSnacks();
    }
}
