package soluciones.vicent;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * @author Vicent P.
 */
public class Usuario {
    private String nom;
    private String passwd;
    private int nInicios = 0;
    private LocalDateTime ultimoInicio;

    public Usuario(String nom, String passwd) {
        this.nom = nom;
        this.passwd = passwd;
    }

    public String getNom() {
        return nom;
    }
    public String getPasswd() {
        return passwd;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }
    public int getnInicios() {
        return nInicios;
    }
    public void nInicioSesion(){
        nInicios++;
    }

    public LocalDateTime getUltimoInicio() {
        return ultimoInicio;
    }

    public void setUltimoInicio(LocalDateTime ultimoInicio) {
        this.ultimoInicio = ultimoInicio;
    }

    public void acceso(){
        nInicios++;
        this.ultimoInicio = LocalDateTime.now();
    }
}
