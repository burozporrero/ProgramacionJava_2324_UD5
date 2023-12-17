package teoria;

public class DemoSobrecarga {

    public static void main(String[] pattern) {

    }
    public void sumar(int a, int b)
    {
        int suma=a+b;
        System.out.println("la suma es: "+suma);
    }

    public void sumar(double a, double b)
    {
        double suma=a+b;
        System.out.println("la suma es: "+suma);
    }
}
