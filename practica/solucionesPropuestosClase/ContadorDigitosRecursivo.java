package practica.solucionesPropuestosClase;

import java.util.Scanner;

/**
 * @author Jordi D.
 */
public class ContadorDigitosRecursivo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;


        // Solicitar al usuario que ingrese el número
        System.out.print("Ingrese un número entero entre 0 y 100: ");
        numero = scanner.nextInt();

        if (numero <= 0 || numero > 100){
            System.out.print("Ha introducido un número inválido. El programa se cerrará.");
        }

        // Llamar a la función recursiva para contar los dígitos
        int cantidadDigitos = contarDigitos(numero);

        // Mostrar el resultado
        System.out.println("El número de dígitos es: " + cantidadDigitos);

        scanner.close();
    }

    // Función recursiva para contar los dígitos
    public static int contarDigitos(int numero) {
        // Caso base: el número tiene un solo dígito
        if (numero < 10) {
            return 1;
        } else {
            // Llamada recursiva con el número sin el último dígito
            return 1 + contarDigitos(numero / 10);
        }
    }
}
