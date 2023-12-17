package practica.solucionesPropuestosClase;

/**
 * Revisar solución en clase
 * @author Fernando F.
 */
public class Conversor {

    public double convertirAKilometros(double metros) {
        return metros / 1000.0;
    }
    public double convertirAPulgadas(double centimetros) {
        return centimetros / 2.54;
    }
    public void convertirUnidades(double metros, double centimetros){
        System.out.println(metros + " metros equivale a " + convertirAKilometros(metros) + " kilometros");
        System.out.println(centimetros + " centimetros equivale a " + convertirAPulgadas(centimetros) + " pulgadas");
    }

    public static void main(String[] args) {
        Conversor convertidora = new Conversor();

        System.out.println("Conversion de metros a kilometros: " + convertidora.convertirAKilometros(2000.0));
        System.out.println("Conversion de centimetros a pulgadas: " + convertidora.convertirAPulgadas(50.0));

        System.out.println("Conversion combinada:");
        convertidora.convertirUnidades(3000.0, 75.0);
    }
}
