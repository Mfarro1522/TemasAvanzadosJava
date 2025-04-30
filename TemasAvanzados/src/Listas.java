import java.util.ArrayList;
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

        for (Object e : miLista){
            System.out.println(e );
        }

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

        for (String e : miLista2){
            System.out.println(e );
        }


    }
}
