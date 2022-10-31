package ejercicio14_alternativo;

import java.time.LocalDate;

import ar.edu.unlp.info.oo1.ejercicio14.Date;

public class DateLapseAlt implements Date{

	private LocalDate from;
	private int sizeInDays;
	
	public DateLapseAlt(LocalDate from, int sizeInDays) {
		this.from = from;
		this.sizeInDays = sizeInDays;
	}

	@Override
	public LocalDate getFrom(){ 
		return this.from;
	}

	@Override
	public LocalDate getTo() {
		return from.plusDays(sizeInDays);
	}

	@Override
	public int sizeInDays() {
		return this.sizeInDays;
	}

	@Override
	public boolean includesDate(LocalDate other) {
		return other.isAfter(from) && other.isBefore(this.getTo());
	}
	
	
}
