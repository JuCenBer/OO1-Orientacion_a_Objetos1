package ar.edu.unlp.info.oo1.ejercicio15;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Sistema {

	private List<Propiedad> propiedades;
	private List<Usuario> usuarios;
	
	public Sistema() {
		propiedades = new ArrayList<Propiedad>();
		usuarios = new ArrayList<Usuario>();
	}
	
	public Usuario registrarUsuario(String nombre, String direccion, String dni) {
		Usuario usuario = new Usuario(nombre, direccion, dni);
		usuarios.add(usuario);
		return usuario;
	}
	
	public Propiedad registrarPropiedad(String nombre, String descripcion, double precio, String direccion) {
		Propiedad propiedad = new Propiedad(nombre,descripcion,precio,direccion);
		propiedades.add(propiedad);
		return propiedad;
	}
	
	public List<Propiedad> listaPropiedadesDisponibles(LocalDate fechaInicio, LocalDate fechaFin) {
		DateLapse periodo = new DateLapse(fechaInicio, fechaFin);
		return propiedades.stream()
				.filter(propiedad -> propiedad.estaDisponible(periodo))
				.collect(Collectors.toList());
	}
	
	public Reserva hacerReserva(Propiedad propiedad, DateLapse periodo, Usuario usuario) {
		if (propiedad.estaDisponible(periodo)) {
			System.out.println("Esta disponible");
			Reserva reserva = new Reserva(propiedad, periodo);
			propiedad.agregarReserva(reserva);
			usuario.agregarReserva(reserva);
			return reserva;
		}
		else return null;
	}
	
	public void eliminarReserva(Reserva reserva) {
		
	}
	
	public double calcularIngresos(Usuario usuario, LocalDate fechaInicio, LocalDate fechaFin) {
		DateLapse periodo = new DateLapse(fechaInicio, fechaFin);
		return usuario.getPropiedadesEnAlquiler().stream()
				.mapToDouble(propiedad -> propiedad.calcularIngresos(periodo)).sum();
	}
}
