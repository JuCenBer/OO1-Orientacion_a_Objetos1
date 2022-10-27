package ar.edu.unlp.info.oo1.ejercicio8;

import java.time.LocalDate;
import java.util.Date;

public class Consumo {
	private LocalDate fecha;
	private int consumoEnergiaActiva;
	private int consumoEnergiaReactiva;
	
	public Consumo(LocalDate fecha, int consumoEnergiaActiva, int consumoEnergiaReactiva) {
		this.fecha = fecha;
		this.consumoEnergiaActiva = consumoEnergiaActiva;
		this.consumoEnergiaReactiva = consumoEnergiaReactiva;
	}
	
	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public double getConsumoEnergiaActiva() {
		return consumoEnergiaActiva;
	}

	public void setConsumoEnergiaActiva(int consumoEnergiaActiva) {
		this.consumoEnergiaActiva = consumoEnergiaActiva;
	}

	public double getConsumoEnergiaReactiva() {
		return consumoEnergiaReactiva;
	}

	public void setConsumoEnergiaReactiva(int consumoEnergiaReactiva) {
		this.consumoEnergiaReactiva = consumoEnergiaReactiva;
	}

	public double costoEnBaseA(double precioKWh) {
		return this.consumoEnergiaActiva*precioKWh;
	}
	
	public double factorDePotencia() {
		return this.consumoEnergiaActiva/(Math.sqrt(Math.pow(consumoEnergiaActiva,2)+ Math.pow(this.consumoEnergiaActiva,2)));
	}
}
