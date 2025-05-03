package cuentas;

public class cuenta {
	private double saldo; 
	
	public void depositar (double monto) {
		if (monto > 0) saldo += monto; 
	}
	
	public double getSaldo () {
		return saldo;
	}

} 
