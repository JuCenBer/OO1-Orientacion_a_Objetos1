package ar.edu.unlp.info.oo1.ejercicio16;

import java.time.LocalDate;

public class PoliticaFlexible implements Politica{

	@Override
	public double calcularMonto(LocalDate fechaCancelacion, LocalDate fechaInicio, double montoTotal) {
		if (fechaCancelacion.isBefore(fechaInicio)) return montoTotal;
		else return 0;
	}

}
