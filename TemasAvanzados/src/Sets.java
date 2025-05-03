import java.util.TreeSet;
import java.util.Set;

public class Sets {
    public static void main(String[] args) {
        //no acepta elementos repetidos sigue las reglas de los conjuntos
        Set<String> conjunto = new TreeSet<>();
        conjunto.add("Carlos");
        conjunto.add("Carlos");
        conjunto.add("Karla");
        conjunto.add("Victoria");

        System.out.println("Elementos de set");
        conjunto.forEach(System.out::println);

        //remover elemento

        conjunto.remove("Karla");
        System.out.println("\nElementos de set");
        conjunto.forEach(System.out::println);
    }
}
