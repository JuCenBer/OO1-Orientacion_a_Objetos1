package ar.edu.unlp.info.oo1.ejercicio2;

public class Balanza {
	int cantidadDeProductos;
	double precioTotal;
	double pesoTotal;
	
	public void ponerEnCero() {
		this.cantidadDeProductos = 0;
		this.precioTotal = 0;
		this.pesoTotal = 0;
	}
	
	public void agregarProducto(Producto producto) {
		cantidadDeProductos++;
		pesoTotal += producto.getPeso();
		precioTotal += producto.getPrecio();
	}
	
	public Ticket emitirTicket() {
		Ticket ticket;
		if(cantidadDeProductos > 0) {
			ticket = new Ticket(this.cantidadDeProductos, this.pesoTotal, this.getPrecioTotal());
		}
		else {
			ticket = null;
		}
		
		return ticket;
	}

	public int getCantidadDeProductos() {
		return cantidadDeProductos;
	}

	public void setCantidadDeProductos(int cantidadDeProductos) {
		this.cantidadDeProductos = cantidadDeProductos;
	}

	public double getPrecioTotal() {
		return precioTotal;
	}

	public void setPrecioTotal(double precioTotal) {
		this.precioTotal = precioTotal;
	}

	public double getPesoTotal() {
		return pesoTotal;
	}

	public void setPesoTotal(double pesoTotal) {
		this.pesoTotal = pesoTotal;
	}
	
	
}
