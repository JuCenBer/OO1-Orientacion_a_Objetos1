package ar.edu.unlp.info.oo1.ejercicio16;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestSistema {
	Propiedad propiedad1;
	Propiedad propiedad2;
	Usuario propietario;
	Usuario usuario;
	DateLapse periodo;
	DateLapse periodo1;
	DateLapse periodo2;
	Reserva reserva;
	Reserva reserva1;
	Sistema sistema;
	PoliticaFlexible politica;
	
	@BeforeEach
	public void setUp() {
		sistema = new Sistema();
		propietario = sistema.registrarUsuario("pepito", "48 123", "123456");
		usuario = sistema.registrarUsuario("jose", "15 444", "654321");
		
		propiedad1 = sistema.registrarPropiedad("La casa de las brujas", "Una casa", 100, "Calle 11 420", politica);
		propiedad2 = sistema.registrarPropiedad("Casa del arroyo", "En un arroyo", 50, "Calle 48 852", politica);
		propiedad1.setPropietario(propietario);
		propiedad2.setPropietario(propietario);
		propietario.agregarPropiedad(propiedad1);
		propietario.agregarPropiedad(propiedad2);
		
		periodo = new DateLapse(LocalDate.of(2022, 1, 1), LocalDate.of(2022, 1, 11));
		periodo1 = new DateLapse(LocalDate.of(2022, 1, 15), LocalDate.of(2022, 1, 20));
		
		sistema.hacerReserva(propiedad1, periodo, usuario);
		sistema.hacerReserva(propiedad2, periodo1, usuario); 
	}
	
	@Test
	public void testListaPropiedadesDisponibles() {
		assertEquals(0, sistema.listaPropiedadesDisponibles(LocalDate.of(2022, 1, 1), LocalDate.of(2022, 1, 17)).size());
		assertEquals(1, sistema.listaPropiedadesDisponibles(LocalDate.of(2022, 1, 9), LocalDate.of(2022, 1, 13)).size());
		assertEquals(2, sistema.listaPropiedadesDisponibles(LocalDate.of(2022, 1, 11), LocalDate.of(2022, 1, 14)).size());
	}
	
	@Test
	public void testCalcularIngresos() {
		assertEquals(1250, sistema.calcularIngresos(propietario, LocalDate.of(2022, 1, 1), LocalDate.of(2022, 1, 22)));
		assertEquals(250, sistema.calcularIngresos(propietario, LocalDate.of(2022, 1, 15), LocalDate.of(2022, 1, 21)));
		assertEquals(0, sistema.calcularIngresos(propietario, LocalDate.of(2022, 1, 25), LocalDate.of(2022, 1, 30)));
		
	}
}
