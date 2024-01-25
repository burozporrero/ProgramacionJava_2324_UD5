package solucionesPropuestosClase.Personajes;

/**
 * @author David G.
 */
public class Personaje {
    private String nombre, arma1, arma2, escudo, torso, accesorio1, accesorio2;
    private Estadistica estadisticas;

    public Personaje(String nombre, String arma1, String arma2, String escudo, String torso, String accesorio1, String accesorio2, Estadistica estadisticas){
        this.nombre = nombre;
        this.arma1 = arma1;
        this.arma2 = arma2;
        this.escudo = escudo;
        this.torso = torso;
        this.accesorio1 = accesorio1;
        this.accesorio2 = accesorio2;
        this.estadisticas = estadisticas;
    }

    public String getNombre() {
        return nombre;
    }

    public String getArma1() {
        return arma1;
    }

    public String getArma2() {
        return arma2;
    }

    public String getEscudo() {
        return escudo;
    }

    public String getTorso() {
        return torso;
    }

    public String getAccesorio1() {
        return accesorio1;
    }

    public String getAccesorio2() {
        return accesorio2;
    }

    public Estadistica getEstadisticas() {
        return estadisticas;
    }

}
