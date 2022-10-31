package ar.edu.unlp.info.oo1.ejercicio14;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ejercicio14_alternativo.DateLapseAlt;

public class TestDateLapse {
	private Date date;
	private Date date1;
	private Date date2;
	private Date date3;
	private Date date4;
	
	@BeforeEach
	public void setUp() {
		date = new DateLapse(LocalDate.of(2021, 12, 19), LocalDate.of(2022, 1, 1));
		date1 = new DateLapse(LocalDate.of(2020, 1, 1), LocalDate.of(2020, 1, 31));
		date2 = new DateLapse(LocalDate.of(2021, 12, 19), LocalDate.of(2021, 12, 14));
		date3 = new DateLapseAlt(LocalDate.of(2020, 1, 1), 30);
		date4 = new DateLapseAlt(LocalDate.of(2021, 12, 19), -5);
	}
	
	@Test
	public void testSizeInDays() {
		assertEquals(13, date.sizeInDays());
		assertEquals(30, date1.sizeInDays());
		assertEquals(-5, date2.sizeInDays());
		assertEquals(30, date3.sizeInDays());
		assertEquals(-5, date4.sizeInDays());
	}
	
	@Test
	public void testIncludesDate() {
		assertTrue(date.includesDate(LocalDate.of(2021, 12, 24)));
		assertFalse(date1.includesDate(LocalDate.of(2020, 2, 1)));
		assertFalse(date2.includesDate(LocalDate.of(2021, 10, 22)));
		assertTrue(date.includesDate(LocalDate.of(2021, 12, 20)));
		assertFalse(date3.includesDate(LocalDate.of(2021, 10, 22)));
		assertFalse(date4.includesDate(LocalDate.of(2021, 10, 22)));
	}
}
