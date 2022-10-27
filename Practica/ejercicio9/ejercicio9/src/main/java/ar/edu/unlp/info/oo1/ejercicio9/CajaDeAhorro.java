package ar.edu.unlp.info.oo1.ejercicio9;

public class CajaDeAhorro extends Cuenta{
	
	public CajaDeAhorro() {
		super();
	}
	
	public void depositar(double monto) {
		super.depositar(monto-monto*0.02);
	}
	
	public boolean extraer(double monto) {
		return super.extraer(monto*1.02);
	}
	
	public boolean transferirACuenta(double monto, Cuenta cuenta) {
		return super.transferirACuenta(monto*1.02, cuenta);
	}
	
	@Override
	protected boolean puedeExtraer(double monto) {
		if (monto*1.02 <= saldo) {
			return true;
		}
		return false;
	}
}
