package ar.edu.unlp.info.oo1.ejercicio17;

import java.time.LocalDate;

public class Factura {

	private LocalDate fecha;
	private Persona cliente;
	private LocalDate fechaInicio;
	private LocalDate fechaFin;
	private double montoTotal;
	
	public Factura(Persona cliente, LocalDate fecha, LocalDate fechaInicio, LocalDate fechaFin, double montoTotal) {
		this.cliente = cliente;
		this.fecha = fecha;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.montoTotal = montoTotal;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public LocalDate getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(LocalDate fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public LocalDate getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(LocalDate fechaFin) {
		this.fechaFin = fechaFin;
	}

	public double getMontoTotal() {
		return montoTotal;
	}

	public void setMontoTotal(double montoTotal) {
		this.montoTotal = montoTotal;
	}

	public Persona getCliente() {
		return cliente;
	}

	public void setCliente(Persona cliente) {
		this.cliente = cliente;
	}
	
	
}
