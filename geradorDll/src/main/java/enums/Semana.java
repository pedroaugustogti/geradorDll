package enums;

import java.util.Calendar;


public enum Semana {

	SEGUNDA("Segunda",Calendar.MONDAY),
	TERCA("Terça",Calendar.TUESDAY),
	QUARTA("Quarta",Calendar.WEDNESDAY),
	QUINTA("Quinta",Calendar.THURSDAY),
	SEXTA("Sexta",Calendar.FRIDAY),
	SABADO("Sábado",Calendar.SATURDAY),
	DOMINGO("Domingo",Calendar.SUNDAY);
	
	private String label;
	private int monthCalendar;
	
	private Semana(String label, int monthCalendar){
		this.label = label;
		this.monthCalendar = monthCalendar;
	}

	public String getLabel() {
		return label;
	}
	
	public String getName(){
		return this.name();
	}
	

	public static String getLabel(int diaSemanaCalendar) {
		
		for (Semana enun : values()){
			
			if (enun.getMonthCalendar() == diaSemanaCalendar){
				return enun.label;
			}
		}
		
		return null;
	}

	public int getMonthCalendar() {
		return monthCalendar;
	}

	public static Integer getNumCalendarPorLabel(String mes) {
		
		for (Semana enun : values()){
			
			if (enun.getLabel().equals(mes)){
				return enun.getMonthCalendar();
			}
		}
		
		return null;
	}
}