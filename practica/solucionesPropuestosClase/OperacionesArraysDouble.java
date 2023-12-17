package practica.solucionesPropuestosClase;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * @author Jaime G. y Hugo A.
 */
public class OperacionesArraysDouble {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int longitud;

        System.out.println("-- Aplicación que realiza operaciones sobre un vector de números decimales -- ");
        System.out.println("Introduzca el numero de valores que quiere el vector (máximo 100): ");
        longitud = Math.abs(sc.nextInt());

        if(longitud <= 0 || longitud > 100){
            System.out.println("Ha introducido un número de valores no permitido. El programa se cerrará.");
            System.exit(0);
        }

        double[] vector = new double[longitud];

        llenarVector(vector);
        imprimirVector(vector);

        double media = calcularMedia(vector);
        System.out.println("La media es: " + media);

        // Opción 1
        double masCercano = encontrarMasCercano(vector, media);
        // Opción 2
        masCercano = encontrarMasCercano(vector);
        System.out.println("El número más cercano a la media es: " + (masCercano));

        sc.close();
    }

    /**
     * Método que se encarga de llenar un vector dado con valores decimales aleatorios
     * @param vector vector vacío para llenarlo, si no está vacío, se sobreescribirá
     */
    public static void llenarVector(double[] vector) {
        Random rand = new Random();
        for (int i = 0; i < vector.length; i++) {
            vector[i] = rand.nextDouble() * 100;
        }
    }

    /**
     * Método que imprime un vector por pantalla
     * @param vector array a imprimir
     */
    public static void imprimirVector(double[] vector) {
        System.out.println(Arrays.toString(vector));
    }

    /**
     * Método que calcula la media de los valores de un array dado
     * @param vector Array del cual se calcula la media
     * @return la media de los valores del vector
     */
    public static double calcularMedia(double[] vector) {
        double suma = 0;
        for (double num : vector) {
            suma += num;
        }
        return suma / vector.length;
    }

    /**
     * Método que busca el número mas cercano a la media
     * @param vector Array sobre el que se buscará
     * @param media Valor de la media
     * @return valor del elemento más cercano a la media
     */
    public static double encontrarMasCercano(double[] vector, double media) {
        double masCercano = vector[0];
        double diferenciaMinima = Math.abs(vector[0] - media);

        for (double num : vector) {

            double diferenciaActual = Math.abs(num - media);
            if (diferenciaActual < diferenciaMinima) {
                diferenciaMinima = diferenciaActual;
                masCercano = num;
            }
        }
        return masCercano;
    }

    /**
     * Método que busca el número mas cercano a la media
     * @param vector Array sobre el que se buscará
     * @return valor del elemento más cercano a la media
     */
    public static double encontrarMasCercano(double[] vector) {

        double media = calcularMedia(vector);
        double masCercano = vector[0];
        double diferenciaMinima = Math.abs(vector[0] - media);

        for (double num : vector) {

            double diferenciaActual = Math.abs(num - media);
            if (diferenciaActual < diferenciaMinima) {
                diferenciaMinima = diferenciaActual;
                masCercano = num;
            }
        }
        return masCercano;
    }
}
