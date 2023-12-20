package practica.solucionesPropuestosClase;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Nacho P. y Alejandro R.
 */
public class ContarDigitos {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = 0;
        do {
            try{
                System.out.print("Introduce un número entero mayor que 0: ");
                num = sc.nextInt();
            } catch (InputMismatchException e){
                System.out.println("El número introducido no es valido, vuelva a intentarlo.");
            }
        } while (num <= 0);

        mostrarDigitos(num);
    }

    public static int contarDigitos(int n) {

        final int UNO = 1;
        if (n <= 9) return UNO;
        return UNO + contarDigitos(n / 10);
    }

    public static void mostrarDigitos(int n) {
        int digito = contarDigitos(n);
        System.out.println("El numero " + n + " tiene " + digito + " dígito" + (digito > 1 ? "s." : "."));
    }
}
