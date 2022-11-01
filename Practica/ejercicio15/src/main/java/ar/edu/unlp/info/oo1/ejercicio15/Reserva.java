package ar.edu.unlp.info.oo1.ejercicio15;


public class Reserva {

	private Propiedad propiedad;
	private DateLapse periodo;
	
	public Reserva(Propiedad propiedad, DateLapse periodo) {
		this.propiedad = propiedad;
		this.periodo = periodo;
	}
	

	public double precio(){
		return this.propiedad.getPrecio()*periodo.sizeInDays();
	}


	public Propiedad getPropiedad() {
		return propiedad;
	}


	public void setPropiedad(Propiedad propiedad) {
		this.propiedad = propiedad;
	}


	public DateLapse getPeriodo() {
		return periodo;
	}


	public void setPeriodo(DateLapse periodo) {
		this.periodo = periodo;
	}
	
	
}
