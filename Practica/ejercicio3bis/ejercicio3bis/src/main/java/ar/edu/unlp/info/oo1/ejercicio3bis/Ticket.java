package ar.edu.unlp.info.oo1.ejercicio3bis;

import java.time.LocalDate;
import java.util.List;


public class Ticket {
	private LocalDate fecha;
	private int cantidadDeProductos;
	private List<Producto> productos;
	private double pesoTotal;
	private double precioTotal;
	
	
	public Ticket() {
		
	}
	
	public Ticket(int cantProductos, double peso, double precio, List<Producto> productos) {
		this.fecha = LocalDate.now();
		this.cantidadDeProductos = cantProductos;
		this.pesoTotal = peso;
		this.precioTotal = precio;
		this.productos = productos;
	}
	
	public List<Producto> getProductos(){
		return this.productos;
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
