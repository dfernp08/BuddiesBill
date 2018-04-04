package es.unileon.prg1.date;

public class Date {
	private int day;
	private int month;
	private int year;
	
	// Constructor mal programado: Permite crear fechas no validas
	public setYear(int year){
	
		this.year = year;
	}

	//Para saber si el mes es válido
	public setMonth(int month){

		if (month<1 || month>12){
			throws new DateException ("Mes " +month + " no válido." + " Valores posibles entre 1 y 12");
		}else{
			this.month = month;
		}
	}
		
	
	//Para saber si el día es válido
	public setDay(int day){
		if (month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12 && day>31){
			throws new DateException ("Día " + day + " no válido." + " Valores posibles entre 1 y 31 en este mes");
		}else if (month==4 || month==6 || month==9 || month==11 && day>30){
			throws new DateException ("Día " + day + " no válido." + " Valores posibles entre 1 y 30 en este mes");
		}else if (month==2 && day>28){
			throws new DateException ("Día " + day + " no válido." + " Valores posibles entre 1 y 28 en Febrero");
		}else{
			this.day = day;
		}
	}


	public int getYear(){
		return this.year;
	}

	public int getMonth(){
		return this.month;
	
	}
	
	public int getDay(){
		return this.day;
	}


	boolean isSameYear(Date another){
		if ( this.year == another.getYear() ){
			return true;
		}else{
			return false;
		}
	}

	boolean isSameMonth(Date another){
		if(this.month == another.getMonth()){
			return true;
		}else{
			return false;
		}
	}

	boolean isSameDay(Date another){
		if(this.day == another.getDat()){
			return true;
		}else{
			return false;
		}
	}
	
	public String toString(){
		return this.day + "/" + this.month + "/" + this.year;
	}

}
