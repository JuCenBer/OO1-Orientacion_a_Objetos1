package ar.edu.unlp.info.oo1.ejercicio18;

import java.time.LocalDate;

public class ContratoPorHoras extends Contrato{

	private LocalDate FechaFin;
	private double valorHora;
	private int cantHorasMes;
	
	public ContratoPorHoras(Empleado empleado, LocalDate fechaInicio, LocalDate fechaFin, double valorHora, int cantHorasMes) {
		super(fechaInicio, empleado);
		this.FechaFin = fechaFin;
		this.valorHora = valorHora;
		this.cantHorasMes = cantHorasMes;
	}
	
	@Override
	public boolean estaVigente() {
		return LocalDate.now().isBefore(FechaFin);
	}
	
	@Override
	public double calcularMonto() {
		// TODO Auto-generated method stub
		return 0;
	}

	public LocalDate getFechaFin() {
		return FechaFin;
	}

	public void setFechaFin(LocalDate fechaFin) {
		FechaFin = fechaFin;
	}

	public double getValorHora() {
		return valorHora;
	}

	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}

	public int getCantHorasMes() {
		return cantHorasMes;
	}

	public void setCantHorasMes(int cantHorasMes) {
		this.cantHorasMes = cantHorasMes;
	}
	
	
}
