package solucionesPropuestosClase.Personajes;

import java.util.Scanner;

/**
 * @author David G.
 */
public class Main {
    public static void main(String[] args) {

        Personaje guerrero = new Personaje("Agnar", "Hacha de dos manos", "Espada larga", "Broquel", "Pechera tosca", "Anillo de guerrero", "Brazal", new Estadistica(100, 40, 80, 10, 80, 80, 50, 40, 10, 0));
        Personaje mago = new Personaje("Nyx", "Báculo", "Libro de hechizos", "No tiene", "Túnica arcana", "Anillo de maná", "Orbe de encantamientos", new Estadistica(80, 100, 10, 100, 20, 40, 70, 30, 30, 10));
        Personaje asesino = new Personaje("Edzio", "Daga ignea", "Daga helada", "No tiene", "Manto negro", "Anillo de velocidad", "Colgante crítico", new Estadistica(60, 80, 100, 30, 20, 20, 90, 100, 60, 50));

        Scanner sc = new Scanner(System.in);

        System.out.println("Elija su personaje:\n1.Guerrero\n2.Mago\n3.Asesino\n(Si no introduce un número válido, se elegirá por defecto la clase de Guerrero)");
        int eleccion = sc.nextInt();

        sc.nextLine(); // Consumir la nueva línea pendiente después de nextInt()

        Personaje personajeElegido;

        switch (eleccion) {
            case 1:
                personajeElegido = guerrero;
                break;
            case 2:
                personajeElegido = mago;
                break;
            case 3:
                personajeElegido = asesino;
                break;
            default:
                System.out.println("Has elegido la clase de guerrero por defecto.");
                personajeElegido = guerrero;
        }

        System.out.println("Has elegido " + personajeElegido.getNombre() + ". A continuación se mostrará su nombre y equipamiento:");
        System.out.println("Nombre: " + personajeElegido.getNombre() +
                "\nArma1: " + personajeElegido.getArma1() +
                "\nArma2: " + personajeElegido.getArma2() +
                "\nEscudo: " + personajeElegido.getEscudo() +
                "\nTorso: " + personajeElegido.getTorso() +
                "\nAccesorio1: " + personajeElegido.getAccesorio1() +
                "\nAccesorio2: " + personajeElegido.getAccesorio2());


        System.out.println("Seleccione un atributo (PV, PH, AtqFis, AtqElem, DefFis, DefElem, Prec, Vel, Crit, Evas): ");
        String atributoSeleccionado = sc.nextLine().toLowerCase();

        switch (atributoSeleccionado) {
            case "pv":
                System.out.println("Puntos de vida de " + personajeElegido.getNombre() + ": " + personajeElegido.getEstadisticas().getPv());
                break;
            case "ph":
                System.out.println("Puntos de habilidad de " + personajeElegido.getNombre() + ": " + personajeElegido.getEstadisticas().getPh());
                break;
            case "atqfis":
                System.out.println("Ataque físico de " + personajeElegido.getNombre() + ": " + personajeElegido.getEstadisticas().getAtqfis());
                break;
            case "atqelem":
                System.out.println("Ataque elemental de " + personajeElegido.getNombre() + ": " + personajeElegido.getEstadisticas().getAtqelem());
                break;
            case "deffis":
                System.out.println("Defensa física de " + personajeElegido.getNombre() + ": " + personajeElegido.getEstadisticas().getDeffis());
                break;
            case "defelem":
                System.out.println("Defensa elemental de " + personajeElegido.getNombre() + ": " + personajeElegido.getEstadisticas().getDefelem());
                break;
            case "prec":
                System.out.println("Precisión de " + personajeElegido.getNombre() + ": " + personajeElegido.getEstadisticas().getPrec());
                break;
            case "vel":
                System.out.println("Velocidad de " + personajeElegido.getNombre() + ": " + personajeElegido.getEstadisticas().getVel());
                break;
            case "crit":
                System.out.println("Crítico de " + personajeElegido.getNombre() + ": " + personajeElegido.getEstadisticas().getCrit());
                break;
            case "evas":
                System.out.println("Evasión de " + personajeElegido.getNombre() + ": " + personajeElegido.getEstadisticas().getEvas());
                break;
            default:
                System.out.println("Atributo no válido.");
        }
    }
}
