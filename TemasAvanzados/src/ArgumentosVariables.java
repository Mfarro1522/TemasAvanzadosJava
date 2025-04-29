public class ArgumentosVariables {
    public static void main(String[] args) {

        //inmprimirNumero(1, 2, 3, 4, 5); //  varargs
        variosParametros ("Karla" , 10 ,20 ,30);
    }

    //tener en cuenta que las variables dinamicas van al final siempre
    private static void variosParametros(String nombre, int ... numeros) {
        System.out.println("Nombre: "+nombre);
        inmprimirNumero(numeros);//llama al otro metodo
    }

    // Internamente, Java convierte los argumentos en un array de tipo int[].
    private static void inmprimirNumero(int... numero) {
        for (int i = 0; i < numero.length; i++) {
            System.out.print(numero[i] + " ");
        }
    }
}