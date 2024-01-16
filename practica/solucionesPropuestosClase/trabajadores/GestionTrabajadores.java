package solucionesPropuestosClase.trabajadores;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Juan L. y Ángel M.
 */
public class GestionTrabajadores {

    static Scanner sc = new Scanner(System.in);
    static final String SI = "S";
    static ArrayList<Proyecto> listaProyectosEmpresa = new ArrayList<>();
    static ArrayList<Trabajador> listaTrabajadoresEmpresa = new ArrayList<>();

    public static void main(String[] args) {

        int opcionMenu;
        sc.useDelimiter("\n");

        System.out.println("**Bienvenido a la gestión de trabajadores de la empresa.**");

        do {
            opcionMenu = seleccionarOpcionMenu();
            switch (opcionMenu) {
                case 1:
                    addProyectos();
                    break;
                case 2:
                    addTrabajadores();
                    break;
                case 3:
                    if(listaTrabajadoresEmpresa.isEmpty()) {
                        System.out.println("No hay trabajadores guardados. ");
                    } else {
                        listarTrabajadores();
                    }
                    break;
                default:
                    System.out.println("Hasta pronto!");
            }
        } while (opcionMenu != 0);
    }

    /**
     * @return opcion de menú seleccionada. Retorna un 0 shay que salir de la aplicación.
     */
    public static int seleccionarOpcionMenu() {

        String opcion;
        int opcionMenu = 0;
        System.out.println("-----------------------------------------");
        System.out.println("Indique que función desea realizar: ");
        System.out.println("1. Introducir proyectos");
        System.out.println("2. Introducir trabajadores");
        System.out.println("3. Mostrar relación trabajador/proyectos");
        System.out.println("Cualquier otro valor para Salir de la aplicación");
        System.out.println("-----------------------------------------");

        opcion = sc.next();

        if (opcion.equalsIgnoreCase("1") || opcion.equalsIgnoreCase("2") || opcion.equalsIgnoreCase(
                "3")) {
            opcionMenu = Integer.parseInt(opcion);
        }

        return opcionMenu;
    }

    public static void addProyectos() {

        boolean addMore = Boolean.TRUE;

        do {
            System.out.print("Introduzca el nombre del proyecto: ");
            String nombre = sc.next();
            System.out.print("Introduzca una breve descripción: ");
            String descripcion = sc.next();

            Proyecto proyecto = new Proyecto(nombre, descripcion);
            listaProyectosEmpresa.add(proyecto);

            System.out.println("Desea introducir otro proyecto? (s/n) ");
            String continuar = sc.next();

            if(!continuar.equalsIgnoreCase(SI)){
                addMore = Boolean.FALSE;
            }
        } while (addMore);
    }

    public static void addTrabajadores() {

        boolean addMore = Boolean.FALSE;
        String texto = SI;

        if(listaProyectosEmpresa.isEmpty()) {
            System.out.println("No hay proyectos guardados. ¿Creará trabajadores sin proyecto? (s/n)");
            texto = sc.next();
        }

        if(!SI.equalsIgnoreCase(texto)) {
            return;
        }

        do {
            Trabajador trabajador = obtenerTrabajador();
            listaTrabajadoresEmpresa.add(trabajador);

            System.out.println("Desea introducir otro trabajador? (s/n) ");
            String continuar = sc.next();

            if(continuar.equalsIgnoreCase(SI)){
                addMore = Boolean.TRUE;
            }
        } while (addMore);
    }

    public static Trabajador obtenerTrabajador(){

        System.out.print("Introduzca el nombre del trabajador: ");
        String nombre = sc.next();
        System.out.print("Introduzca su edad: ");
        int edad = sc.nextInt();
        System.out.print("Introduzca su salario mensual: ");
        double salario = sc.nextDouble();
        Trabajador trabajador = new Trabajador(nombre, edad, salario);

        System.out.println("En que proyecto, de los siguientes, está trabajando? (Indique s/n)");
        for (Proyecto proyecto : listaProyectosEmpresa) {
            System.out.print(" - " + proyecto.getNombre() + ": ");
            String texto = sc.next();
            if (texto.equalsIgnoreCase(SI)){
                trabajador.setProyecto(proyecto);
                break;
            }
        }

        return trabajador;
    }

    public static void listarTrabajadores() {
        int numeroTrabajador = 1;
        for (Trabajador trabajador : listaTrabajadoresEmpresa) {
            trabajador.imprimirDatos(numeroTrabajador);
        }
    }
}
