package ar.edu.unlp.info.oo1.ejercicio13;

import java.util.ArrayList;
import java.util.List;

public class Email {

	private String titulo;
	private String cuerpo;
	private List<Archivo> adjuntos;
	
	public Email(String titulo, String cuerpo) {
		this.titulo = titulo;
		this.cuerpo = cuerpo;
		adjuntos = new ArrayList<Archivo>();
	}
	
	public void agregarArchivo(Archivo archivo) {
		adjuntos.add(archivo);
	}
	
	public boolean contiene(String texto) {
		return titulo.contains(texto) || cuerpo.contains(texto);
	}
	
	public int tamanio() {
		int tamanioAdjuntos = adjuntos.stream()
				.mapToInt(archivo -> archivo.getNombre().length()).sum();
		return this.titulo.length() + this.cuerpo.length() + tamanioAdjuntos;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getCuerpo() {
		return cuerpo;
	}

	public void setCuerpo(String cuerpo) {
		this.cuerpo = cuerpo;
	}

	public List<Archivo> getAdjuntos() {
		return adjuntos;
	}

	public void setAdjuntos(List<Archivo> adjuntos) {
		this.adjuntos = adjuntos;
	}
	
	
}
