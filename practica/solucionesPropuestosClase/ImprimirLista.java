package practica.solucionesPropuestosClase;

/**
 * @author Victor C. y Guillem D.
 */
public class ImprimirLista {

    // Método que acepta un número variable de argumentos (varargs) y los imprime
    public static void main(String[] args) {
        // Llamada al método con diferentes cantidades de argumentos
        imprimirLista("Manzana", "Banana", "Naranja");
        imprimirLista("Rojo", "Verde", "Azul", "Amarillo");
        imprimirLista();
    }

    public static void imprimirLista(String... elementos) {
        System.out.println("Elementos de la lista:");
        for (String elemento : elementos) {
            System.out.println(elemento);
        }
    }
}
