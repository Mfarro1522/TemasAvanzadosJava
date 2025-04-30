/*
 * Crea una función que sume 2 números y retorne su resultado pasados
 * unos segundos.
 * - Recibirá por parámetros los 2 números a sumar y los segundos que
 *   debe tardar en finalizar su ejecución.
 * - Si el lenguaje lo soporta, deberá retornar el resultado de forma
 *   asíncrona, es decir, sin detener la ejecución del programa principal.
 *   Se podría ejecutar varias veces al mismo tiempo.
 */

package Retos;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

public class PararTiempo {

    //suma de numeros con retraso de tiempo
    public static CompletableFuture<Integer> SumaConRetardo (int num1 , int num2 , int segundos) {
        //funcion lambda
        return CompletableFuture.supplyAsync(() -> {
            try {
                //simula el retardo
                TimeUnit.SECONDS.sleep(segundos);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new RuntimeException("La Tarea fue interrumpida"+e);
            }
            return num1 + num2;
        });
    }

    public static void main(String[] args) {
        CompletableFuture<Integer> resultado1 = SumaConRetardo(1, 2, 3);
        CompletableFuture<Integer> resultado2 = SumaConRetardo(20, 30, 5);

        resultado1.thenAccept(resultado -> {System.out.println(resultado);});
        resultado2.thenAccept(resultado -> {System.out.println(resultado);});

        System.out.println("Las Tareas se ejecutan de forma Asincrona"); //para comprobar si sucedio por si no fuese asi mandaria un error por los try catch

        // Espera explícita para que las tareas terminen antes de finalizar el programa
        CompletableFuture.allOf(resultado1, resultado2).join(); //correccion de copilot
    }

}

