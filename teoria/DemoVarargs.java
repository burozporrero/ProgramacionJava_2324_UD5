package teoria;

public class DemoVarargs {

    public static void main(String[] args) {

        demoVarargs("Hola", "prueba", "demostracion" );
        System.out.print("\n");
        demoVarargs();
    }

    public static void demoVarargs(String... values) {
        System.out.print("Como parámetro vienen " + values.length + " elementos");

        if(values.length > 0){
            System.out.print(" y son los siguientes: ");
        }
        for (String value : values) {
            System.out.print(value + "\t");
        }
    }
}
