package Retos;


import java.util.HashSet;
import java.util.Set;

public class Conjuntos {
    public static void main(String[] args) {

        int [] array1 = new int[10];
        int [] array2 = new int[10];

        for (int i = 0; i < array1.length; i++) {
            array1[i] = (int)(Math.random()*10)+1;
            array2[i] = (int)(Math.random()*10)+1;
        }

        for (int e : array1 ) {
            System.out.print(e+" ");
        }
        System.out.println();

        for (int e : array2 ) {
            System.out.print(e+" ");
        }
        System.out.println();

        int [] array3 = Conjuntos(array1 , array2 , true);

        for (int elemento : array3) {
            System.out.print(elemento+" - ");
        }



    }
    public static int [] Conjuntos (int [] array1 , int [] array2 , boolean opcion ){
        Set<Integer> comunes = new HashSet<>();
        if (opcion == true){
            for (int i = 0; i < array1.length; i++){
                int c = 0;
                for (int j = 0; j < array1.length; j++){
                    if(array1[i] == array2[j]){
                        c++;
                    }
                }
                if(c >= 1){
                    comunes.add(array1[i]);
                }
            }
        }
        else{
            for (int i = 0; i < array1.length; i++){
                int c = 0;
                for (int j = 0; j < array1.length; j++){
                    if(array1[i] == array2[j]){
                        c++;
                    }
                    if(c < 1){
                        comunes.add(array1[i]);
                    }
                }
            }
        }
        int [] array3 = new int [comunes.size()];
        int c= 0;
        for ( int elemento : comunes ) {
            array3[c] = elemento;
            c++;
        }
        return array3;
    }
}
