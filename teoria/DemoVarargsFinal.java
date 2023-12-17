package teoria;

public class DemoVarargsFinal {
    public static void main(String[] args) {

        demoVarargsFinal(5, "Juan", "Patricia", "Elena", "Pedro", "Daniel" );
        demoVarargsFinal(9, "Juan" );
        demoVarargsFinal(0);

    }

    public static void demoVarargsFinal(int cantidad, String... values) {

        if(cantidad == values.length){
            System.out.println("La cantidad de alumnos recibida es correcta");
        } else {
            System.out.println("No se indica la misma cantidad de alumnos que parámetros se reciben");
        }
    }
}
