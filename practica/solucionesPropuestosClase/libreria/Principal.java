package solucionesPropuestosClase.libreria;

import java.util.Scanner;

/**
 * @author Hugo A.
 */
public class Principal {

    public static void main(String[] args) {
        //Todos los libros declarados
        Libro[] libro = new Libro[6];
        libro[0] = new Libro("9783140464079", "El principito", "Antonie de Saint", 96);
        libro[1] = new Libro("9788487592202", "El psicoanalista", "John Katzenbach", 544);
        libro[2] = new Libro("9788408163381", "La sombra del viento", "Carlos Ruiz", 672);
        libro[3] = new Libro("9788408043637", "El codido de Da Vinci", "Dan Brown", 592);
        libro[4] = new Libro("9788499082479", "El nombre del viento", "Patrick Rothfuss", 880);
        libro[5] = new Libro("9788445000907", "El hobbit", "J.R.R Tolkien", 320);
        //---------------------------------------------------------------------------------------------------------------
        String textoInsertado;
        Scanner sc = new Scanner(System.in);

        System.out.println("""
                --Bienvenido a la libreria--
                Escriba el ISBN o el Titulo
                para obtener mas informacion
                sobre estos libros: """);
        System.out.println("------------------------------------");

        for (int i = 0; i < libro.length; i++) {
            System.out.println("Del libro " + (i + 1) + " tiene este ISBN y titulo");
            libro[i].imprimirISBNTitulo();
            System.out.println("------------------------------------");
        }

        System.out.print("Introduzca el titulo o el ISBN del libro que quiere mas informacion: ");
        textoInsertado = sc.nextLine();
        System.out.println("------------------------------------");

        for (int i = 0; i < libro.length; i++) {
            if (textoInsertado.equalsIgnoreCase(libro[i].getISBN()) || textoInsertado.equalsIgnoreCase(libro[i].getTitulo())) {
                libro[i].imprimirLibroCompleto();
            }

        }
    }
}
