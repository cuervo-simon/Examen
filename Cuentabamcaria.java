package CuentaBancaria;

public class Cuentabancaria {
    private double saldo;

    public Cuentabancaria (double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public double retirar(double monto) throws Exception {
        if (monto > saldo) {
            throw new Exception("Fondos insuficientes para realizar el retiro.");
        }

        saldo -= monto;
        return saldo;
    }
}
