package practica.solucionesPropuestosClase.trabajadores;

/**
 * @author Juan L. y Ángel M.
 */
public class Proyecto {
    private String nombre;
    private  String descripcion;

    public Proyecto(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void imprimirDatos() {
        System.out.println("-----------------------------------------");
        System.out.println("Datos proyecto trabajador: ");

        // Esta comprobacion no tiene mucho sentido, ya que, según el constructor, no podemos crear un proyecto sin
        // nombre ni descripción, por lo tanto, no es necesario comprobar si está vacío.
        if (nombre == null || nombre.isEmpty() || descripcion == null || descripcion.isEmpty()) {
            System.out.println("Vacío");
        } else {
            System.out.println("Nombre: " + nombre);
            System.out.println("Descripción: " + descripcion);
        }
    }
}
