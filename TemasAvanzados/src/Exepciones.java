public class Exepciones {

    public static void main(String[] args) {

        int valor = 10 , valor2 = 0;
        //exepcion basica try catch
        try {
            int resultado = valor / valor2;
            System.out.println("Resultado :"+resultado);
        } catch (Exception e) {
            System.out.println("Ocurrio un error : "+e);
        }



    }

}
