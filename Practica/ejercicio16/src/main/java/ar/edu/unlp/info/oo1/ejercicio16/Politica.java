package ar.edu.unlp.info.oo1.ejercicio16;

import java.time.LocalDate;

public interface Politica {

	public double calcularMonto(LocalDate fechaCancelacion, LocalDate fechaInicio, double montoTotal);
}
