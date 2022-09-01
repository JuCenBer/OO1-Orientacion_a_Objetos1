package ar.edu.unlp.info.oo1.ejercicio2;

public class Producto {
	double peso;
	float precioPorKilo;
	String descripcion;
	

	public double getPrecio() {
		return this.precioPorKilo*this.peso;
	}
	
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public float getPrecioPorKilo() {
		return precioPorKilo;
	}
	public void setPrecioPorKilo(float precioPorKilo) {
		this.precioPorKilo = precioPorKilo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
}
