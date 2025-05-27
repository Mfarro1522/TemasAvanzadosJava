
package Retos;

import java.util.Arrays;
import java.util.Scanner;

public class PiedraPapelTijera {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        Juego();

    }

    public static void Juego(){
        System.out.println("Piedra : R; Papel : P ; Tijera : T");
        System.out.print("Indique Al mejor de cuantas : ");
        int numJugadas = entrada.nextInt();
        int contadorPlayer1 = 0;
        int contadorPlayer2 = 0;
        int contadorempt = 0;

        for (int i = 0; i < numJugadas; i++) {
            System.out.print("Ingrese Jugada " + (i + 1) + " : ");
            System.out.println("Player 1 : ");
            String JugadaPlayer1 = entrada.next();
            System.out.println("Player 2 : ");
            String JugadaPlayer2 = entrada.next();

            if (jugadas(JugadaPlayer1,JugadaPlayer2).equals("Player1")) {
                contadorPlayer1++;
            } else if (jugadas(JugadaPlayer1,JugadaPlayer2).equals("Player2")) {
                contadorPlayer2++;
            } else if (jugadas(JugadaPlayer1,JugadaPlayer2).equals("emp")) {
                contadorempt++;
            }

        }

        if (contadorPlayer1 > contadorPlayer2) {
            System.out.println("Player 1");
        } else if (contadorPlayer2 > contadorPlayer1) {
            System.out.println("Player 2");
        } else {
            System.out.println("Empate");
        }

    }

    public static String jugadas(String Opcion1, String Opcion2 ){

        switch (Opcion1){

            case "R" : if (Opcion2.equals("R")){
                return "emp";
            } else if (Opcion2.equals("P")) {
                return "Player2";
            } else if (Opcion2.equals("T")) {
                return "Player1";
            }
                break;
            case "P" : if (Opcion2.equals("P")){
                return "emp";
            } else if (Opcion2.equals("T")) {
                return "Player2";
            } else if (Opcion2.equals("R")) {
                return "Player1";
            }
                break;

            case "T" : if (Opcion2.equals("T")){
                return "emp";
            } else if (Opcion2.equals("R")) {
                return "Player2";
            } else if (Opcion2.equals("P")) {
                return "Player1";
            }
                break;

        }
        return null;
    }



}
