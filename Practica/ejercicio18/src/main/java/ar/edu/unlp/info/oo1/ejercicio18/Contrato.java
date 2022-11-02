package ar.edu.unlp.info.oo1.ejercicio18;

import java.time.LocalDate;

public abstract class Contrato {

	private LocalDate fechaInicio;
	private Empleado empleado;
	
	public Contrato(LocalDate fechaInicio, Empleado empleado) {
		this.fechaInicio = fechaInicio;
		this.empleado = empleado;
	}
	
	public abstract boolean estaVigente();
	public abstract double calcularMonto();
	
	public double calcularMontoAntiguedad(double basico) {
		if ((fechaInicio.getYear() - LocalDate.now().getYear()) >= 20) return basico;			
		else if ((fechaInicio.getYear() - LocalDate.now().getYear()) >= 15) return basico*0.7;
		else if ((fechaInicio.getYear() - LocalDate.now().getYear()) >= 10) return basico*0.5;
		else if ((fechaInicio.getYear() - LocalDate.now().getYear()) >= 5) return basico*0.3;
		else return 0;
	}

	public LocalDate getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(LocalDate fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public Empleado getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}
	
	
}
