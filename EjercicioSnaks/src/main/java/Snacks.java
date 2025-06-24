import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Snacks {
    private static final List<Snack> snacks;

    //bloque static inicizalizador (es como un construtor pero de estaticos)
    static {
        snacks = new ArrayList<>();//ya no se puede asignar una lista distinta pero si el contenido
        //inventario inicial
        snacks.add(new Snack("Papa",3));
        snacks.add(new Snack("Jugo",4));
        snacks.add(new Snack("keke",2));
    }

    public static void agregarSnack(Snack snack) {
        snacks.add(snack);
    }

    public static void mostrarSnacks() {
        String inventarioSnacks = "";
        for (Snack snack : snacks) { //concatenamos la informacion de cada tostring de los snacks
            inventarioSnacks += snack.toString() + "\n";
        }
        System.out.println("Inventario Snacks: ");
        System.out.println(inventarioSnacks);
    }

    public static List<Snack> getSnacks() {
        return snacks;
    }
}
