package ar.edu.unlp.info.oo1.ejercicio2;

import java.time.LocalDate;


public class Ticket {
	LocalDate fecha;
	int cantidadDeProductos;
	double pesoTotal;
	double precioTotal;
	
	public Ticket(int cantProductos, double peso, double precio) {
		this.fecha = LocalDate.now();
		this.cantidadDeProductos = cantProductos;
		this.pesoTotal = peso;
		this.precioTotal = precio;
	}
	
	public double impuesto() {
		return precioTotal*0.21;
	}
	
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha() {
		this.fecha = LocalDate.now();
	}
	public int getCantidadDeProductos() {
		return cantidadDeProductos;
	}
	public void setCantidadDeProductos(int cantidadDeProductos) {
		this.cantidadDeProductos = cantidadDeProductos;
	}
	public double getPesoTotal() {
		return pesoTotal;
	}
	public void setPesoTotal(double pesoTotal) {
		this.pesoTotal = pesoTotal;
	}
	public double getPrecioTotal() {
		return precioTotal;
	}
	public void setPrecioTotal(double precioTotal) {
		this.precioTotal = precioTotal;
	}
	
	
}
