package ar.edu.unlp.info.oo1.ejercicio17;

import java.time.LocalDate;

public abstract class Llamada {

	private LocalDate fecha;
	private int hora;
	private int duracion;
	private String telefonoEmisor;
	private String telefonoReceptor;
	
	public Llamada(LocalDate fecha, int hora, int duracion, String telefonoEmisor, String telefonoReceptor) {
		this.fecha = fecha;
		this.hora = hora;
		this.duracion = duracion;
		this.telefonoEmisor = telefonoEmisor;
		this.telefonoReceptor = telefonoReceptor;
	}
	
	public abstract double calcularCosto();

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public String getTelefonoEmisor() {
		return telefonoEmisor;
	}

	public void setTelefonoEmisor(String telefonoEmisor) {
		this.telefonoEmisor = telefonoEmisor;
	}

	public String getTelefonoReceptor() {
		return telefonoReceptor;
	}

	public void setTelefonoReceptor(String telefonoReceptor) {
		this.telefonoReceptor = telefonoReceptor;
	}
	
	
}
