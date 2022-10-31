package ar.edu.unlp.info.oo1.ejercicio12;

import java.util.ArrayList;
import java.util.List;

public class ReporteDeConstruccion {
	
	private List<Pieza> piezas;
	
	public ReporteDeConstruccion() {
		piezas = new ArrayList<Pieza>();
	}
	
	public double volumenDeMaterial(String material) {
		double volumen = 0;
		if (piezas.size() > 0) {
			volumen = piezas.stream().filter(elemento -> elemento.getMaterial().equals(material))
			.mapToDouble(elemento -> elemento.getVolumen()).sum();
		}
		return volumen;
	}
	
	public double superficieDeColor(String color) {
		double superficie = 0;
		if (piezas.size() > 0) {
			superficie = piezas.stream().filter(elemento -> elemento.getMaterial().equals(color))
			.mapToDouble(elemento -> elemento.getSuperficie()).sum();
		}
		return superficie;
	}
}
