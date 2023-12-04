package teoria;

public class PasoPorReferencia {

    public static void main(String[] args) {
        Persona persona = new Persona("Juan");
        cambiarNombre(persona, "Pedro");
        System.out.println("Nuevo nombre: " + persona.getNombre());
    }

    static public void cambiarNombre(Persona persona, String nuevoNombre) {
        persona.setNombre(nuevoNombre);
        System.out.println("Nombre cambiado: " + persona.getNombre());
    }
}
