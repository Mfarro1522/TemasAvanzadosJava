package Exepciones;

public class Aritmetica {
    //obligo a llevar try catch en el main con el trhows Exception
    /*public static int division (int numerador , int denominador) throws Exception {
         if (denominador == 0)
             throw new Exception("Division entre cero");
         return numerador/denominador;
    }*/
    public static int division (int numerador , int denominador)  {
        if (denominador == 0)
            throw new RuntimeException("Division entre cero");
        return numerador/denominador;
    }
}
