import java.util.HashMap;
import java.util.Map;

public class Mapa {
    public static void main(String[] args) {
        //mapa o diciconario cuanta con una llave el primero y luego su valor que es el segundo parametro
        Map<String , String> Persona = new HashMap<>();
        Persona.put("Nombre " , "Diego");
        Persona.put("Apellido " , "Flores");
        Persona.put("Edad " , "22");
        Persona.put("Edad " , "22"); //no s epermiten duplicados

        System.out.println("Valores del Map ");
        //para imprimirlo se convierte en set
        Persona.entrySet().forEach(System.out::println);
        Persona.put("Edad " , "27"); //modificar el valor de la llave existente
        Persona.remove("Apellido ");
        System.out.println("\nNuevos Valores");
        Persona.entrySet().forEach(System.out::println);

        //iterar sobre los elementos por separado
        System.out.println("\nIterando los elementos (Llave , valor)");
       /* Persona.forEach((llave , valor) -> {
            System.out.println("Llave "+llave+" valor "+valor);
        });*/
        //para praticar lambda se puede simplificar mas
        Persona.forEach((llave , valor) ->  System.out.println("Llave "+llave+" valor "+valor));

    }
}
