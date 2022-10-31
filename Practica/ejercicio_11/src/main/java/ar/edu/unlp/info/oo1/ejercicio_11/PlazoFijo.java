package ar.edu.unlp.info.oo1.ejercicio_11;

import java.time.LocalDate;

public class PlazoFijo implements Inversion{

	private LocalDate fechaDeConstitucion;
	private double montoDepositado;
	private double porcentajeDeInteresDiario;
	
	public PlazoFijo(LocalDate fechaDeConstitucion, double montoDepositado, double porcentajeDeInteresDiario) {
		this.fechaDeConstitucion = fechaDeConstitucion;
		this.montoDepositado = montoDepositado;
		this.porcentajeDeInteresDiario  = porcentajeDeInteresDiario;		
	}
	
	public double valorActual() {
		int cantDias = LocalDate.now().getDayOfYear() - fechaDeConstitucion.getDayOfYear();
		return this.montoDepositado  + this.montoDepositado *(this.porcentajeDeInteresDiario * cantDias); 
	}
}
