package practica.solucionesPropuestosClase;

/**
 * @author Victor C. y Guillem D.
 */
public class CalcularPromedio {

    // Método que acepta un número variable de argumentos (varargs) y calcula el promedio
    public static void main(String[] args) {
        // Llamada al método con diferentes cantidades de argumentos
        System.out.println("Promedio: " + calcularPromedio(5, 10, 15));
        System.out.println("Promedio: " + calcularPromedio(2.5, 7.5, 10.0, 8.0));
        System.out.println("Promedio: " + calcularPromedio());
    }

    public static double calcularPromedio(double... numeros) {
        if (numeros.length == 0) {
            return 0.0;
        }

        double sumaTotal = 0;
        for (double num : numeros) {
            sumaTotal += num;
        }

        return sumaTotal / numeros.length;
    }
}
