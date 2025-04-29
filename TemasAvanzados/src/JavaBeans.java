import java.io.Serializable;

public class JavaBeans {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.setNombre("Karla");
        persona1.setApellido("Lara");
        System.out.println("persona = " + persona1);
        System.out.println("Nombre: " + persona1.getNombre());
        System.out.println("Apellido: " + persona1.getApellido());
    }
}

class Persona implements Serializable {
    private String nombre;
    private String apellido;

    public Persona(){}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                '}';
    }
}
