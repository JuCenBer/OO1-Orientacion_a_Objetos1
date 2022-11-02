package ar.edu.unlp.info.oo1.ejercicio17;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public abstract class Persona {

	private String nombre;
	private String direccion;
	private String numero;
	private List<Factura> facturas;
	private List<Llamada> llamadas;
	
	public Persona(String nombre, String direccion, String numero){
		this.nombre = nombre;
		this.direccion = direccion;
		this.numero = numero;
		this.facturas = new ArrayList<Factura>();
		this.llamadas = new ArrayList<Llamada>();
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

	public List<Factura> getFacturas() {
		return facturas;
	}

	public void setFacturas(List<Factura> facturas) {
		this.facturas = facturas;
	}

	public List<Llamada> getLlamadas() {
		return llamadas;
	}

	public void setLlamadas(List<Llamada> llamadas) {
		this.llamadas = llamadas;
	}
	
	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public double calcularMonto(LocalDate fechaInicio, LocalDate fechaFin) {
		return this.getLlamadas().stream()
				.filter(llamada -> llamada.getFecha().isAfter(fechaInicio) && llamada.getFecha().isBefore(fechaFin))
				.mapToDouble(llamada -> llamada.calcularCosto()).sum();
	}
	
	public Llamada registrarLlamadaLocal(LocalDate fecha, int hora, int duracion, String telefonoReceptor) {
		Llamada llamada = new LlamadaLocal(fecha, hora, duracion, this.numero, telefonoReceptor);
		this.llamadas.add(llamada);
		return llamada;
	}
	
	public Llamada registrarLlamadaInterurbana(LocalDate fecha, int hora, int duracion, String telefonoReceptor, double distancia) {
		Llamada llamada = new LlamadaInterurbana(fecha, hora, duracion, this.numero, telefonoReceptor, distancia);
		this.llamadas.add(llamada);
		return llamada;
	}
	
	public Llamada registrarLlamadaInternacional(LocalDate fecha, int hora, int duracion, String telefonoReceptor, String paisOrigen, String paisDestino) {
		Llamada llamada = new LlamadaInternacional(fecha, hora, duracion, this.numero, telefonoReceptor, paisOrigen, paisDestino);
		this.llamadas.add(llamada);
		return llamada;
	}
	
	public Factura facturar(LocalDate fechaInicio, LocalDate fechaFin) {
		Factura factura = new Factura(this, LocalDate.now(), fechaInicio, fechaFin, this.calcularMonto(fechaInicio, fechaFin));
		this.facturas.add(factura);
		return factura;
	}
}
