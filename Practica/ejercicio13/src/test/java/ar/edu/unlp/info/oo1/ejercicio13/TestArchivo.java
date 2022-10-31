package ar.edu.unlp.info.oo1.ejercicio13;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestArchivo {

	private Archivo archivo;
	
	@BeforeEach
	public void setUp() {
		archivo = new Archivo("unArchivo");
	}
	
	@Test
	public void testTamanio() {
		assertEquals(9, archivo.tamano());
	}
}
