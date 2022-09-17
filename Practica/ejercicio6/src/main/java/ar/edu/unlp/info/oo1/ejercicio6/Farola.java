package ar.edu.unlp.info.oo1.ejercicio6;

import java.util.ArrayList;
import java.util.List;

public class Farola {
	private boolean encendido;
	private List<Farola> farolasVecinas;
	
	public Farola () {
		encendido = false;
		farolasVecinas = new ArrayList<Farola>();
	}
	/*
	* Crea la relación de vecinos entre las farolas. La relación de vecinos entre las farolas es recíproca, es decir el receptor del mensaje será vecino de otraFarola, al igual que otraFarola también se convertirá en vecina del receptor del mensaje
	*/
	public void pairWithNeighbor( Farola otraFarola ) {
		if(!this.farolasVecinas.contains(otraFarola)) {			
			farolasVecinas.add(otraFarola);
			otraFarola.pairWithNeighbor(this);
		}
	}
	
	/*
	* Retorna sus farolas vecinas
	*/
	public List<Farola> getNeighbors(){
		return farolasVecinas;		
	}


	/*
	* Si la farola no está encendida, la enciende y propaga la acción.
	*/
	public void turnOn() {
		if (!this.isOn()) {
			encendido = true;
			for (Farola farola : farolasVecinas) {
				farola.turnOn();
			}
		}
	}

	/*
	* Si la farola no está apagada, la apaga y propaga la acción.
	*/
	public void turnOff() {
		if (this.isOn()){
			encendido = false;
			for (Farola farola : farolasVecinas) {
				farola.turnOff();
			}
		}
	}



	/*
	* Retorna true si la farola está encendida.
	*/
	public boolean isOn() {
		return encendido;
	}

}
