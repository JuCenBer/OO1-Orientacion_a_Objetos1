package ar.edu.unlp.info.oo1.ejercicio8;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public class Factura {
	private double montoEnergiaActiva;
	private double descuento;
	private Usuario usuario;
	private LocalDate fecha;
	
	public Factura(Usuario usuario) {
		this.fecha = LocalDate.now();
		this.usuario = usuario;
	}

	public Factura(double montoEnergiaActiva, double descuento, Usuario usuario) {
		this.montoEnergiaActiva = montoEnergiaActiva;
		this.descuento = descuento;
		this.usuario = usuario;
		this.fecha = LocalDate.now();
	}
	
	public double getMontoEnergiaActiva() {
		return montoEnergiaActiva;
	}



	public void setMontoEnergiaActiva(double montoEnergiaActiva) {
		this.montoEnergiaActiva = montoEnergiaActiva;
	}



	public double getDescuento() {
		return descuento;
	}



	public void setDescuento() {
		double energiaActiva = this.getUsuario().ultimoConsumoActiva();
		List<Consumo> consumos = this.getUsuario().getConsumos();
		double energiaReactiva;
		if (consumos.size() != 0)  {
			energiaReactiva = consumos.get(consumos.size()-1).getConsumoEnergiaReactiva();			
		}
		else {
			energiaReactiva = 0;
		}
		double fpe = energiaActiva/(Math.sqrt(Math.pow(energiaActiva, 2) + Math.pow(energiaReactiva, 2)));
		if (fpe > 0.8) {
			this.descuento = this.montoEnergiaActiva*0.1;
			System.out.println("El usuario" + this.getUsuario().getNombre() + "fue bonificado con 10% de descuento");
		}
		else {
			System.out.println("El usuario" + this.getUsuario().getNombre() + "no fue bonoficado con el descuento");

		}
	}



	public Usuario getUsuario() {
		return usuario;
	}



	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}



	public LocalDate getFecha() {
		return fecha;
	}



	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}



	public double montoTotal() {
		return montoEnergiaActiva - montoEnergiaActiva* (descuento/100);
	}
	
	public Usuario usuario() {
		return usuario;
	}
	
	public LocalDate fecha() {
		return fecha;
	}
	
	public double descuento() {
		return descuento;
	}
}
