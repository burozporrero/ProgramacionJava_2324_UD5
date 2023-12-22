package practica.solucionesPropuestosClase.banco;

/**
 * @author Izan R.
 */
class CuentaBancaria {
    // Atributos
    private final String numeroCuenta;
    private double saldo;

    // Constructor
    public CuentaBancaria(String numeroCuenta, double saldoInicial) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldoInicial;
    }

    // Método para depositar dinero
    public void depositar(double cantidad) {
        saldo += cantidad;
        System.out.println("Deposito de " + cantidad + " realizado. Nuevo saldo: " + saldo);
    }

    // Método para retirar dinero
    public void retirar(double cantidad) {
        if (saldo >= cantidad) {
            saldo -= cantidad;
            System.out.println("Retiro de " + cantidad + " realizado. Nuevo saldo: " + saldo);
        } else {
            System.out.println("Saldo insuficiente para realizar el retiro.");
        }
    }

    // Método para mostrar el saldo actual
    public void mostrarSaldo() {
        System.out.println("Saldo actual de la cuenta " + numeroCuenta + ": " + saldo);
        System.out.println("-------------");
    }
}
