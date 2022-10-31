package ar.edu.unlp.info.oo1.ejercicio_11;

public class InversionEnAcciones implements Inversion{
	private String nombre;
	private int cantidad;
	private double valorUnitario; 
		
	public InversionEnAcciones(String nombre, int cantidad, double valorUnitario) {
		this.nombre = nombre;
		this.cantidad = cantidad;
		this.valorUnitario = valorUnitario;
	}
	
	
	public double valorActual() {
		return valorUnitario * cantidad; 
	}
}
