package PracticaDamas;

public class main {
    public static void main(String[] args) {
        System.out.println("=== JUEGO DE DAMAS ===");
        System.out.println("Iniciando el juego...");
        System.out.println();

        tablero tableroJuego = new tablero();
        
        tableroJuego.dibujar();

        System.out.println("=== FICHAS ===");
        Fichas fichaEjemplo1 = new Fichas("BLANCO", 7, 0);
        Fichas fichaEjemplo2 = new Fichas("NEGRO", 0, 1);
        
        System.out.println("Ficha ejemplo 1: " + fichaEjemplo1);
        System.out.println("Ficha ejemplo 2: " + fichaEjemplo2);

        fichaEjemplo1.setEsReina(true);
        fichaEjemplo2.setFila(2);
        fichaEjemplo2.setColumna(3);
        
        System.out.println("Después de modificaciones:");
        System.out.println("Ficha ejemplo 1 (ahora reina): " + fichaEjemplo1);
        System.out.println("Ficha ejemplo 2 (nueva posición): " + fichaEjemplo2);

    }
}
