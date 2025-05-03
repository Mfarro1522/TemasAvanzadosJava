import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Listas {
    public static void main(String[] args) {
        // No se puede instaciar por que list es abstracta por que es una interface
        //List miLista = new List();
        List miLista = new ArrayList();
        //puedes crear objetos de cualquier tipo
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        miLista.add("Sabado");
        miLista.add("Domingo");
        miLista.add("Domingo"); //Permite objetos duplicados
        miLista.add(1); //hasta otros tipos de datos

        /*for (Object e : miLista){
            System.out.println(e );
        }*/

        System.out.println();

        //Tipos Genericos para especificar el tipo de elemento
        List <String> miLista2 = new ArrayList<>();
        //puedes crear objetos de cualquier tipo
        miLista2.add("Lunes");
        miLista2.add("Martes");
        miLista2.add("Miercoles");
        miLista2.add("Jueves");
        miLista2.add("Viernes");
        miLista2.add("Sabado");
        miLista2.add("Domingo");
        //miLista2.add(1); //no otros datos

        // Forma tradicional con for-each:
        // Recorremos la lista e imprimimos cada elemento.
        /*for (String e : miLista2) {
            System.out.println(e);
        }*/

        // Programación funcional con expresión lambda:
        // Usamos la función forEach y una lambda para imprimir cada elemento.
        // Es más compacto y evita declarar explícitamente el ciclo.
        /*miLista2.forEach(elemento -> {
            System.out.println("Lambda: " + elemento);
        });*/

        // Método de referencia  - Aún más simplificado
        //System.out::println es una referencia a método,
        // una forma compacta de pasar funciones ya existentes.
        // Se puede usar porque System.out es una instancia pública y estática
        // de PrintStream, y println(String) es un método público que
        //  coincide con lo que forEach espera (un Consumer<String>).
        //  Es equivalente a usar una
        //  lambda como e -> System.out.println(e), pero más corto y directo.
        miLista2.forEach(System.out::println);

        System.out.println();

        //mediante Metodo asList de la clase array podemos hacer lo mismo que arriba (Linea  a 19)
        //en una linea convirtiendo un array en una lista con esto convertimos nuestro codigo
        //en estas 2 lineas
        List <String> nombres = Arrays.asList("Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo");
        nombres.forEach(System.out::println);


    }
}
