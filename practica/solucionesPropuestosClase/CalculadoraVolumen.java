package practica.solucionesPropuestosClase;

import java.util.Scanner;

/**
 * @author Alex C. y Alexandr F.
 */
public class CalculadoraVolumen {
    static String tipoFigura;
    static double radio;
    static double lado;
    static double altura;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el tipo de figura (esfera, cubo, cilindro):");
        tipoFigura = scanner.nextLine();

        switch (tipoFigura.toLowerCase()) {
            case "esfera":
                System.out.println("Introduce el radio:");
                radio = scanner.nextDouble();
                System.out.println("El volumen de la esfera es: " + volumenEsfera(radio));
                break;
            case "cubo":
                System.out.println("Introduce el lado:");
                lado = scanner.nextDouble();
                System.out.println("El volumen del cubo es: " + volumenCubo(lado));
                break;
            case "cilindro":
                System.out.println("Introduce el radio:");
                radio = scanner.nextDouble();
                System.out.println("Introduce la altura:");
                altura = scanner.nextDouble();
                System.out.println("El volumen del cilindro es: " + volumenCilindro(radio, altura));
                break;
            default:
                System.out.println("Tipo de figura no válida. El programa se cerrará");
        }
    }

    public static double volumenEsfera(double radio) {
        return (4.0 / 3.0) * Math.PI * Math.pow(radio, 3);
    }

    public static double volumenCubo(double lado) {
        return Math.pow(lado, 3);
    }

    public static double volumenCilindro(double radio, double altura) {
        return Math.PI * Math.pow(radio, 2) * altura;
    }
}
