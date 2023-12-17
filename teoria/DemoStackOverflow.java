package teoria;

public class DemoStackOverflow {
    public static void main(String[] args) {
        try{
            recursiveMethod(1);
        } catch (StackOverflowError e){
            System.out.println("Error de desbordamiento de pila");
        }
    }

    public static void recursiveMethod(int contador){
        System.out.println("Algoritmo recursivo número: " + contador);
        recursiveMethod(contador + 1);
    }
}
