package practica.solucionesPropuestosClase;

import java.util.Scanner;

/**
 * @author Nacho P. y Alejandro R.
 */
public class SumaNumeros {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número para calcular la suma de sus números anteriores de forma recursiva: ");
        int num = sc.nextInt();

        int resultado = sumaNumeros(num);

        System.out.println("La suma de los primeros " + num + " números es: " + resultado);
        sc.close();
    }

    public static int sumaNumeros(int n) {
        if (n == 1) {
            return 1;
        } else {
            int sumaAnterior = sumaNumeros(n - 1);

            System.out.println("Suma de los primeros " + (n - 1) + " números: " + sumaAnterior);

            return sumaAnterior + n;
        }
    }
}
