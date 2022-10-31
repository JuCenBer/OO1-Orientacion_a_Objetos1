package ar.edu.unlp.info.oo1.ejercicio13;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestCarpeta {
	private Carpeta carpeta;
	private Email email1;
	private Email email2;
	
	@BeforeEach
	public void setUp() {
		carpeta = new Carpeta("unaCarpeta");
		email1 = new Email("soyUnEmail1", "holahola");
		email2 = new Email("soyUnEmail2", "chauchau");
	}
	
	@Test
	public void testBuscar() {
		assertEquals(null, carpeta.buscar("soy"));
		carpeta.almacenar(email1);
		assertEquals(email1, carpeta.buscar("hola"));
		assertEquals(null, carpeta.buscar("chau"));
		carpeta.almacenar(email2);
		assertEquals(email2, carpeta.buscar("chau"));
	}
	
	public void testEspacioOcupado() {
		assertEquals(0,carpeta.espacioOcupado());
		carpeta.almacenar(email2);
		assertEquals(19, carpeta.espacioOcupado());
		carpeta.almacenar(email1);
		assertEquals(38, carpeta.espacioOcupado());
		carpeta.eliminar(email2);
		assertEquals(19, carpeta.espacioOcupado());
	}
}
