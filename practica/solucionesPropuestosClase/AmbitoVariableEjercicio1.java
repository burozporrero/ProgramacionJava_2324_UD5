package practica.solucionesPropuestosClase;

/**
 * @author Arturo M.
 */
public class AmbitoVariableEjercicio1 {

    public static Integer casa = 4;
    public static String jardin = "grande";
    public static void main(String[] args) {

        System.out.println("Valor variables globales recién inicializadas en la clase: ");
        System.out.println("casa " + casa);
        System.out.println("jardin " + jardin);

        metodo1();

        System.out.println("Valor variables globales después de llamar a método1: ");
        System.out.println("casa " + casa);
        System.out.println("jardin " + jardin);
    }
    public static void metodo1() {

        casa = 1;
        jardin = "no";
        int casa = 7;

        System.out.print("Valor de la variable local al metodo1 casa:");
        System.out.println(casa);
    }
}
