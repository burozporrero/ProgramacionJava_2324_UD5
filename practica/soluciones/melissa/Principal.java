package soluciones.melissa;

import java.util.Scanner;

/**
 * @author Melissa G.
 */
public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su nick: ");
        String nick = scanner.nextLine();

        System.out.print("Ingrese su contraseña: ");
        String contrasena = scanner.nextLine();

        Usuario usuarioValidado = AdministradorSistema.validarUsuario(nick, contrasena);

        if (usuarioValidado != null) {
            System.out.println("¡Acceso permitido!");
            System.out.println("Último acceso: " + usuarioValidado.getFechaAcceso());
            System.out.println("Número de accesos: " + usuarioValidado.getAccesos());

            // Registrar el nuevo acceso
            usuarioValidado.registrarAcceso();
        } else {
            System.out.println("Acceso denegado. Verifique su nick y contraseña.");
        }
    }
}
