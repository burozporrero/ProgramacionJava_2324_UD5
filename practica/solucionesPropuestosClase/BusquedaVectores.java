package practica.solucionesPropuestosClase;

import java.util.Scanner;

/**
 * @author Jaime G. y Hugo A.
 */
public class BusquedaVectores {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        String[] palabras = new String[5];
        String palabraBuscar;

        System.out.println("--Bienvenido a la aplicación para buscar palabras--");

        declararPalabras(palabras);

        System.out.print("Introduzca la palabra que desea buscar:");
        palabraBuscar = sc.next();

        buscar(palabras, palabraBuscar);
    }

    //Declaramos las palabras
    static void declararPalabras(String[] palabras) {

        System.out.println("En primer lugar definamos una lista de 5 palabras entre las que buscaremos la palabra " +
                "clave");

        for (int i = 0; i < palabras.length; i++) {

            System.out.print("Introduzca la palabra numero " + (i + 1) + ":");
            palabras[i] = sc.next();
        }
    }

    //Buscar en el array
    public static void buscar(String[] palabras, String buscar) {

        String encontradoPosiciones = "";

        for (int i = 0; i < palabras.length; i++) {
            if (buscar.equalsIgnoreCase(palabras[i])) {
                encontradoPosiciones += encontradoPosiciones.isEmpty()? Integer.toString(i + 1) :
                        ", " + Integer.toString(i + 1);
            }
        }
        if (encontradoPosiciones.isEmpty()){
            System.out.println("No esta en el vector");
        } else {
            System.out.print("La palabra existe en el vector en ");
            System.out.print(encontradoPosiciones.contains(",")? "las posiciones " : "la posición ");
            System.out.print(encontradoPosiciones);
        }
    }
}
