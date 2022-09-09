package ar.edu.unlp.info.oo1.ejercicio3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Presupuesto {
	LocalDate fecha;
	String cliente;
	private List<Item> items;
	
	public Presupuesto() {
		this.fecha = LocalDate.now();
		this.items = new ArrayList<Item>();
	}
	
	public Presupuesto cliente(String cliente) {
		this.cliente = cliente;
		return this;
	}
	
	public LocalDate getFecha() {
		return fecha;
	}
	
	public String getCliente() {
		return cliente;
	}
	
	public void agregarItem(Item item) {
		items.add(item);
	}
	
	public int calcularTotal() {
		int total = items.stream().mapToInt(items -> items.costo()).sum();
		return total;
	}
}
