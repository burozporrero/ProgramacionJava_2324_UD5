package practica.solucionesPropuestosClase;

import java.util.Scanner;

/**
 * @author Nacho P. y Alejandro R.
 */
public class NumeroInvertido {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca un número entero positivo para a continuación invertir el orden de sus dígitos");
        int num = sc.nextInt();

        invertirNumero(num);

        sc.close();
    }

    public static void invertirNumero(int n){

        if (n >= 0 && n < 10) {
            System.out.print(n);
        } else {
            System.out.print(n % 10);
            invertirNumero(n / 10);
        }
    }
}
