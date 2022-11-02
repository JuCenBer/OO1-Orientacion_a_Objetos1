package ar.edu.unlp.info.oo1.ejercicio17;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Sistema {

	private List<String> numerosDisponibles;
	private List<Persona> clientes;
	
	public Sistema() {
		numerosDisponibles = new ArrayList<String>();
		clientes  = new ArrayList<Persona>();
	}
	
	public void agregarNumeroDisponible(String numero) {
		this.numerosDisponibles.add(numero);
	}
	
	public Persona darAltaPersonaFisica(String nombre, String direccion, String dni){
		String numero = numerosDisponibles.get(numerosDisponibles.size() - 1);
		numerosDisponibles.remove(numerosDisponibles.size() - 1);
		Persona cliente = new PersonaFisica(nombre, direccion, dni, numero);
		clientes.add(cliente);
		return cliente;
	}
	
	public Persona darAltaPersonaJuridica(String nombre, String direccion, String cuit, String tipo) {
		String numero = numerosDisponibles.get(numerosDisponibles.size() - 1);
		numerosDisponibles.remove(numerosDisponibles.size() - 1);
		Persona cliente = new PersonaJuridica(nombre, direccion, cuit, tipo, numero);
		clientes.add(cliente);
		return cliente;
	}
	
	public Persona buscarCliente(String telefono) {
		return this.clientes.stream().filter(cliente -> cliente.getNumero().equals(telefono)).findFirst().orElse(null);
	}
	
	public Llamada registrarLlamadaLocal(LocalDate fecha, int hora, int duracion, String telefonoEmisor, String telefonoReceptor) {
		Persona persona = this.buscarCliente(telefonoEmisor);
		return persona.registrarLlamadaLocal(fecha, hora, duracion, telefonoReceptor);
	}
	
	public Llamada registrarLlamadaInterurbana(LocalDate fecha, int hora, int duracion, String telefonoEmisor, String telefonoReceptor, double distancia) {
		Persona persona = this.buscarCliente(telefonoEmisor);
		return persona.registrarLlamadaInterurbana(fecha, hora, duracion, telefonoReceptor, distancia);
	}
	
	public Llamada registrarLlamadaInternacional(LocalDate fecha, int hora, int duracion, String telefonoEmisor, String telefonoReceptor, String paisOrigen, String paisDestino) {
		Persona persona = this.buscarCliente(telefonoEmisor);
		return persona.registrarLlamadaInternacional(fecha, hora, duracion, telefonoReceptor, paisOrigen, paisDestino);
	}
	
	public Factura facturarLlamadas(Persona cliente, LocalDate fechaInicio, LocalDate fechaFin) {
		return cliente.facturar(fechaInicio, fechaFin);
	}
}
