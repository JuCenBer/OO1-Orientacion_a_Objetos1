package ar.edu.unlp.info.oo1.ejercicio16;

import java.util.ArrayList;
import java.util.List;

public class Usuario {

	private String nombre;
	private String direccion;
	private String dni;
	private List<Propiedad> propiedadesEnAlquiler;
	private List<Reserva> reservas;
	
	public Usuario(String nombre, String direccion, String dni) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.dni = dni;
		propiedadesEnAlquiler = new ArrayList<Propiedad>();
		reservas = new ArrayList<Reserva>();
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public List<Propiedad> getPropiedadesEnAlquiler() {
		return propiedadesEnAlquiler;
	}
	public void setPropiedadesEnAlquiler(List<Propiedad> propiedadesEnAlquiler) {
		this.propiedadesEnAlquiler = propiedadesEnAlquiler;
	}
	public List<Reserva> getReservas() {
		return reservas;
	}
	public void setReservas(List<Reserva> reservas) {
		this.reservas = reservas;
	}
	
	public void agregarPropiedad(Propiedad propiedad) {
		this.propiedadesEnAlquiler.add(propiedad);
	}
	
	public void agregarReserva(Reserva reserva) {
		this.reservas.add(reserva);
	}
	
}
