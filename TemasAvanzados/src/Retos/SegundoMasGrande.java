package Retos;

import java.util.Arrays;

public class SegundoMasGrande {
	
	public static void main(String[] args) {
		
		int [] Array = new int [(int)(Math.random()*25)+1];
		// llenamos el array con numeros del 0 al n en desorden
		for (int i = 0 ; i < Array.length ; i++) {
			Array[i] = (int)(Math.random()*100)+1;
		}
		for (int i : Array) {
			System.out.print(i+ " ");
		}
		
		Arrays.sort(Array);
		System.out.println("\n"+Array[Array.length-2]);
		
		
	
	}
	
}
