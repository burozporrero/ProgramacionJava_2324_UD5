package teoria;

/**
 * @author Izan R.
 */
class Piano {
    // Atributos
    String tipo;
    String marca;
    boolean notaPresionada;
    boolean pedalPresionado;
    int posicionNota;

    // Constructor
    public Piano(String tipo, String marca) {
        this.tipo = tipo;
        this.marca = marca;
    }

    // Método
    public void tocarPiano(boolean notaPresionada, boolean pedalPresionado, int posicionNota) {
        this.posicionNota = posicionNota;
        this.notaPresionada = notaPresionada;
        this.pedalPresionado = pedalPresionado;
    }
}
