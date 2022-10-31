package ar.edu.unlp.info.oo1.ejercicio_11;

import java.util.ArrayList;
import java.util.List;

public class Inversor {

	private String nombre;
	private List<Inversion> inversiones;
	
	public Inversor(String nombre) {
		this.nombre = nombre;
		inversiones = new ArrayList<Inversion>();
	}
	
	public double valorActual() {
		return inversiones.stream()
		.mapToDouble(inversion -> inversion.valorActual())
		.sum();
	}
}
