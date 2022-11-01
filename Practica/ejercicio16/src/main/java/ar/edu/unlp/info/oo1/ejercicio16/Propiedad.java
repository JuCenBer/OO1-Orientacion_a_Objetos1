package ar.edu.unlp.info.oo1.ejercicio16;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Propiedad {

	private String nombre;
	private String descripcion;
	private double precio;
	private String direccion;
	private Usuario propietario;
	private List<Reserva> reservas;
	private Politica politica;
	
	public Propiedad(String nombre, String descripcion, double precio, String direccion, Politica politica) {
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precio = precio;
		this.direccion = direccion;
		this.politica = politica;
		reservas = new ArrayList<Reserva>();
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public Usuario getPropietario() {
		return propietario;
	}
	public void setPropietario(Usuario propietario) {
		this.propietario = propietario;
	}

	public List<Reserva> getReservas() {
		return reservas;
	}

	public void setReservas(List<Reserva> reservas) {
		this.reservas = reservas;
	}
	
	public boolean estaDisponible(DateLapse periodo) {
		return this.reservas.stream()
				.noneMatch(reserva -> reserva.getPeriodo().overlaps(periodo));
	}
	
	public void agregarReserva(Reserva reserva) {
		this.reservas.add(reserva);
	}
	
	public double calcularIngresos(DateLapse periodo) {
		return this.reservas.stream()
				.filter(reserva -> reserva.getPeriodo().overlaps(periodo))
				.mapToDouble(reserva -> reserva.precio()).sum();
	}
	
	
	public Politica getPolitica() {
		return politica;
	}

	public void setPolitica(Politica politica) {
		this.politica = politica;
	}

	public double calcularDevolucion(LocalDate fechaCancelacion, DateLapse periodo) {
		double monto = this.precio * periodo.sizeInDays();
		return this.politica.calcularMonto(fechaCancelacion, periodo.getFrom(), monto);
	}
}
