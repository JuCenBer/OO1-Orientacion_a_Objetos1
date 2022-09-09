package ar.edu.unlp.info.oo1.ejercicio3;

public class Item{
	private String detalle;
	private int cantidad;
	private int costoUnitario;
	
	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public void setCostoUnitario(int costoUnitario) {
		this.costoUnitario = costoUnitario;
	}

	public String getDetalle() {
		return detalle;
	}
	
	public int getCostoUnitario() {
		return costoUnitario;
	}

	public int getCantidad() {
		return cantidad;
	}

	public int costo() {		
		return this.cantidad * this.costoUnitario;
	}
	
	public Item detalle(String detalle) {
		this.detalle = detalle;
		return this;
	}
	
	public Item costoUnitario(int costoUnitario) {
		this.costoUnitario = costoUnitario;
		return this;
		
	}
	
	public Item cantidad(int cantidad) {
		this.cantidad = cantidad;
		return this;
	}
}
