package ar.edu.unlp.info.oo1.ejercicio18;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Sistema {

	private List<Empleado> empleados;
	
	public Sistema() {
		empleados = new ArrayList<Empleado>();
	}
	
	public void altaEmpleado(String nombre, String apellido, String cuil,
			LocalDate fechaNacimiento, boolean conyugueACargo, boolean hijosACargo) {
		Empleado empleado = new Empleado(nombre, apellido, cuil, fechaNacimiento, conyugueACargo, hijosACargo);
		this.empleados.add(empleado);
	}
	
	public Empleado buscarEmpleado(String cuil) {
		return this.empleados.stream().filter(empleado -> empleado.getCuil().equals(cuil)).findFirst().orElse(null);
	}
	
	public void bajaEmpleado(Empleado empleado) {
		this.empleados.remove(empleado);
	}
	
	public void cargarContratoPorHoras(Empleado empleado, LocalDate fechaInicio, LocalDate fechaFin, double valorHora, int cantHoras) {
		empleado.cargarContratoPorHoras(fechaInicio, fechaFin, valorHora, cantHoras);
	}
	
	public void cargarContratoDePlanta(Empleado empleado, LocalDate fechaInicio, double sueldoMensual, double montoPorConyugue, double montoPorHijo) {
		empleado.cargarContratoDePlanta(fechaInicio, sueldoMensual, montoPorConyugue, montoPorHijo);
	}
	
	public List<Empleado> obtenerEmpleadosConContratosVencidos(){
		return this.empleados.stream()
				.filter(empleado -> !(empleado.tieneContratoVigente()))
				.collect(Collectors.toList());
	}
	
	public List<Recibo> generarRecibos(){
		return this.empleados.stream()
				.map(empleado -> empleado.generarRecibo())
				.filter(recibo -> recibo != null)
				.collect(Collectors.toList());
	}
}
