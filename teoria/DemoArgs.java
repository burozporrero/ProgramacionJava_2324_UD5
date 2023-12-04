package teoria;

/**
 * Demostración de la utilización de 'String[] args'
 * Para ejecutar en IntelliJ se añaden en la configuración de la ejecución
 */
public class DemoArgs {
    public static void main(String[] args) {
        System.out.println("Vamos a imprimir los argumentos. ");
        for (int i = 0; i < args.length; i++) {
            System.out.println("El argumento en " + i + " es " + args[i]);
        }
    }
}
