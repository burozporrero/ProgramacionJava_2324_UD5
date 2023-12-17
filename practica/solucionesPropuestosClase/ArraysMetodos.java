package practica.solucionesPropuestosClase;

/**
 * @author Alex C. y Alexandr F.
 */
public class ArraysMetodos {

    public static void main(String[] args) {

        int[] arrayEnteros = {5, 10, 3, 8, 15};
        double[] arrayDecimales = {3.5, 7.2, 9.8, 2.1, 5.6};

        int maximoEnteros = encontrarMaximo(arrayEnteros);
        double maximoDecimales = encontrarMaximo(arrayDecimales);
        int sumaEnteros = calcularSuma(arrayEnteros);
        double sumaDecimales = calcularSuma(arrayDecimales);

        System.out.println("Máximo valor en el array de enteros: " + maximoEnteros);
        System.out.println("Máximo valor en el array de decimales: " + maximoDecimales);
        System.out.println("Suma de elementos en el array de enteros: " + sumaEnteros);
        System.out.println("Suma de elementos en el array de decimales: " + sumaDecimales);
    }

        static int encontrarMaximo(int[] array) {
            int maximo = array[0];
            for (int i = 1; i < array.length; i++) {
                if (array[i] > maximo) {
                    maximo = array[i];
                }
            }
            return maximo;
        }

        static double encontrarMaximo(double[] array) {
            double maximo = array[0];
            for (int i = 1; i < array.length; i++) {
                if (array[i] > maximo) {
                    maximo = array[i];
                }
            }
            return maximo;
        }

        static int calcularSuma(int[] array) {
            int suma = 0;
            for (int num : array) {
                suma += num;
            }
            return suma;
        }

        static double calcularSuma(double[] array) {
            double suma = 0;
            for (double num : array) {
                suma += num;
            }
            return suma;
        }
    }
