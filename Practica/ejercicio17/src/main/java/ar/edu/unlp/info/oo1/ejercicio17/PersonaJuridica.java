package ar.edu.unlp.info.oo1.ejercicio17;

public class PersonaJuridica extends Persona{

	private String cuit;
	private String tipo;
	
	public PersonaJuridica(String nombre, String direccion, String cuit, String tipo, String numero) {
		super(nombre, direccion, numero);
		this.cuit = cuit;
		this.tipo = tipo;
	}

	public String getCuit() {
		return cuit;
	}

	public void setCuit(String cuit) {
		this.cuit = cuit;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
}
