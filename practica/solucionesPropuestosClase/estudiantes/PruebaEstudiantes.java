package practica.solucionesPropuestosClase.estudiantes;

/**
 * @author Juan L. y Ángel M.
 */
public class PruebaEstudiantes {
    public static void main(String[] args) {
        // Instanciar objetos de la clase Estudiante
        Estudiante estudiante1 = new Estudiante("Juan", 20, "10º grado");
        Estudiante estudiante2 = new Estudiante("María", 19, "11º grado");

        // Mostrar información de los estudiantes
        estudiante1.mostrarInformacion();
        estudiante2.mostrarInformacion();
    }
}
