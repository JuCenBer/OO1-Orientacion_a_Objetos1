package ar.edu.unlp.info.oo1.ejercicio8;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
	private String domicilio;
	private String nombre;
	private List<Factura> facturas;
	private List<Consumo> consumos;
	
	public Usuario(String nombre, String domicilio) {
		consumos = new ArrayList<Consumo>();
		facturas = new ArrayList<Factura>();
		this.domicilio = domicilio;
		this.nombre = nombre;
	}
	
	public String getDomicilio() {
		return domicilio;
	}
	
	public List<Consumo> getConsumos() {
		return consumos;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public void agregarMedicion(Consumo medicion) {
		consumos.add(medicion);
	}
	
	public double ultimoConsumoActiva() {
		if (consumos.size() != 0) {
			return this.consumos.get(consumos.size() - 1).getConsumoEnergiaActiva();			
		}
		else {
			return 0;
		}
	}
	
	public Factura facturarEnBaseA(double precioKWh) {
		Factura factura = new Factura(this);
		double monto = 0;
		if(consumos.size() != 0) {
			monto = consumos.get(consumos.size()-1).costoEnBaseA(precioKWh);			
		}
		factura.setMontoEnergiaActiva(monto);
		factura.setDescuento(); 
		return factura;
				
	}
	
	public Consumo ultimoConsumo() {
		if (consumos.size() != 0) {
			return consumos.get(consumos.size() - 1);			
		}
		else
			return null;
	} 
	
	public List<Factura> facturas(){
		return facturas;
	}
}
