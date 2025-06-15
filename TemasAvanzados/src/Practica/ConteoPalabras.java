package Practica;

import javax.swing.JOptionPane;

public class ConteoPalabras {
	
	public static void main(String[] args) {
		
		String palabras[] = new String[100];
		int contadores[] = new int[100];
		int totalPalabras = 0;
		
		JOptionPane.showMessageDialog(null, "Ingrese palabras o frases:");
		
		for (int i = 0; i < 10; i++) {
			
			
			String entrada = JOptionPane.showInputDialog("Ingrese texto (enter para terminar):");
			
			if (entrada == null || entrada.equals("")) {
				break;
			}
			
			String[] partes = entrada.split(" ");
			
			for (int j = 0; j < partes.length; j++) {
				
				
				String palabra = partes[j];
				boolean encontrada = false;
				
				
				for (int k = 0; k < totalPalabras; k++) {
					if (palabras[k].equals(palabra)) {
						contadores[k]++;
						encontrada = true;
						break;
					}
				}
				
				if (!encontrada) {
					palabras[totalPalabras] = palabra;
					contadores[totalPalabras] = 1;
					totalPalabras++;
				}
			}
	}
		
	String resultado = "Total de cada una :\n";
	for (int i = 0; i < totalPalabras; i++) {
			resultado = resultado + palabras[i] + ": " + contadores[i] + "\n";
		}
		
	
		JOptionPane.showMessageDialog(null, resultado);
	}
}
