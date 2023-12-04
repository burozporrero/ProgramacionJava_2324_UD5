package teoria;
public class PasoPorValorDemo {

    public static void main(String[] args) {
        int numero = 5;
        duplicar(numero);
        System.out.println("Número fuera del método: " + numero);
    }

    static public void duplicar(int numero) {
        numero = numero * 2;
        System.out.println("Número dentro del método: " + numero);
    }
}
