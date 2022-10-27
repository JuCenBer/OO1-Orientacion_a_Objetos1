package ar.edu.unlp.info.oo1.ejercicio8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Distribuidora {
	private double precioKWh;
	private List<Usuario> usuarios;

	
	public Distribuidora() {
		this.usuarios = new ArrayList<Usuario>();
	}
	
	public Distribuidora(double precioKWh) {
		this.precioKWh = precioKWh;
		this.usuarios = new ArrayList<Usuario>();

	}
	
	public Double getPrecioKWh() {
		return precioKWh;
	}


	public void setPrecioKWh(double precioKWh) {
		this.precioKWh = precioKWh;
	}


	public List<Usuario> getUsuarios() {
		return usuarios;
	}


	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}


	public void agregarUsuario(Usuario usuario) {
		this.usuarios.add(usuario);
	}
	
	public List<Factura> facturar() {
		return usuarios.stream()
		.map((Usuario u) -> u.facturarEnBaseA(precioKWh)).
		collect(Collectors.toList());
	}
	
	public double consumoTotalActiva() {
		double consumoTotal = usuarios.stream().
				mapToDouble((Usuario usuario) -> usuario.ultimoConsumoActiva())
				.sum();
		
		return consumoTotal;
	}

}
