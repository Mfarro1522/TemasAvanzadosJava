package Retos;

import java.util.Arrays;

/*problema,: un array donde estan 
	los numeros del 0 hasta el n en desorden pero falta uno 
	(no necesariamente el ultimo) y la cosa es hallarlo*/

public class NumeroFaltante {
	
	public static void main(String[] args) {
		//planteo del problema:
		
		int [] Array = new int [(int)(Math.random()*10)+1];
		// llenamos el array con numeros del 0 al n en desorden
		for (int i = 0; i < Array.length; i++) {
			Array[i] = i;
		}
		// desordenamos el array
		for (int i = 0; i < Array.length; i++) {
			int indiceAlea = (int)(Math.random() * Array.length);
			int temp = Array[i];
			Array[i] = Array[indiceAlea];
			Array[indiceAlea] = temp;
		}
		// quitamos un numero al azar
		int indiceQuitado = (int)(Math.random() * Array.length);
		int numeroFaltante = Array[indiceQuitado];

		// Creamos un nuevo array sin el número quitado
		int[] Array2 = new int[Array.length - 1];
		int k = 0;
		for (int i = 0; i < Array.length; i++) {
		    if (i != indiceQuitado) {
		        Array2[k++] = Array[i];
		    }
		}

		System.out.println("\nEl numero quitado es : " + numeroFaltante);
		// MOSTRAMOS EL ARRAY
		System.out.println("El tamaño es : " + Array2.length);
		for (int e : Array2) {
		    System.out.print(e + " ");
		}
		
		//solucionamos el problema:
		
		//primero sin ordenar 
		
		System.out.println("\n");
		
		for (int i = 0 ; i < Array2.length +1 ; i++) {
			boolean esta = false ;
			
			for (int j = 0; j < Array2.length; j++) {
				
				if (i == Array2[j]) {
					esta = true;
				}
				
			}
			
			if (!esta) {
				System.out.println("El numero que falta es : "+i);
			}
		}
		
		//ordenando 
		
		Arrays.sort(Array2);
		for (int i = 0; i < Array2.length ; i++) {
			if(i < Array2.length) {
				if (i != Array2[i]) {
					System.out.println("El numero que falta es : "+i);
					break;
				}
			} else {
				System.out.println("El numero que falta es : "+i);
			}
		}
		
		
		
		
		
		
	}

}
