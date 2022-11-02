package ar.edu.unlp.info.oo1.ejercicio17;

import java.time.LocalDate;

public class LlamadaInternacional extends Llamada {
	
	private String paisOrigen;
	private String paisDestino;

	public LlamadaInternacional(LocalDate fecha, int hora, int duracion, String telefonoEmisor, String telefonoReceptor,
			String paisOrigen, String paisDestino) {
		super(fecha, hora, duracion, telefonoEmisor, telefonoReceptor);
		this.paisOrigen = paisOrigen;
		this.paisDestino = paisDestino;
	}
	
	public double calcularCosto() {
		double costo;
		if (this.getHora() >= 8 && this.getHora() < 20) {
			costo = 4;
		}
		else costo = 3;
		return this.getDuracion() * costo;
	}

	public String getPaisOrigen() {
		return paisOrigen;
	}

	public void setPaisOrigen(String paisOrigen) {
		this.paisOrigen = paisOrigen;
	}

	public String getPaisDestino() {
		return paisDestino;
	}

	public void setPaisDestino(String paisDestino) {
		this.paisDestino = paisDestino;
	}
	
	
}
