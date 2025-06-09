/*
 * Crea una función que reciba un texto y muestre cada palabra en una línea,
 * formando un marco rectangular de asteriscos.
 * - ¿Qué te parece el reto? Se vería así:
 *   **********
 *   * ¿Qué   *
 *   * te     *
 *   * parece *
 *   * el     *
 *   * reto?  *
 *   **********
 */

package Retos;

import java.util.Iterator;

import javax.swing.JOptionPane;

public class MarcoDePalabras {
	
	public static void main(String[] args) {
		
	String oracion = JOptionPane.showInputDialog("Ingrese una frase");
	Marco(oracion);

	}
	
	public static void Marco( String Oracion) {
		String [] partes = Oracion.split(" ");
		//busco la palabra mas larga
		int largoPalabra = 0;
		for (int i = 0; i < partes.length; i++) {
			if(largoPalabra < partes[i].length()) {
				largoPalabra = partes[i].length();
			}
		}
		
		for (int i = 0; i < largoPalabra+7; i++) {
			System.out.print("*");
		}
		for (int i = 0; i < partes.length; i++) {
			System.out.print("\n* "+partes[i]);
			for (int j = 0; j < (largoPalabra+4-partes[i].length()) ; j++) {
				System.out.print(" ");
			}
			System.out.print("*");
		}
		System.out.println();
		for (int i = 0; i < largoPalabra+7; i++) {
			System.out.print("*");
		}
	}
}
