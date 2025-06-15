package PracticaDamas;

public class Fichas {
    private char tipo; // 'B' para blancas, 'N' para negras, 'R' para reina blanca, 'Q' para reina negra
    private boolean esReina;
    
    public Fichas(char tipo) {
        this.tipo = tipo;
        this.esReina = (tipo == 'R' || tipo == 'Q');
    }
    
    public char getTipo() {
        return tipo;
    }
    
    public boolean esReina() {
        return esReina;
    }
    
    public void convertirAReina() {
        if (tipo == 'B') {
            tipo = 'R'; // Reina blanca
        } else if (tipo == 'N') {
            tipo = 'Q'; // Reina negra
        }
        esReina = true;
    }
    
    public boolean esBlanca() {
        return tipo == 'B' || tipo == 'R';
    }
    
    public boolean esNegra() {
        return tipo == 'N' || tipo == 'Q';
    }
    
    @Override
    public String toString() {
        return String.valueOf(tipo);
    }
}
