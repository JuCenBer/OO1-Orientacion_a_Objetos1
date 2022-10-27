package ar.edu.unlp.info.oo1.ejercicio9;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestCuentaCorriente {
	CuentaCorriente cuenta;
	
	@BeforeEach
	public void setUp() {
		cuenta = new CuentaCorriente();
	}
	
	@Test
	public void testConstructor() {
		assertEquals(0,cuenta.getDescubierto());
		assertEquals(0,cuenta.getSaldo());
	}
	
	@Test
	public void testExtraer() {
		assertFalse(cuenta.extraer(50));
		cuenta.depositar(10);
		cuenta.setDescubierto(100);
		assertTrue(cuenta.extraer(105));
		assertEquals(-95, cuenta.getSaldo());
	}
	
	@Test
	public void testTransferir() {
		Cuenta cuentaDestino = new CuentaCorriente();
		assertFalse(cuenta.transferirACuenta(50, cuentaDestino));
		cuenta.depositar(100);
		cuenta.setDescubierto(50);
		assertTrue(cuenta.transferirACuenta(105, cuentaDestino));
		assertEquals(-5,cuenta.getSaldo());
		assertEquals(105,cuentaDestino.getSaldo());
	}
	
}
