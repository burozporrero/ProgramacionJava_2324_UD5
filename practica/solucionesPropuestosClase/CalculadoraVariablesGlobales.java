package practica.solucionesPropuestosClase;

import java.util.Scanner;

/**
 * @author Alex C. y Alexandr F.
 */
public class CalculadoraVariablesGlobales {
    static double resultado;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el primer número:");
        double num1 = scanner.nextDouble();
        System.out.println("Introduce el segundo número:");
        double num2 = scanner.nextDouble();
        System.out.println("Selecciona la operación a realizar: +, -, *, /");
        char operacion = scanner.next().charAt(0);

        switch (operacion) {
            case '+':
                suma(num1, num2);
                break;
            case '-':
                resta(num1, num2);
                break;
            case '*':
                multiplicacion(num1, num2);
                break;
            case '/':
                division(num1, num2);
                break;
            default:
                System.out.println("Operación no válida");
                break;
        }

        System.out.println("El resultado es: " + resultado);
    }

    public static void suma(double num1, double num2) {
        resultado = num1 + num2;
    }

    public static void resta(double num1, double num2) {
        resultado = num1 - num2;
    }

    public static void multiplicacion(double num1, double num2) {
        resultado = num1 * num2;
    }

    public static void division(double num1, double num2) {
        if (num2 != 0) {
            resultado = num1 / num2;
        } else {
            System.out.println("No se puede dividir por cero");
        }
    }
}
