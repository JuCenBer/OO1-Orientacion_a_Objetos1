package ar.edu.unlp.info.oo1.ejercicio17;

import java.time.LocalDate;

public class PersonaFisica extends Persona{
	
	private String dni;
	
	public PersonaFisica(String nombre, String direccion, String dni, String numero) {
		super(nombre, direccion, numero);
		this.dni = dni;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}
	
	public double calcularMonto(LocalDate fechaInicio, LocalDate fechaFin) {
		double montoTotal = super.calcularMonto(fechaInicio, fechaFin);
		return montoTotal - (montoTotal * 0.1);
	}
}
