package ar.edu.unlp.info.oo1.ejercicio17;

import java.time.LocalDate;

public class LlamadaLocal extends Llamada{
	
	public LlamadaLocal(LocalDate fecha, int hora, int duracion, String telefonoEmisor, String telefonoReceptor) {
		super(fecha, hora, duracion, telefonoEmisor, telefonoReceptor);
	}
	
	public double calcularCosto() {
		return 1 * this.getDuracion();
	}
}
