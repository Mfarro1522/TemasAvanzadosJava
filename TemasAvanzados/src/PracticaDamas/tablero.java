package PracticaDamas;

public class tablero {
    private Fichas[][] tablero;
    private final int TAMAÑO = 8;
    
    public tablero() {
        tablero = new Fichas[TAMAÑO][TAMAÑO];
        inicializarTablero();
    }
    
    private void inicializarTablero() {
        // Colocar fichas negras en las primeras 3 filas
        for (int fila = 0; fila < 3; fila++) {
            for (int col = 0; col < TAMAÑO; col++) {
                if ((fila + col) % 2 == 1) { // Solo en casillas negras
                    tablero[fila][col] = new Fichas('N');
                }
            }
        }
        
        // Colocar fichas blancas en las últimas 3 filas
        for (int fila = 5; fila < TAMAÑO; fila++) {
            for (int col = 0; col < TAMAÑO; col++) {
                if ((fila + col) % 2 == 1) { // Solo en casillas negras
                    tablero[fila][col] = new Fichas('B');
                }
            }
        }
    }
    
    public void mostrarTablero() {
        System.out.println("  0 1 2 3 4 5 6 7");
        for (int fila = 0; fila < TAMAÑO; fila++) {
            System.out.print(fila + " ");
            for (int col = 0; col < TAMAÑO; col++) {
                if (tablero[fila][col] != null) {
                    System.out.print(tablero[fila][col] + " ");
                } else if ((fila + col) % 2 == 0) {
                    System.out.print("□ "); // Casilla blanca vacía
                } else {
                    System.out.print("■ "); // Casilla negra vacía
                }
            }
            System.out.println();
        }
        System.out.println();
    }


}
