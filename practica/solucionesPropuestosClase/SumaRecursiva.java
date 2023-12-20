package practica.solucionesPropuestosClase;

public class SumaRecursiva {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5};

        int suma = sumaRecursiva(array, 0);

        System.out.println("La suma de los elementos del array es: " + suma);
    }

    public static int sumaRecursiva(int[] array, int n) {

        if (n == array.length) {
            return 0;
        } else {
            return array[n] + sumaRecursiva(array, n + 1);
        }
    }
}
