package CuentaBancaria;

public class cuentabancaria2 {
	

	    private double saldo;

	    public cuentabancaria2(double saldoInicial) {
	        this.saldo = saldoInicial;
	    }

	    public double retirar(double monto) throws Exception {
	        if (monto <= 0) {
	            throw new Exception("Monto inválido. Debe ser mayor que cero.");
	        }
	        if (monto > saldo) {
	            throw new Exception("Fondos insuficientes.");
	        }
	        saldo -= monto;
	        return saldo;
	    }

	    public static void main(String[] args) {
	        cuentabancaria2 cuenta = new cuentabancaria2 (500.0);

	        // Caso 1: Retiro válido
	        try {
	            double nuevoSaldo = cuenta.retirar(200.0);
	            System.out.println("Nuevo saldo: " + nuevoSaldo);
	        } catch (Exception e) {
	            System.out.println("Error: " + e.getMessage());
	        }

	        // Caso 2: Retiro de monto negativo
	        try {
	            double nuevoSaldo = cuenta.retirar(-50.0);
	            System.out.println("Nuevo saldo: " + nuevoSaldo);
	        } catch (Exception e) {
	            System.out.println("Error: " + e.getMessage());
	        }

	        // Caso 3: Retiro mayor que el saldo
	        try {
	            double nuevoSaldo = cuenta.retirar(600.0);
	            System.out.println("Nuevo saldo: " + nuevoSaldo);
	        } catch (Exception e) {
	            System.out.println("Error: " + e.getMessage());
	        }
	    }
	}
