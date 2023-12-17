package practica.solucionesPropuestosClase;


/**
 * @author Alex C. y Alexandr F.
 */
public class CalculadoraMetodos {

    public static void main(String[] args) {
        int sumaEnteros = sumar(5, 10);
        float sumaFlotantes = sumar(3.5f, 2.7f);
        String concatenacionCadenas = sumar("Hola ", "Mundo");

        // Mostrar los resultados
        System.out.println("Suma de enteros: " + sumaEnteros);
        System.out.println("Suma de flotantes: " + sumaFlotantes);
        System.out.println("Concatenación de cadenas: " + concatenacionCadenas);
    }

    static int sumar(int a, int b) {
        return a + b;
    }

    static float sumar(float a, float b) {
        return a + b;
    }

    static String sumar(String a, String b) {
        return a + b;
    }

}
