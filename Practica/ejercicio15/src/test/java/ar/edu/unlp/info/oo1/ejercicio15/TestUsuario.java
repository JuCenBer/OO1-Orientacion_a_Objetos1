package ar.edu.unlp.info.oo1.ejercicio15;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestUsuario {
	Propiedad propiedad1;
	Propiedad propiedad2;
	Usuario propietario;
	Usuario usuario;
	DateLapse periodo;
	DateLapse periodo1;
	DateLapse periodo2;
	Reserva reserva;
	Reserva reserva1;
	
	@BeforeEach
	public void setUp() {
		propietario = new Usuario("pepito", "48 123", "123456");
		usuario = new Usuario("jose", "15 444", "654321");
		propiedad1 = new Propiedad("La casa de las brujas", "Una casa", 100, "Calle 11 420");
		propiedad2 = new Propiedad("Casa del arroyo", "En un arroyo", 50, "Calle 48 852");
		propiedad1.setPropietario(propietario);
		propiedad2.setPropietario(propietario);
		propietario.agregarPropiedad(propiedad1);
		propietario.agregarPropiedad(propiedad2);
		periodo = new DateLapse(LocalDate.of(2022, 1, 1), LocalDate.of(2022, 1, 15));
		periodo1 = new DateLapse(LocalDate.of(2022, 1, 5), LocalDate.of(2022, 1, 10));
		periodo2 = new DateLapse(LocalDate.of(2022, 1, 15), LocalDate.of(2022, 1, 20));
		reserva = new Reserva(propiedad1, periodo);
		reserva1 = new Reserva(propiedad1, periodo2);
		propiedad1.agregarReserva(reserva);
		propiedad1.agregarReserva(reserva1);
		usuario.agregarReserva(reserva);
		usuario.agregarReserva(reserva1);
	}
	
	@Test
	public void testReserva() {
		assertEquals(2, usuario.getReservas().size());
		assertEquals(0, propietario.getReservas().size());
	}
	
	@Test
	public void testPropiedades() {
		assertEquals(0, usuario.getPropiedadesEnAlquiler().size());
		assertEquals(2, propietario.getPropiedadesEnAlquiler().size());
	}
}
