package teoria;

public class DemoVarargsAvanzado {
    public static void main(String[] args) {
        imprimir("Hola", "Mundo", "!");
        int suma = sumar(1, 2, 3, 4, 5);
        System.out.println("La suma es: " + suma);
        String cadenasConcatenadas = concatenar("Hola", " ", "Mundo", "!");
        System.out.println("Cadenas concatenadas: " + cadenasConcatenadas);
    }

    public static void imprimir(String... mensajes) {
        for (String mensaje : mensajes) {
            System.out.print(mensaje);
        }
        System.out.println();
    }

    public static int sumar(int... numeros) {
        int resultado = 0;
        for (int numero : numeros) {
            resultado += numero;
        }
        return resultado;
    }

    public static String concatenar(String... cadenas) {
        String resultado = "";
        for (String cadena : cadenas) {
            resultado += cadena;
        }
        return resultado;
    }
}
