package ar.edu.unlp.info.oo1.ejercicio9;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestCajaDeAhorro {
	CajaDeAhorro cajaAhorro;

	@BeforeEach
	public void setUp() {
		cajaAhorro = new CajaDeAhorro();
	}
	
	@Test
	public void testExtraerConSaldo() {
		cajaAhorro.depositar(100);
		cajaAhorro.extraer(50);
		assertEquals(47, cajaAhorro.getSaldo());
	}
	
	@Test
	public void testExtraerSinSaldo() {
		cajaAhorro.depositar(100);
		assertFalse(cajaAhorro.extraer(100));
		assertEquals(98, cajaAhorro.getSaldo());
	}
	
	@Test
	public void transferirConSaldo() {
		CajaDeAhorro cuentaDestino = new CajaDeAhorro();
		cajaAhorro.depositar(100);
		assertTrue(cajaAhorro.transferirACuenta(50, cuentaDestino));
		assertEquals(47,cajaAhorro.getSaldo());
		assertEquals(49.98,cuentaDestino.getSaldo());
	}
	
	@Test
	public void transferirSinSaldo() {
		CajaDeAhorro cuentaDestino = new CajaDeAhorro();
		cajaAhorro.depositar(100);
		assertFalse(cajaAhorro.transferirACuenta(100, cuentaDestino));
		assertEquals(98,cajaAhorro.getSaldo());
		assertEquals(0,cuentaDestino.getSaldo());
	}
}
