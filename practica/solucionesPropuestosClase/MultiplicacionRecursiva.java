package solucionesPropuestosClase;

import java.util.Scanner;

/**
 * @author Jordi D.
 */
public class MultiplicacionRecursiva {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese los dos números
        System.out.print("Ingrese el primer número: ");
        int num1 = scanner.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int num2 = scanner.nextInt();

        // Calcular la multiplicación utilizando la función recursiva
        int resultado = multiplicarRecursivo(num1, num2);

        // Mostrar el resultado
        System.out.println("El resultado de la multiplicación es: " + resultado);

        scanner.close();
    }

    // Función recursiva para multiplicar dos números
    public static int multiplicarRecursivo(int a, int b) {
        // Caso base: uno de los números es 0, la multiplicación es 0
        if (a == 0 || b == 0) {
            return 0;
        } else {
            // Llamada recursiva con a-1 y b, sumando b en cada llamada
            return b + multiplicarRecursivo(a - 1, b);
        }
    }
}
