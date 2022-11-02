package ar.edu.unlp.info.oo1.ejercicio18;

import java.time.LocalDate;

public class ContratoDePlanta extends Contrato{

	private double sueldoMensual;
	private double montoPorConyugue;
	private double montoPorHijo;
	private boolean vigente;
	
	public ContratoDePlanta(LocalDate fechaInicio, Empleado empleado, double sueldoMensual, double montoPorConyugue, double montoPorHijo) {
		super(fechaInicio, empleado);
		this.vigente = true;
		this.sueldoMensual = sueldoMensual;
		this.montoPorConyugue = montoPorConyugue;
		this.montoPorHijo = montoPorHijo;
	}

	@Override
	public boolean estaVigente() {
		return this.vigente;
	}

	@Override
	public double calcularMonto() {
		double basico = sueldoMensual + montoPorConyugue + montoPorHijo;
		return basico + super.calcularMontoAntiguedad(basico);		
	}

	public double getSueldoMensual() {
		return sueldoMensual;
	}

	public void setSueldoMensual(double sueldoMensual) {
		this.sueldoMensual = sueldoMensual;
	}

	public double getMontoPorConyugue() {
		return montoPorConyugue;
	}

	public void setMontoPorConyugue(double montoPorConyugue) {
		this.montoPorConyugue = montoPorConyugue;
	}

	public double getMontoPorHijo() {
		return montoPorHijo;
	}

	public void setMontoPorHijo(double montoPorHijo) {
		this.montoPorHijo = montoPorHijo;
	}
	
	
	
}
