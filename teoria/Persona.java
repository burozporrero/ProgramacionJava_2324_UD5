package teoria;

public class Persona {

    String nombre;
    public Persona(String sNombre) {
        this.nombre = sNombre;
    }

    public void setNombre(String sNombre){
        this.nombre = sNombre;
    }

    public String getNombre(){
        return this.nombre;
    }
}
