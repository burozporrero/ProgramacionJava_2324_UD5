package practica.solucionesPropuestosClase;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * @author Victor C. y Guillem D.
 */
public class JugarConListas {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        ArrayList<String> playList;
        boolean isEnd = false;

        System.out.println("** Aplicación para jugar a operar con ArraysList **");
        System.out.println("Empezamos rellenando palabras en un ArrayList.");
        playList = crearLista();

        do {
            int opcionMenu = seleccionarOpcionMenu();
            switch (opcionMenu) {
                case 1:
                    mostrarLista(playList);
                    break;
                case 2:
                    agregarElemento(playList);
                    break;
                case 3:
                    buscarElemento(playList);
                    break;
                case 4:
                    eliminarElemento(playList);
                    break;
                case 5:
                    modificarElemento(playList);
                    break;
                case 6:
                    limpiarLista(playList);
                    break;
                case 7:
                    ordenarLista(playList);
                    break;
                default:
                    if (opcionMenu == 8) {
                        isEnd = true;
                    } else {
                        System.out.println("Vuelva a intentarlo.");
                    }
            }
        } while (!isEnd);

        sc.close();
    }

    public static ArrayList<String> crearLista() {

        final String BREAK_STRING = "salir";

        ArrayList<String> nuevoArrayList = new ArrayList<>();
        String input;

        do {
            System.out.println("Introduce nueva palabra para el ArrayList o escribe 'salir' para terminar de introducir datos");
            input = sc.next();
            if (!input.equalsIgnoreCase(BREAK_STRING)) {
                nuevoArrayList.add(input);
            } else {
                System.out.println("Finalizando entrada de datos");
                break;
            }
        } while (!input.equalsIgnoreCase(BREAK_STRING));
        return nuevoArrayList;
    }

    /**
     * Pinta un menú de 7 opciones para realizar sobre un arrayList. Devuelve la opción de menús seleccionada por el
     * usuario. Un 8 si desea terminar el programa y un 0 si a ocurrido un error controlado.
     *
     * @return opcion de menú seleccionada. Retorna un 0 si ha ocurrido algún error controlado.
     */
    public static int seleccionarOpcionMenu() {

        int opcionMenu;
        System.out.println("\n---");
        System.out.println("Menu de operaciones");
        System.out.println("1. Mostrar la lista");
        System.out.println("2. Agregar un elemento");
        System.out.println("3. Buscar un elemento");
        System.out.println("4. Eliminar un elemento");
        System.out.println("5. Modificar un elemento");
        System.out.println("6. Limpiar la lista");
        System.out.println("7. Ordenar la lista");
        System.out.println("8. Salir del programa");
        try {
            opcionMenu = sc.nextInt();

            if (opcionMenu < 1 || opcionMenu > 8) {
                System.out.println("Ha introducido un valor no válido.");
                opcionMenu = 0;
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Ha introducido un valor no válido.");
            opcionMenu = 0;
        }

        return opcionMenu;
    }

    public static void mostrarLista(ArrayList<String> nuevoArrayList) {
        if (nuevoArrayList == null || nuevoArrayList.isEmpty()) {
            System.out.println("La lista esta vacía");
            return;
        }

        // En principio bastaría con ejecutar un toString
        System.out.println(nuevoArrayList.toString());

        // Pero si necesitamos imprimir con un formato específico, debemos usar el for, no el foreach
        for (int i = 0 ; i < nuevoArrayList.size() ; i++) {
            System.out.println(i + ". " + nuevoArrayList.get(i));
        }
    }

    public static void agregarElemento(ArrayList<String> nuevoArrayList) {

        if (nuevoArrayList == null || nuevoArrayList.isEmpty()) {
            System.out.println("La lista esta vacía");
            return;
        }

        System.out.println("Introduce el nuevo elemento");
        nuevoArrayList.add(sc.next());
    }

    public static void buscarElemento(ArrayList<String> nuevoArrayList) {

        if (nuevoArrayList == null || nuevoArrayList.isEmpty()) {
            System.out.println("La lista esta vacía");
            return;
        }

        System.out.println("Introduce elemento a buscar");
        String elementoBuscado = sc.next();
        boolean encontrado = false;
        for (int i = 0; i < nuevoArrayList.size(); i++) {
            if (nuevoArrayList.get(i).equalsIgnoreCase(elementoBuscado)) {
                System.out.println("El elemento se encuentra en la posicion " + i);
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("El elemento " + elementoBuscado + " no se ha encontrado");
        }
    }

    public static void eliminarElemento(ArrayList<String> nuevoArrayList) {

        if (nuevoArrayList == null || nuevoArrayList.isEmpty()) {
            System.out.println("La lista esta vacía");
            return;
        }

        System.out.println("Deseas eliminarlo por indice o buscando la palabra a eliminar?");
        System.out.println("1. Indice");
        System.out.println("2. Buscar");
        int eliminarPor = sc.nextInt();
        switch (eliminarPor) {
            case 1:
                eliminarIndice(nuevoArrayList);
                break;
            case 2:
                eliminarBusqueda(nuevoArrayList);
                break;
            default:
                System.out.println("Opción no valida");
                break;
        }
    }

    public static void eliminarIndice(ArrayList<String> nuevoArrayList) {

        if (nuevoArrayList == null || nuevoArrayList.isEmpty()) {
            System.out.println("La lista esta vacía");
            return;
        }

        System.out.println("Introduce el indice del elemento que deseas eliminar");
        int indiceEliminar = sc.nextInt();

        // Este bloque es sustituible por el siguiente
        if (indiceEliminar >= nuevoArrayList.size() || indiceEliminar < 0) {
            System.out.println("Indice fuera de rango");
        } else {
            nuevoArrayList.remove(indiceEliminar);
            System.out.println("Elemento eliminado");
        }

        // Por este
        try {
            nuevoArrayList.remove(indiceEliminar);
            System.out.println("Elemento eliminado");
        } catch (IndexOutOfBoundsException e){
            System.out.println("Indice fuera de rango");
        }
    }

    public static void eliminarBusqueda(ArrayList<String> nuevoArrayList) {

        if (nuevoArrayList == null || nuevoArrayList.isEmpty()) {
            System.out.println("La lista esta vacía");
            return;
        }

        System.out.println("Introduce el elemento que deseas eliminar");
        String elementoBuscado = sc.next();

        // OPCIÓN 1
        boolean borrado = nuevoArrayList.removeIf(elementoBuscado::equals);
        System.out.println(borrado?"Se ha encontrado y eliminado" : "El elemento no se ha encontrado");

        // OPCIÓN 2
        boolean encontrado = false;

        for (int i = 0; i < nuevoArrayList.size(); i++) {
            if (nuevoArrayList.get(i).equalsIgnoreCase(elementoBuscado)) {
                System.out.println("Se ha encontrado y eliminado '" + elementoBuscado + "' en la posicion " + i);
                nuevoArrayList.remove(i);
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("El elemento " + elementoBuscado + " no se ha encontrado");
        }

    }

    public static void modificarElemento(ArrayList<String> nuevoArrayList) {

        if (nuevoArrayList == null || nuevoArrayList.isEmpty()) {
            System.out.println("La lista esta vacía");
            return;
        }

        System.out.println("Introduce la nueva palabra para modificar una anterior");
        String nuevaPalabra = sc.next();

        System.out.println("Deseas modificar por indice o buscando la palabra a modificar?");
        System.out.println("1. Indice");
        System.out.println("2. Buscar");
        int modificarPor = sc.nextInt();
        switch (modificarPor) {
            case 1:
                modificarIndice(nuevoArrayList, nuevaPalabra);
                break;
            case 2:
                modificarBusqueda(nuevoArrayList, nuevaPalabra);
                break;
            default:
                System.out.println("Opción no valida");
                break;
        }
    }

    public static void modificarIndice(ArrayList<String> nuevoArrayList, String nuevaPalabra) {

        if (nuevoArrayList == null || nuevoArrayList.isEmpty()) {
            System.out.println("La lista esta vacía");
            return;
        }

        System.out.println("Introduce el indice del elemento que deseas modificar");
        int indiceModificar = sc.nextInt();

        // Este bloque es sustituible por el siguiente
        if (indiceModificar >= nuevoArrayList.size() || indiceModificar < 0) {
            System.out.println("Indice fuera de rango");
        } else {
            nuevoArrayList.set(indiceModificar, nuevaPalabra);
            System.out.println("Elemento modificado");
        }

        // Por este
        try {
            nuevoArrayList.set(indiceModificar, nuevaPalabra);
            System.out.println("Elemento modificado");
        } catch (IndexOutOfBoundsException e){
            System.out.println("Indice fuera de rango");
        }
    }

    public static void modificarBusqueda(ArrayList<String> nuevoArrayList, String nuevaPalabra) {

        if (nuevoArrayList == null || nuevoArrayList.isEmpty()) {
            System.out.println("La lista esta vacía");
            return;
        }

        System.out.println("Introduce el elemento a buscar y modificar");
        String elementoBuscado = sc.next();
        boolean encontrado = false;
        for (int i = 0; i < nuevoArrayList.size(); i++) {
            if (nuevoArrayList.get(i).equalsIgnoreCase(elementoBuscado)) {
                System.out.println("Se ha encontrado y modificado '" + elementoBuscado + "' en la posicion " + i + " por " + nuevaPalabra);
                nuevoArrayList.set(i, nuevaPalabra);
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("El elemento " + elementoBuscado + " no se ha encontrado");
        }

    }

    public static void limpiarLista(ArrayList<String> nuevoArrayList) {
        nuevoArrayList.clear();
        System.out.println("Lista limpiada");
    }

    public static void ordenarLista(ArrayList<String> nuevoArrayList) {

        if (nuevoArrayList == null || nuevoArrayList.isEmpty()) {
            System.out.println("La lista esta vacía");
            return;
        }

        Collections.sort(nuevoArrayList);
        System.out.println("Lista ordenada");
    }
}
