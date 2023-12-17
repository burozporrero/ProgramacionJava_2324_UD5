package practica.solucionesPropuestosClase;

import java.util.Scanner;

public class CalculadoraAreaVolumen {

    static Scanner sc = new Scanner(System.in);

    static final int UNO = 1;
    static final int DOS = 2;
    static final int TRES = 3;
    public static void main(String[] args) {

        System.out.println("CALCULADORA DE ÁREAS Y VOLÚMENES");
        System.out.println("IMPORTANTE: Los datos tienen que estar en las unidades del SI");
        System.out.print("¿Quiere calcular el area(1) de una superficie o el volumen(2) de un objeto? ");
        int operacion = sc.nextInt();

        switch (operacion){
            case UNO: calcularArea(); break;
            case DOS: calcularVolumen(); break;
            default: System.out.println("Ha elegido una operación que no es válida. El programa se cerrará");
        }

        System.out.println("FIN");
    }

    public static void calcularArea() {

        final String[] figuras = {"Cuadrado (rectángulo)", "Triángulo (equilátero)", "Círculo"};
        double area;

        switch (obtenerFigura(figuras)){
            case UNO: area = areaCuadrado(figuras[0]); break;
            case DOS: area = areaTriangulo(figuras[1]); break;
            case TRES: area = areaCirculo(figuras[2]); break;
            default: System.out.println("ERROR: Figura seleccionada no válida"); return;
        }

        System.out.printf("El área de la figura es %.2f metros cuadrados. \n", area);
    }

    public static void calcularVolumen() {

        final String[] figuras = {"Cubo", "Piramide", "Cilindro"};
        double volumen;

        switch (obtenerFigura(figuras)){
            case UNO: volumen = volumenCubo(figuras[0]); break;
            case DOS: volumen = volumenPiramide(figuras[1]); break;
            case TRES: volumen = volumenCilindro(figuras[2]); break;
            default: System.out.println("ERROR: Figura seleccionada no válida"); return;
        }

        System.out.printf("El volumen de la figura es %.2f metros cúbicos. \n", volumen);
    }

    public static int obtenerFigura(String[] figuras) {
        Scanner sc = new Scanner(System.in);

        System.out.println("¿Sobre que figura quieres hacer los cálculos? ");
        for(int i = 0 ; i < figuras.length ; i++){

            System.out.print("(" + (i + 1) + ") " + figuras[i]);
            System.out.print(i == figuras.length - 1? "\n" : ", ");
        }

        int figuraSeleccionada = Math.abs(sc.nextInt());

        if (figuraSeleccionada <= 0 || figuraSeleccionada > figuras.length) {
            System.out.println("ERROR: La elección no se corresponde con una figura no válida");
        }

        return figuraSeleccionada;
    }

    public static double areaCuadrado(String texto) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la longitud de los lados de tu " + texto);
        System.out.print("1: ");
        double lado1 = sc.nextDouble();
        System.out.print("2: ");
        double lado2 = sc.nextDouble();

        return lado1 * lado2;
    }

    public static double areaTriangulo(String texto) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la longitud de los lados de tu " + texto);
        double lados = sc.nextDouble();

        return lados * lados * Math.cbrt(3) / 4;
    }

    public static double areaCirculo(String texto) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el radio de tu " + texto);
        double radio = sc.nextDouble();

        return Math.PI * radio * radio;
    }

    public static double volumenCubo(String texto) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la longitud de los lados de tu " + texto);
        System.out.print("1: ");
        double lado1 = sc.nextDouble();
        System.out.print("2: ");
        double lado2 = sc.nextDouble();
        System.out.print("3: ");
        double lado3 = sc.nextDouble();

        return lado1 * lado2 * lado3;
    }

    public static double volumenPiramide(String texto) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce los siguientes datos de tu " + texto);
        System.out.print("Primer lado de la base: ");
        double lado1 = sc.nextDouble();
        System.out.print("Segundo lado de la base: ");
        double lado2 = sc.nextDouble();
        System.out.print("Altura de la pirámide: ");
        double altura = sc.nextDouble();

        return lado1 * lado2 * altura * 1 / 3;
    }

    public static double volumenCilindro(String texto) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce los siguientes datos de tu " + texto);
        System.out.print("El radio: ");
        double radio = sc.nextDouble();
        System.out.print("La altura: ");
        double altura = sc.nextDouble();

        return Math.PI * radio * radio * altura;
    }
}
