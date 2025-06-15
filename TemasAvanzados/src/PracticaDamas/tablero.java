package PracticaDamas;

public class tablero {
    // Atributos del tablero
    private int tamaño;
    private String[][] tablero;
    
    // Arrays paralelos para fichas 
    private Fichas[] fichasBlancas;
    private String[] posicionesBlancas; 
    

    private Fichas[] fichasNegras;
    private String[] posicionesNegras; 
    
    // Constructor
    public tablero() {
        this.tamaño = 8;
        this.tablero = new String[tamaño][tamaño];
        
        this.fichasBlancas = new Fichas[12];
        this.posicionesBlancas = new String[12];
        this.fichasNegras = new Fichas[12];
        this.posicionesNegras = new String[12];
        
        inicializarTablero();
        colocarFichasIniciales();
    }
    
    public tablero(int tamaño) {
        this.tamaño = tamaño;
        this.tablero = new String[tamaño][tamaño];
        
        this.fichasBlancas = new Fichas[12];
        this.posicionesBlancas = new String[12];
        this.fichasNegras = new Fichas[12];
        this.posicionesNegras = new String[12];
        
        inicializarTablero();
        colocarFichasIniciales();
    }
    

    private void inicializarTablero() {
        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño; j++) {

                if ((i + j) % 2 == 0) {
                    tablero[i][j] = "[ ]"; // Casilla blanca
                } else {
                    tablero[i][j] = "[ ]"; // Casilla negra 
                }
            }
        }
    }
    
    // colocar fichas
    private void colocarFichasIniciales() {
        int indiceBlancos = 0;
        int indiceNegros = 0;
        
        // Colocar fichas negras 
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < tamaño; j++) {
                if ((i + j) % 2 == 1) { //casillas negras
                    fichasNegras[indiceNegros] = new Fichas("NEGRO", i, j);
                    posicionesNegras[indiceNegros] = i + "," + j;
                    tablero[i][j] = "[N]";
                    indiceNegros++;
                }
            }
        }
        
        // Colocar fichas blancas 
        for (int i = tamaño - 3; i < tamaño; i++) {
            for (int j = 0; j < tamaño; j++) {
                if ((i + j) % 2 == 1) { 
                    fichasBlancas[indiceBlancos] = new Fichas("BLANCO", i, j);
                    posicionesBlancas[indiceBlancos] = i + "," + j;
                    tablero[i][j] = "[B]";
                    indiceBlancos++;
                }
            }
        }
    }
    
    
    public void dibujar() {
        System.out.println("=== TABLERO DE DAMAS ===");
        System.out.println();
        
       
        System.out.print("   ");
        for (int j = 0; j < tamaño; j++) {
            System.out.print(" " + j + " ");
        }
        System.out.println();
        
        
        for (int i = 0; i < tamaño; i++) {
            System.out.print(i + "  ");
            for (int j = 0; j < tamaño; j++) {
                System.out.print(tablero[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        
        
        mostrarInformacionFichas();
    }
    
    
    private void mostrarInformacionFichas() {
        System.out.println("=== FICHAS BLANCAS ===");
        for (int i = 0; i < fichasBlancas.length; i++) {
            if (fichasBlancas[i] != null) {
                System.out.println("Ficha " + (i + 1) + ": " + fichasBlancas[i] + 
                                 " - Posición: " + posicionesBlancas[i]);
            }
        }
        
        System.out.println();
        System.out.println("=== FICHAS NEGRAS ===");
        for (int i = 0; i < fichasNegras.length; i++) {
            if (fichasNegras[i] != null) {
                System.out.println("Ficha " + (i + 1) + ": " + fichasNegras[i] + 
                                 " - Posición: " + posicionesNegras[i]);
            }
        }
    }
    
    // Getters
    public int getTamaño() {
        return tamaño;
    }
    
    public String[][] getTablero() {
        return tablero;
    }
    
    public Fichas[] getFichasBlancas() {
        return fichasBlancas;
    }
    
    public String[] getPosicionesBlancas() {
        return posicionesBlancas;
    }
    
    public Fichas[] getFichasNegras() {
        return fichasNegras;
    }
    
    public String[] getPosicionesNegras() {
        return posicionesNegras;
    }
    
    // Setters
    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }
    
    public void setTablero(String[][] tablero) {
        this.tablero = tablero;
    }
    
    public void setFichasBlancas(Fichas[] fichasBlancas) {
        this.fichasBlancas = fichasBlancas;
    }
    
    public void setPosicionesBlancas(String[] posicionesBlancas) {
        this.posicionesBlancas = posicionesBlancas;
    }
    
    public void setFichasNegras(Fichas[] fichasNegras) {
        this.fichasNegras = fichasNegras;
    }
    
    public void setPosicionesNegras(String[] posicionesNegras) {
        this.posicionesNegras = posicionesNegras;
    }
    
    // toString
    @Override
    public String toString() {
        return "Tablero{" +
                "tamaño=" + tamaño +
                ", fichas blancas=" + fichasBlancas.length +
                ", fichas negras=" + fichasNegras.length +
                '}';
    }
}
