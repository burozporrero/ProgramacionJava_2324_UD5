package practica.solucionesPropuestosClase.trabajadores;

/**
 * @author Juan L. y Ángel M.
 */
public class Trabajador {
    private String nombre;
    private int edad;
    private double salario;
    private Proyecto proyecto;

    public Trabajador(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Proyecto getProyecto() {
        return proyecto;
    }

    public void setProyecto(Proyecto proyecto) {
        this.proyecto = proyecto;
    }

    public void imprimirDatos(int numeroTrabajador) {
        System.out.println("Datos de trabajador " + (numeroTrabajador) + ":");
        System.out.println("Nombre: " + this.getNombre());
        System.out.println("Edad: " + this.getEdad());
        System.out.println("Salario: " + this.getSalario());
        if (this.getProyecto() != null){
            this.getProyecto().imprimirDatos();
        }
    }
}
