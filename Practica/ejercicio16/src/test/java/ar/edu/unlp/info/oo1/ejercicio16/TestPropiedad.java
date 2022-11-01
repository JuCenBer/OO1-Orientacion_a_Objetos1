package ar.edu.unlp.info.oo1.ejercicio16;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestPropiedad {

	Propiedad propiedad1;
	Propiedad propiedad2;
	Usuario propietario;
	DateLapse periodo;
	DateLapse periodo1;
	DateLapse periodo2;
	Reserva reserva;
	Reserva reserva1;
	PoliticaModerada politica;
	
	@BeforeEach
	public void setUp() {
		propiedad1 = new Propiedad("La casa de las brujas", "Una casa", 100, "Calle 11 420", politica);
		propiedad2 = new Propiedad("Casa del arroyo", "En un arroyo", 50, "Calle 48 852", politica);
		periodo = new DateLapse(LocalDate.of(2022, 1, 1), LocalDate.of(2022, 1, 15));
		periodo1 = new DateLapse(LocalDate.of(2022, 1, 5), LocalDate.of(2022, 1, 10));
		periodo2 = new DateLapse(LocalDate.of(2022, 1, 15), LocalDate.of(2022, 1, 20));
		reserva = new Reserva(propiedad1, periodo);
		reserva1 = new Reserva(propiedad1, periodo2);
	}
	
	@Test
	public void testEstaDisponible() {
		propiedad1.agregarReserva(reserva);
		assertFalse(propiedad1.estaDisponible(periodo1));
		assertTrue(propiedad1.estaDisponible(periodo2));
		assertTrue(propiedad2.estaDisponible(periodo));
	}
	
	@Test
	public void testCalcularIngresos() {
		DateLapse unPeriodo = new DateLapse(LocalDate.of(2022, 1, 1), LocalDate.of(2022, 1, 21));
		propiedad1.agregarReserva(reserva);
		propiedad1.agregarReserva(reserva1);
		assertEquals(1900, propiedad1.calcularIngresos(unPeriodo));
		assertEquals(0, propiedad2.calcularIngresos(unPeriodo));
	}
}
