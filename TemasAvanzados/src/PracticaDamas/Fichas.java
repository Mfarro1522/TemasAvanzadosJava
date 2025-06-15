package PracticaDamas;

public class Fichas {
    // Atributos
    private String color;
    private int fila;
    private int columna;
    private boolean esReina;
    
    // Constructor por defecto
    public Fichas() {
        this.color = "";
        this.fila = 0;
        this.columna = 0;
        this.esReina = false;
    }
    
    // Constructor con parámetros
    public Fichas(String color, int fila, int columna) {
        this.color = color;
        this.fila = fila;
        this.columna = columna;
        this.esReina = false;
    }
    
    // Getters
    public String getColor() {
        return color;
    }
    
    public int getFila() {
        return fila;
    }
    
    public int getColumna() {
        return columna;
    }
    
    public boolean isEsReina() {
        return esReina;
    }
    
    // Setters
    public void setColor(String color) {
        this.color = color;
    }
    
    public void setFila(int fila) {
        this.fila = fila;
    }
    
    public void setColumna(int columna) {
        this.columna = columna;
    }
    
    public void setEsReina(boolean esReina) {
        this.esReina = esReina;
    }
    
    // toString
    @Override
    public String toString() {
        return "Ficha{" +
                "color='" + color + '\'' +
                ", fila=" + fila +
                ", columna=" + columna +
                ", esReina=" + esReina +
                '}';
    }
}
