package Practica;

import javax.swing.JOptionPane;

public class tableroMxN {
	
	
	
	public static void main(String[] args) {
		
		int m = Integer.parseInt(JOptionPane.showInputDialog("ngrese filas M):"));
		int n = Integer.parseInt(JOptionPane.showInputDialog("ingrese columnas (N):"));
		
		int tablero[][] = new int[m][n];
		
		// Llenar el tablero con números aleatorios
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				tablero[i][j] = ceroOuno();
			}
		}

		String resultado = "\n\n";
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				resultado = resultado + tablero[i][j] + " ";
			}
			resultado = resultado + "\n";
		}
		
		// Contar 0s y 1s
		int ceros = 0;
		int unos = 0;
		
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (tablero[i][j] == 0) {
					ceros++;
				} else {
					unos++;
				}
			}
		}
		
		resultado = resultado + "\ntotal:";
		resultado = resultado + "cero: " + ceros + "\n";
		resultado = resultado + "uno: " + unos;
		
		JOptionPane.showMessageDialog(null, resultado);
	}
	
	
	public static int ceroOuno() {
		return (int)(Math.random() * 2);
	}
}
