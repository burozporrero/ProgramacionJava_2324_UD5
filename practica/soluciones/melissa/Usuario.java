package soluciones.melissa;

/**
 * @author Melissa G.
 */
public class Usuario {
    private String nick;
    private String contrasena;

    //TODO - Mejor usar tipos de datos dque ya conocemos LocalDaateTime sería el apropiado
    private String fechaAcceso;
    private int accesos;

    public Usuario(){
        super();
    }

    public Usuario(String nick, String contrasena) {
        this.nick = nick;
        this.contrasena = contrasena;
        this.fechaAcceso = "Nunca";
        this.accesos = 0;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getFechaAcceso() {
        return fechaAcceso;
    }

    public void setFechaAcceso(String fechaAcceso) {
        this.fechaAcceso = fechaAcceso;
    }

    public int getAccesos() {
        return accesos;
    }

    public void setAccesos(int accesos) {
        this.accesos = accesos;
    }
    public void registrarAcceso() {
        this.fechaAcceso = obtenerFechaActual();
        this.accesos++;
    }

    private String obtenerFechaActual() {
        // Simulación: devuelve la fecha actual (puedes implementar esto según tus necesidades)
        return "FechaActual";
    }
    // TODO el método siguiente podría ser muy apropiado para validad un usuario y no hacerlo en el main
    /*
    public boolean validarUsuario(String nick, String contrasena) {
        boolean isValid = Boolean.FALSE;
        if (this.getNick().equals(nick) && this.getContrasena().equals(contrasena)) {
            isValid = Boolean.TRUE;
        }
        return isValid;
    }
    */
    @Override
    public String toString() {
        return "Usuario{" +
                "nick='" + nick + '\'' +
                ", contrasena='" + contrasena + '\'' +
                ", fechaAcceso='" + fechaAcceso + '\'' +
                ", accesos=" + accesos +
                '}';
    }
}
