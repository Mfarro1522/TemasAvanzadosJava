/*
 * Crea una función que imprima los 30 próximos años bisiestos
 * siguientes a uno dado.
 * - Utiliza el menor número de líneas para resolver el ejercicio.
 */
package Retos;

public class AniosBisiestos {

	public static void main(String[] args) {
		int añoInicio = 2025;
		bisiestos(añoInicio);
	}
	
	public static void bisiestos(int añoIncio) {
		
		while(añoIncio%4!=0) {
			añoIncio++;
		}
		System.out.print(añoIncio);
		for (int i = 0 ; i < 30 ; i++ ) {
			añoIncio += 4;
			if(añoIncio%10!=0){
				añoIncio += 4;
				}
			System.out.print(" - "+añoIncio);
			}
	}
}
