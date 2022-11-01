package ar.edu.unlp.info.oo1.ejercicio16;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class PoliticaModerada implements Politica{


	@Override
	public double calcularMonto(LocalDate fechaCancelacion, LocalDate fechaInicio, double montoTotal) {
		if (fechaCancelacion.until(fechaInicio, ChronoUnit.DAYS) >= 14) return montoTotal;
		else if (fechaCancelacion.until(fechaInicio, ChronoUnit.DAYS) >= 2) return montoTotal/2;
		else return 0;
	}

}
