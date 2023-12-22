package practica.solucionesPropuestosClase.estudiantes;

/**
 * @author Juan L. y Ángel M.
 */
public class Estudiante {
    String nombre;
    int edad;
    String grado;

    // Constructor
    public Estudiante(String nombre, int edad, String grado) {
        this.nombre = nombre;
        this.edad = edad;
        this.grado = grado;
    }

    // Método para mostrar información del estudiante
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Grado: " + grado);
        System.out.println();
    }

    // Aunque lo más correcto es implementar el método toString
    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", grado='" + grado + '\'' +
                '}';
    }
}
