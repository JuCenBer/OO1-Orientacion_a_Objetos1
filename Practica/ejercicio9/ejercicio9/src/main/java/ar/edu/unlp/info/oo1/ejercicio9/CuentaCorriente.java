package ar.edu.unlp.info.oo1.ejercicio9;

public class CuentaCorriente extends Cuenta{

	private double descubierto;
	
	public CuentaCorriente() {
		super();
		this.descubierto = 0;
	}
	
	public double getDescubierto() {
		return 0;
	}
	
	public void setDescubierto(double descubierto) {
		this.descubierto = descubierto;
	}
	
	@Override
	public boolean puedeExtraer(double monto) {
		if (monto <= saldo + descubierto) return true;
		return false;
	}
}
