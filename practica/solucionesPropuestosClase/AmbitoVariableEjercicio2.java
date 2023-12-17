package practica.solucionesPropuestosClase;

/**
 * @author Arturo M.
 */
public class AmbitoVariableEjercicio2 {

    public static final Integer KM2_COM_VALENCIANA = 23255;

    public static void main(String[] args) {

        final double KM2_VALENCIA_CASTELLON = 16600.0;

        System.out.println("En la provincia de Valencia hay " + valencia() + " habitantes por km2");
        System.out.printf("En la provincia de Valencia hay %.2f habitantes por km2",castellon());

        double tantoPorCien = (KM2_VALENCIA_CASTELLON * 100) / KM2_COM_VALENCIANA;
        System.out.printf("\nLas provincias de Valencia y Castellón ocupan un %.2f%% del territorio de la Comunidad Valenciana.", tantoPorCien);
    }
    public static int valencia() {

        final int HABITANTES = 2500000;
        final int KM2 = 10000;
        return HABITANTES / KM2;

    }
    public static double castellon() {

        final double HABITANTES = 571000.0;
        final double KM2 = 6600.0;
        return HABITANTES / KM2;
    }
}
