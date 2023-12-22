package teoria;

public class GestionPianos {
    public static void main(String[] args) {
        Piano piano1 = new Piano("electrico", "yamaha");
        Piano piano2 = new Piano("de cola", "kawai");

        piano1.tocarPiano(true, false, 23);
        piano2.tocarPiano(false, false, 0);

        System.out.println("El piano 1 es " + piano1.tipo + " y la marca es " + piano1.marca);
        System.out.println("El piano 2 es " + piano2.tipo + " y la marca es " + piano2.marca);
        System.out.println("-------------");
        if (piano1.notaPresionada) {
            if (piano1.pedalPresionado) {
                System.out.println("\nEsta presionando la tecla del piano 1 en la posicion " + piano1.posicionNota + " con pedal");
            } else {
                System.out.println("\nEsta presionando la tecla del piano 1 en la posicion " + piano1.posicionNota + " sin pedal");
            }
        } else {
            System.out.println("\nNo esta tocando el piano 1");
        }

        if (piano2.notaPresionada) {
            if (piano2.pedalPresionado) {
                System.out.println("\nEsta presionando la tecla del piano 1 en la posicion " + piano2.posicionNota + " con pedal");
            } else {
                System.out.println("\nEsta presionando la tecla del piano 1 en la posicion " + piano2.posicionNota + " sin pedal");
            }
        } else {
            System.out.println("\nNo esta tocando el piano 2");
        }
    }
}
