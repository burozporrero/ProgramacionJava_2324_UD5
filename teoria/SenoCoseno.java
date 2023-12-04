package teoria;

import java.util.Scanner;

public class SenoCoseno {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Indique el ángulo en grados para obtener su seno y su coseno");
        double anguloGrados = scanner.nextDouble();

        System.out.println("El seno de " + anguloGrados + " es " + seno(anguloGrados) + " y el coseno es " + coseno(anguloGrados));

        // Otra opción
        double radianes = degreesToRadians(anguloGrados);
        System.out.println("El seno de " + anguloGrados + " es " + Math.sin(radianes) + " y el coseno es " + Math.cos(radianes));

        scanner.close();
    }

    // Método que obtiene el nombre del usuario
    public static double seno(double grados) {

        double radianes = (grados * 2 * 3.141592) / 360;

        return Math.sin(radianes);
    }

    public static double coseno(double grados) {

        double radianes = (grados * 2 * 3.141592) / 360;

        return Math.cos(radianes);
    }

    public static double degreesToRadians(double grados) {

        return (grados * 2 * 3.141592) / 360;
    }

}
