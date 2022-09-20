package ar.edu.unlp.info.oo1.ejercicio7;

public class Empleado {
	private String nombre;
	
	public Empleado(String nombre) {
		this.nombre = nombre;
	}
	
	public double aportes() {
		return 35000;
	}
	
	public double montoBasico() {
		return 13500;
	}
	
	public double sueldoBasico() {
		return this.aportes() + this.montoBasico();
	}
}
