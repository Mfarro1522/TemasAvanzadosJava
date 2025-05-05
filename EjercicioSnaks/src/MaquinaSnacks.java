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

        //creamos la lista de productos

        List<Snack> productos = new ArrayList<>();
        System.out.println("*** Maquina Snacks ***");
        Snacks.mostrarSnacks();
        while (!salir) {
            try {
                int opcion = mostrarMenu(entrada);
                salir = ejecutarOpciones(opcion, entrada, productos);
            } catch (Exception e) {
                System.out.println("Ocurrio un Error : " + e.getMessage());
            } finally {
                System.out.println(); //imprime si o si un salto de linea para poder ver el menu de nuevo
            }
        }

    }

    private static int mostrarMenu(Scanner entrada) {
        System.out.println("""
                Menu:
                1.Comprar Snack
                2.Mostrar Boleta
                4.Agregar Producto
                5.Salir
                Elije una Opcion:\s""");
        //Leemos y seleccionamaos la opcion
        return Integer.parseInt(entrada.nextLine());
    }

    private static boolean ejecutarOpciones(int opcion, Scanner entrada,
                                            List<Snack> productos) { //esa lista es una referencia
        boolean salir = false;

        switch (opcion) {
            case 1 -> comprarSnack (entrada , productos );
            case 2 -> mostrarBoleta (productos);
            case 3 -> agregarSnack (entrada);
            case 4 -> {
                System.out.println("Gracias!");
                salir = true;
            }
            default -> System.out.println("Opcion invalida : " + opcion);

        }
        return salir;

    }

    private static void comprarSnack(Scanner entrada,
                                     List<Snack> productos) {
        System.out.println("Que snack desea comprar? (id) ");
        int idSnack = Integer.parseInt(entrada.nextLine());
        //validar que exista el snack
        boolean snackEncontrado = false;
        for (Snack snack : Snacks.getSnacks() ) {
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

    private static void agregarSnack (Scanner entrada) {
        System.out.println("Nombre del snack: ");
        String nombre = entrada.nextLine();
        System.out.println("Precio del snack: ");
        double precio = Double.parseDouble(entrada.nextLine());
        Snacks.agregarSnack(new Snack(nombre, precio ));
        System.out.println("Snack Agregado Correctamente");
        Snacks.mostrarSnacks();
    }

}
