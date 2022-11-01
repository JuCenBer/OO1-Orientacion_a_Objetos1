package ar.edu.unlp.info.oo1.ejercicio16;

import java.time.LocalDate;

public class PoliticaEstricta implements Politica{
	
	@Override
	public double calcularMonto(LocalDate fechaCancelacion, LocalDate fechaInicio, double montoTotal) {
		return 0;
	}

}
