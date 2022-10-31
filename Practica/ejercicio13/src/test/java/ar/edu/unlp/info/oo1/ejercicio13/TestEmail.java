package ar.edu.unlp.info.oo1.ejercicio13;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestEmail {

	private Email email;
	Archivo archivo;
	Archivo archivo2;
	
	@BeforeEach
	public void setUp() {
		email = new Email("soyUnEmail", "holamepresentosoyunemailsaludos");
		archivo = new Archivo("unArchivo");
		archivo2 = new Archivo("soyOtroArchivo");
	}
	
	@Test
	public void testAgregarArchivo() {
		assertEquals(0, email.getAdjuntos().size());
		email.agregarArchivo(archivo);
		assertEquals(1, email.getAdjuntos().size());
	}
	
	public void testEspacioOcupado() {
		assertEquals(0,email.tamanio());
		email.agregarArchivo(archivo);
		assertEquals(9,email.tamanio());
		email.agregarArchivo(archivo2);
		assertEquals(23, email.tamanio());
	}
	
	public void testContiene() {
		assertTrue(email.contiene("hola"));
		assertFalse(email.contiene("chau"));
	}
}
