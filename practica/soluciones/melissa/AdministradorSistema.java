package soluciones.melissa;

/**
 * @author Melissa G.
 */
public class AdministradorSistema {
    //clase para crear usuarios y método estático para
    //validar usuarios en el main.
    private static Usuario[] usuarios = {
            new Usuario("melissa", "melissa23"),
            new Usuario("xavi", "xavi23" )
    };
    public static Usuario validarUsuario(String nick, String contrasena) {
        for (Usuario usuario : usuarios) {
            if (usuario.getNick().equals(nick) && usuario.getContrasena().equals(contrasena)) {
                return usuario;
            }
            // TODO si activamos el método con el TODO de la clase usuario podriamos simplificar y hacer más elegante
            //  el if
            /*
            if(usuario.validarUsuario(nick, contrasena))
             */
        }
        return null;
    }
}
