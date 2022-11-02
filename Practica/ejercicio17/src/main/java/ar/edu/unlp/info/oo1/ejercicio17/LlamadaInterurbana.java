package ar.edu.unlp.info.oo1.ejercicio17;

import java.time.LocalDate;

public class LlamadaInterurbana extends Llamada{

	private double distancia;
	
	public LlamadaInterurbana(LocalDate fecha, int hora, int duracion, String telefonoEmisor, String telefonoReceptor,
			double distancia) {
		super(fecha, hora, duracion, telefonoEmisor, telefonoReceptor);
	}
	
	public double calcularCosto() {
		double costo;
		if (this.distancia < 100) costo = 2;
		else if (this.distancia < 500) costo = 2.5;
		else costo = 3;
		
		return 5 + (costo * this.getDuracion());
	}
}
