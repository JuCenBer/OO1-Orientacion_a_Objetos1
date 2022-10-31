package ar.edu.unlp.info.oo1.ejercicio13;

import java.util.ArrayList;
import java.util.List;

public class Carpeta {

	private String nombre;
	private List<Email> emails;
	
	public Carpeta(String nombre) {
		this.nombre = nombre;
		emails = new ArrayList<Email>();
	}
	
	public void almacenar(Email email) {
		this.emails.add(email);
	}
	
	public void eliminar(Email email) {
		this.emails.remove(email);
	}
	
	public Email buscar(String texto) {
		return emails.stream()
				.filter(email -> email.contiene(texto))
				.findFirst().orElse(null);
	}

	public int espacioOcupado() {
		return this.emails.stream()
				.mapToInt(email -> email.tamanio()).sum();
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Email> getEmails() {
		return emails;
	}

	public void setEmails(List<Email> emails) {
		this.emails = emails;
	}
	
}
