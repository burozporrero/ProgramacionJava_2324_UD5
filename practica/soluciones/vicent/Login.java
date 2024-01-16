package soluciones.vicent;


import java.time.LocalTime;
import java.util.Scanner;

/**
 * @author Vicent P.
 */
public class Login {
    private static Usuario[] users = new Usuario[3];
    private static final Scanner SC = new Scanner(System.in);
    public static void main(String[] args) {
        users[0] = new Usuario("AxV", "200623");
        users[1] = new Usuario("Roberto05", "1234");
        users[2] = new Usuario("Raquel", "060604");

        boolean exit;
        boolean repeat;
        int opcion;

        do {
            exit = false;
            System.out.println("**Login**\n");
            System.out.print("Introduce tu usuario: ");
            String user = SC.next();
            System.out.print("Introduce tu contraseña: ");
            String contra = SC.next();

            Usuario loginUser = new Usuario(user, contra);
            int nCuenta = inicioSesion(loginUser);

            if (nCuenta != -1){
                // TODO - Mejor gestionar el do siguiente en un método diferente, para no tener tanta complejidad 
                //  ciclomática dentro del mismo método
                do {
                    repeat = false;
                    System.out.println("\n**Gestión de la cuenta**");
                    System.out.println("\t1: Cambiar contraseña");
                    System.out.println("\t2: Cerrar sesión");
                    System.out.println("\t3: Terminar el programa ");
                    System.out.println("¿Cual de las anteriores opciones quieres realizar (1/2/3)? ");
                    opcion = SC.nextInt();

                    switch (opcion) {
                        case 1:
                            changePasswd(nCuenta);
                            repeat = true;
                            break;
                        case 2:
                            System.out.println("Cerrando sesión...\n");
                            break;
                        case 3:
                            System.out.println("Cerrando el programa...");
                            exit = true;
                            break;
                        default:
                            System.out.print("ERROR: Se debe escojer entre (1/2/3). Vuelvelo a intentar.");
                    }
                } while (repeat);
            }
        }while (!exit);
        SC.close();
    }
    public static int inicioSesion(Usuario loginUser) {
        int encontrado = -1;
        for (int i = 0; i < users.length; i++) {
            if (loginUser.getNom().equals(users[i].getNom()) && loginUser.getPasswd().equals(users[i].getPasswd())) {
                saludaUsuario(users[i]);
                return i;
            }
        }

        System.out.println("ERROR: El usuario o la contraseña son incorrectos. Introducelo otra vez.");
        return encontrado;
    }

    public static void saludaUsuario(Usuario loginUser){

        loginUser.acceso();
        if (loginUser.getnInicios() == 1) {
            System.out.println("Se ha iniciado por primera vez en  el usuario " + loginUser.getNom());
        } else {
            System.out.println("Se han iniciado " + loginUser.getnInicios() + " veces en el usuario " + loginUser.getNom());
            System.out.println("Ultimo acceso: " + loginUser.getUltimoInicio());
        }
    }

    public static void changePasswd(int nCuenta) {
        String passwd;
        String confirmPasswd;
        boolean exit = false;
        do {
            System.out.print("Por cuestiones de seguridad. Vuelve a introducir la contraseña actual: ");
            passwd = SC.next();

            if (passwd.equals(users[nCuenta].getPasswd())) {
                // TODO - Mejor gestionar el do siguiente en un método diferente, para no tener tanta complejidad
                //  ciclomática dentro del mismo método
                do {
                    System.out.print("Introduce tu nueva contraseña: ");
                    passwd = SC.next();
                    System.out.print("Introduce otra vez tu nueva contraseña: ");
                    confirmPasswd = SC.next();

                    if (passwd.equals(confirmPasswd)) {
                        users[nCuenta].setPasswd(confirmPasswd);
                        System.out.println("\nContraseña cambiada correctamente.\n");
                        exit = true;
                    } else {
                        System.out.print("ERROR. No coinciden. ");
                    }
                } while (!exit);
            } else {
                System.out.print("ERROR. No coincide. ");
            }
        } while (!exit);
    }
}
