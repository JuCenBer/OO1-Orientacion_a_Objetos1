package ar.edu.unlp.info.oo1.ejercicio4;

public class Circulo implements Cara{
	private double radio;

	public double getDiametro() {
		return radio*2;
	}
	public void setDiametro(double diametro) {
		this.radio = diametro/2;
	}
	
	public double getRadio() {
		return radio;
	}
	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	public double getPerimetro() {
		return Math.PI*this.getDiametro();
	}
		
	public double getArea() {
		return Math.PI*radio*radio;
	}
	
}
