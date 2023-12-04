package teoria;

import java.util.Scanner;

public class HolaUsuario {

    public static void main(String[] args) {
        // Llamamos al método para obtener el nombre del usuario
        String nombreUsuario = obtenerNombreUsuario();

        // Mostramos el nombre obtenido
        System.out.println("¡Hola, " + nombreUsuario + "!");
    }

    // Método que obtiene el nombre del usuario
    public static String obtenerNombreUsuario() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, escribe tu nombre: ");
        String nombre = scanner.nextLine();

        // Cerramos el scanner para liberar recursos antes de salir del método
        scanner.close();

        return nombre;
    }
}
