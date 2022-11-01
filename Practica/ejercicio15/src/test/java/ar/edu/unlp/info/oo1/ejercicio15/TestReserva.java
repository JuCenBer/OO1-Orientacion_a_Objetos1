package ar.edu.unlp.info.oo1.ejercicio15;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestReserva {

	Reserva reserva;
	Propiedad propiedad;
	DateLapse periodo;
	DateLapse periodo1;
	DateLapse periodo2;
	
	@BeforeEach
	public void setUp() {
		propiedad = new Propiedad("La casa de las brujas", "Una casa", 100, "Calle 11 420");
		periodo = new DateLapse(LocalDate.of(2022, 1, 1), LocalDate.of(2022, 1, 15));
		reserva = new Reserva(propiedad, periodo);
		periodo1 = new DateLapse(LocalDate.of(2022, 1, 5), LocalDate.of(2022, 1, 10));
		periodo2 = new DateLapse(LocalDate.of(2022, 1, 15), LocalDate.of(2022, 1, 20));
	}
	
	@Test
	public void testPrecio() {
		assertEquals(1400, reserva.precio());
	}
	
	@Test
	public void testOverlaps() {
		assertTrue(reserva.getPeriodo().overlaps(periodo1));
		assertFalse(reserva.getPeriodo().overlaps(periodo2));		
	}
}
