package Retos;

public class MCD_MCM {
    public static void main(String[] args) {

        System.out.println(MCD(120 , 15 ));
    }

    public static int MCD(int a, int b) {
        int maxDiva = 0 ;
        int maxDivb = 0 ;
        for (int i = 1; i <= a + b ; i++) {
            if(a%i == 0 && b%i == 0) {
                maxDiva = i;
                maxDivb = i;
            }
        }
        return maxDivb;
    }

    public static int MCM(int a, int b) {
        int [] multiplosa = new int [a];
        int [] multiplosb = new int [b];

        for (int i = 1; i < a; i++) {
            while (a % i == 0) {
                multiplosa[i] +=i;
                a /= i;
            }
        }
        return 0;

    }

}
