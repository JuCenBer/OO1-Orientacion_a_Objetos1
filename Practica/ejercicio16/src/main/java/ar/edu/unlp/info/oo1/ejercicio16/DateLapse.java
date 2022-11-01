package ar.edu.unlp.info.oo1.ejercicio16;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateLapse{
	
	private LocalDate from;
	private LocalDate to;
	
	public DateLapse(LocalDate from, LocalDate to) {
		this.from = from;
		this.to = to;
	}
	
	public LocalDate getFrom() {
		return from;
	}
	
	public LocalDate getTo() {
		return to;
	}

	public int sizeInDays() {
		return (int) this.from.until(to, ChronoUnit.DAYS); 
	}
	
	public boolean includesDate(LocalDate other) {
		return other.isAfter(from) && other.isBefore(to);
	}
	
	public boolean overlaps(DateLapse anotherLapse) {
		return this.includesDate(anotherLapse.getFrom()) || this.includesDate(getTo()) || anotherLapse.includesDate(this.getFrom()) || anotherLapse.includesDate(this.getTo());
	}
	
}
