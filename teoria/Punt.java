package teoria;

public class Punt { // és la classe pública, el nom de l’arxiu és “punt.java”
    private int x; //posició sobre l’eix horitzontal del punt
    private int y; //posició sobre l’eix vertical del punt

    public Punt(int x, int y) { // constructor per a la classe Punt, rep x i y, els valors per als camps
        this.x = x;
        this.y = y;
    }

    public Punt(Punt p) { // constructor per a la classe Punt, rep p de tipus Punt (la classe que estem definint)
        x = p.getX();
        y = p.getY();
    }

    public int getX() { // retorna el valor del camp x
        return x;
    }

    public int getY() { // retorna el valor del camp y
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Punt getPunt() { // el tipus retornat pel mètode és un Punt
        return new Punt(x, y);
    }
}
