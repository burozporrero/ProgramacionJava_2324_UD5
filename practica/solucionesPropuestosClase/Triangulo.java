package practica.solucionesPropuestosClase;

import java.util.Scanner;

/**
 * @author Nacho P. y Alejandro R.
 */
public class Triangulo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // Solicitar al usuario que ingrese la altura del triángulo
        System.out.print("Vamos a dibujar un triángulo. Introduce la altura del triángulo: ");
        int altura = sc.nextInt();
        construirTriangulo(altura);
        sc.close();
    }

    static void construirTriangulo(int n){
        if (n > 0){
            construirTriangulo(n - 1);
            pintarFilaTriangulo(n);
        }
    }

    static void pintarFilaTriangulo(int n){
        if (n > 0){
            System.out.print("* ");
            pintarFilaTriangulo(n - 1);
        } else {
            System.out.print("\n");
        }
    }
}
