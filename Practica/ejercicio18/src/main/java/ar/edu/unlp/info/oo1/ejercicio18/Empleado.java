package ar.edu.unlp.info.oo1.ejercicio18;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Empleado {

	private String nombre;
	private String apellido;
	private String cuil;
	private LocalDate fechaNacimiento;
	private boolean conyugueACargo;
	private boolean hijosACargo;
	private List<Contrato> contratos;
	
	public Empleado(String nombre, String apellido, String cuil, LocalDate fechaNacimiento,
			boolean conyugueACargo, boolean hijosACargo) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.cuil = cuil;
		this.fechaNacimiento = fechaNacimiento;
		this.conyugueACargo = conyugueACargo;
		this.hijosACargo = hijosACargo;
		this.contratos = new ArrayList<Contrato>();
	}
	
	public void cargarContratoPorHoras(LocalDate fechaInicio, LocalDate fechaFin, double valorHora, int cantHoras) {
		Contrato contrato = new ContratoPorHoras(this, fechaInicio, fechaFin, valorHora, cantHoras);
		this.contratos.add(contrato);
	}
	
	public void cargarContratoDePlanta(LocalDate fechaInicio, double sueldoMensual, double montoPorConyugue, double montoPorHijo) {
		Contrato contrato = new ContratoDePlanta(fechaInicio, this, sueldoMensual, montoPorConyugue, montoPorHijo);
		this.contratos.add(contrato);
	}
	
	public boolean tieneContratoVigente() {
		return this.contratos.get(this.contratos.size() - 1).estaVigente();
	}
	
	public Recibo generarRecibo() {
		if(this.contratos.get(contratos.size() - 1).estaVigente()) {			
			Recibo recibo = new Recibo(LocalDate.now(), this, this.contratos.get(contratos.size() - 1).calcularMonto());
			return recibo;
		}
		return null;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCuil() {
		return cuil;
	}

	public void setCuil(String cuil) {
		this.cuil = cuil;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public boolean isConyugueACargo() {
		return conyugueACargo;
	}

	public void setConyugueACargo(boolean conyugueACargo) {
		this.conyugueACargo = conyugueACargo;
	}

	public boolean isHijosACargo() {
		return hijosACargo;
	}

	public void setHijosACargo(boolean hijosACargo) {
		this.hijosACargo = hijosACargo;
	}

	public List<Contrato> getContratos() {
		return contratos;
	}

	public void setContratos(List<Contrato> contratos) {
		this.contratos = contratos;
	}
	
	
}
