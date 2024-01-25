package solucionesPropuestosClase.Personajes;

/**
 * @author David G.
 */
public class Estadistica {
    private int pv, ph, atqfis, atqelem, deffis, defelem, prec, vel, crit, evas;


    public Estadistica(int pv, int ph, int atqfis, int atqelem, int deffis, int defelem, int prec, int vel, int crit, int evas){
        this.pv = pv;
        this.ph = ph;
        this.atqfis = atqfis;
        this.atqelem = atqelem;
        this.deffis = deffis;
        this.defelem = defelem;
        this.prec = prec;
        this.vel = vel;
        this.crit = crit;
        this.evas = evas;
    }

    public int getPv() {
        return pv;
    }

    public int getPh() {
        return ph;
    }

    public int getAtqfis() {
        return atqfis;
    }

    public int getAtqelem() {
        return atqelem;
    }

    public int getDeffis() {
        return deffis;
    }

    public int getDefelem() {
        return defelem;
    }

    public int getPrec() {
        return prec;
    }

    public int getVel() {
        return vel;
    }

    public int getCrit() {
        return crit;
    }

    public int getEvas() {
        return evas;
    }
}
