package ar.edu.unlp.info.oo1.ejercicio13;

import java.util.ArrayList;
import java.util.List;

public class ClienteDeCorreo {
	
	private Carpeta inbox;
	private List<Carpeta> carpetas;
	
	public ClienteDeCorreo() {
		carpetas = new ArrayList<Carpeta>();
		inbox = new Carpeta("inbox");
	}
	
	public void recibir(Email email) {
		inbox.almacenar(email);
	}
	
	public void mover(Email email, Carpeta origen, Carpeta destino) {
		destino.almacenar(email);
		origen.eliminar(email);
	}
	
	public void crearCarpeta(Carpeta carpeta) {
		this.carpetas.add(carpeta);
	}
	
	public Email buscar(String texto) {
		if (inbox.buscar(texto) != null) {
			return inbox.buscar(texto);
		}
		else return this.carpetas.stream()
		.map(carpeta -> carpeta.buscar(texto))
		.filter(email -> email != null).findFirst().orElse(null);
	}
	
	public int espacioOcupado() {
		int tamanioInbox = inbox.getEmails().stream()
				.mapToInt(email -> email.tamanio()).sum();
		int tamanioCarpetas = this.carpetas.stream()
				.mapToInt(carpeta -> carpeta.espacioOcupado()).sum();
		
		return tamanioInbox + tamanioCarpetas;
	}
}
