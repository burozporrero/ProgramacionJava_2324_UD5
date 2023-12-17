package practica.solucionesPropuestosClase;

import java.util.Scanner;

/**
 * Funciones "cogidas con pinzas" el enunciado es confuso, en sí, no veríamos la sobrecarga de métodos con el
 * enunciado dado.
 * He implementado una soluciona en el main, comentada, para ver la sobrecarga con valores dados en
 * los métodos.
 * También he empezado a implementar una solución completa. Solicitando toda la información y gestionándola a partir
 * de métodos. Esta solución solo está para la suma.
 *
 * @author b.urozporrero
 */
public class CalculadoraSobrecargada {

    static Scanner sc = new Scanner(System.in);
    static final int UNO = 1;
    static final int DOS = 2;

    static int[] operandosEnteros;
    static double[] operandosDecimales;
    public static void main(String[] args) {

        System.out.println("BIENVENIDO A APP CALCULADORA");
        System.out.println("En primer lugar ¿Con cuantos números quieres operar? mínimo 2 operadores y máximo 4");
        int numOperadores = sc.nextInt();

        // Gestión errores
        if(numOperadores < 2 || numOperadores > 4){
            System.out.println("Ha introducido un número de operadores no permitido. El programa se cerrará.");
            System.exit(0);
        }

        System.out.println("En segundo lugar ¿Con que tipo de número vas a operar? (1.Entero 2.Decimal))");
        int tipoDato = sc.nextInt();

        switch (tipoDato){
            case UNO: operandosEnteros = new int[numOperadores]; break;
            case DOS: operandosDecimales = new double[numOperadores]; break;
            default:
                // Gestión errores
                System.out.println("Ha introducido un tipo de datos no permitido. El programa se " +
                        "cerrará.");
                System.exit(0);
        }

        cargarNumeros(tipoDato, numOperadores);

        operar();

        System.out.println("FIN");

        /*
        System.out.println("Suma (enteros): " + suma(5, 3));
        System.out.println("Suma (decimales): " + suma(2.5, 3.7));

        System.out.println("Resta: " + resta(10, 2, 3));
        System.out.println("Multiplicación: " + multiplicacion(2, 3, 4, 5));

        // Probamos la división
        System.out.println("Division: " + division(8, 2));

        System.out.println("Division: " + division(8, 0));
        // ¿Qué ocurre en este caso? ha que método estamos llamando en concreto?
        System.out.println("Division: " + division(8, 2.6));
        System.out.println("Division: " + division(8.0, 2.6));
        System.out.println("Division: " + division(8.0, 0.0));
         */
    }

    public static void cargarNumeros(int tipoDato, int numOperadores){

        System.out.println("En tercer lugar introduce los números con los que vas a operar separados por ; " +
                " y cuando termines pulsa intro)");
        String operandos = sc.nextLine();

        String[] operandosArray = operandos.split(";");
        if(operandosArray.length != numOperadores){
            System.out.println("Ha introducido una cantidad de datos que no coincide con la indicada previamente. El " +
                    "programa se cerrará.");
        }

        if (tipoDato == UNO) {
            for(int i = 0 ; i < operandosArray.length ; i++) {
                operandosEnteros[i] = Integer.parseInt(operandosArray[i]);
            }
        } else {
            for(int i = 0 ; i < operandosArray.length ; i++) {
                operandosDecimales[i] = Double.parseDouble(operandosArray[i]);
            }
        }
    }

    public static void operar() {

        System.out.println("Escriba una operación de entre las siguientes +, -, /, +: ");

        String cadena = sc.next();
        char operacion = cadena.charAt(0);

        switch (operacion) {
            case '+':
                if(operandosEnteros != null && operandosEnteros.length > 0){
                    sumaEnteros();
                } else {
                    sumaDecimales();
                }
                break;
            case '-':
                // Repetir operaciones resta
                break;
            case '/':
                // Repetir operaciones división
                break;
            case '*':
                // Repetir operaciones multiplicación
                break;
            default:
                System.out.println("La operación introducida no es aceptada por el programa. El programa se cerrará.");
        }

    }

    public static void sumaEnteros(){
        switch (operandosEnteros.length){
            case 2:
                // Opción uno
                // suma(operandosEnteros); break;
                suma(operandosEnteros[0], operandosEnteros[1]);
                break;
            case 3:
                suma(operandosEnteros[0], operandosEnteros[1], operandosEnteros[2]);
                break;
            case 4:
                suma(operandosEnteros[0], operandosEnteros[1], operandosEnteros[2], operandosEnteros[3]);
                break;
            default: System.out.println("Ha ocurrido un error. El programa se cerrará.");
        }
    }

    public static void sumaDecimales(){
        switch (operandosDecimales.length){
            case 2:
                // Opción uno
                // suma(operandosEnteros); break;
                suma(operandosDecimales[0], operandosDecimales[1]);
                break;
            case 3:
                suma(operandosDecimales[0], operandosDecimales[1], operandosDecimales[2]);
                break;
            case 4:
                suma(operandosDecimales[0], operandosDecimales[1], operandosDecimales[2], operandosDecimales[3]);
                break;
            default: System.out.println("Ha ocurrido un error. El programa se cerrará.");
        }
    }

    public static void suma(double a, double b) {
        System.out.printf("El resultado de la suma %f + %f = %f", a, b, a + b);
    }

    public static void suma(double a, double b, double c) {
        System.out.printf("El resultado de la suma %f + %f + %f = %f", a, b, c, a + b + c);
    }

    public static void suma(double a, double b, double c, double d) {
        System.out.printf("El resultado de la suma %f + %f + %f + %f = %f", a, b, c, d, a + b + c + d);
    }

    public static void suma(int a, int b) {
        System.out.printf("El resultado de la suma %d + %d = %d", a, b, a + b);
    }

    public static void suma(int a, int b, int c) {
        System.out.printf("El resultado de la suma %d + %d + %d = %d", a, b, c, a + b + c);
    }

    public static void suma(int a, int b, int c, int d) {
        System.out.printf("El resultado de la suma %d + %d + %d + %d = %d", a, b, c, d, a + b + c + d);
    }

    public static int resta(int a, int b, int c) {

        return a - b - c;
    }

    public static double resta(double a, double b, double c) {

        return a - b - c;
    }

    public static int multiplicacion(int a, int b, int c, int d) {
        return a * b * c * d;
    }

    public static double multiplicacion(double a, double b, double c, double d) {
        return a * b * c * d;
    }
    public static int division(int a, int b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("No es posible dividir entre cero");
            return -1;
        }
    }

    public static double division(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("No es posible dividir entre cero");
            return Double.NaN;
        }
    }
}
