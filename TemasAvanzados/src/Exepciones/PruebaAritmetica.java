package Exepciones;

public class PruebaAritmetica {
    public static void main(String[] args) {
        try {
            int resultado = Aritmetica.division(100 , 0);
            System.out.println(resultado);
        } catch (Exception e) {
            System.out.println("Ocurrio un error : "+e);
        } finally { //se ejecuta siempre
            System.out.println("Sre reviso la division entre 0");
        }
    }
}
