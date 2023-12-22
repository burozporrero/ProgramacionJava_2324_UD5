package practica.solucionesPropuestosClase.banco;

/**
 * @author Izan R.
 */
public class GestionBanco {
    public static void main(String[] args) {
        // Crear objetos CuentaBancaria
        CuentaBancaria cuenta1 = new CuentaBancaria("666", 1000.0);
        CuentaBancaria cuenta2 = new CuentaBancaria("777", 500.0);

        // Realizar transacciones y mostrar saldos
        cuenta1.mostrarSaldo();
        cuenta1.depositar(200.0);
        cuenta1.retirar(50.0);
        cuenta1.mostrarSaldo();

        cuenta2.mostrarSaldo();
        cuenta2.retirar(200.0);
        cuenta2.depositar(100.0);
        cuenta2.mostrarSaldo();
    }
}
