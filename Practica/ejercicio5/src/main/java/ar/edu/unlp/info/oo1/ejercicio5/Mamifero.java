package ar.edu.unlp.info.oo1.ejercicio5;

import java.util.Date;

public class Mamifero extends Object{
	private String identificador;
	private String especie;
	private Date fechaNacimiento;
	private Mamifero Padre;
	private Mamifero Madre;
	
	public Mamifero() {
		
	}
	
	public Mamifero(String identificador) {
		this.identificador = identificador;
	}

	public String getIdentificador() {
		return identificador;
	}

	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public Mamifero getPadre() {
		return Padre;
	}

	public void setPadre(Mamifero padre) {
		Padre = padre;
	}

	public Mamifero getMadre() {
		return Madre;
	}

	public void setMadre(Mamifero madre) {
		Madre = madre;
	}
	
	public Mamifero getAbueloMaterno() {
		if (this.Madre != null) {			
			return this.Madre.getPadre();
		}
		return null;
	}
	
	public Mamifero getAbuelaMaterna() {
		if(this.Madre != null) {
			return this.Madre.getMadre();			
		}
		return null;
	}
	
	public Mamifero getAbueloPaterno() {
		if(this.Padre != null) {
			return this.Padre.getPadre();
		}
		return null;
	}
	
	public Mamifero getAbuelaPaterna() {
		if (this.Padre != null) {
			return this.Padre.getMadre();
		}
		return null;
	}
	
	public boolean tieneComoAncestroA(Mamifero unMamifero){
		return (this.Padre == unMamifero || this.Madre == unMamifero ||
				this.Padre != null && this.Padre.tieneComoAncestroA(unMamifero) ||
				this.Madre != null && this.Madre.tieneComoAncestroA(unMamifero));
	}
	
}
