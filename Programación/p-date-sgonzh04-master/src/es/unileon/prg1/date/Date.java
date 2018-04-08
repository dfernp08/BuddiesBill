package es.unileon.prg1.date;


public class Date {
	private int day;
	private int month;
	private int year;
	
	// Constructor mal programado: Permite crear fechas no validas
	public void setYear(int year){
	
		this.year = year;
		
	}

	//Para saber si el mes es válido
	public void setMonth(int month) throws DateException{

		if (month<1 || month>12){
			throw new DateException ("Mes " +month + " no válido." + " Valores posibles entre 1 y 12");
		}else{
			this.month = month;
		}
		
	}
		
	
	//Para saber si el día es válido
	public void setDay(int day) throws DateException{
		if (month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12 && day>31){
			throw new DateException ("Día " + day + " no válido." + " Valores posibles entre 1 y 31 en este mes");
		}else if (month==4 || month==6 || month==9 || month==11 && day>30){
			throw new DateException ("Día " + day + " no válido." + " Valores posibles entre 1 y 30 en este mes");
		}else if (month==2 && day>28){
			throw new DateException ("Día " + day + " no válido." + " Valores posibles entre 1 y 28 en Febrero");
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

	//Metodos isSame con los if
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
		if(this.day == another.getDay()){
			return true;
		}else{
			return false;
		}
	}

	boolean isSame (Date another){
		if ((this.day == another.getDay()) && (this.month == another.getMonth()) && (this.year == another.getYear())){
			return true;
		}else{
			return false;
		}
	}


	//TODO Métodos isSame sin los if

	

	public String toString(){
		return this.day + "/" + this.month + "/" + this.year;
	}



	//REcibir el nombre del mes
	public String getMonthName(){

	String month =" ";

	switch (this.month){
		case 1 : month = "January";
			break;
		case 2 : month = "February";
			break;
		case 3 : month = "March";
			break;
		case 4 : month = "April";
			break;
		case 5 : month = "May";
			break;
		case 6 : month = "June";
			break;
		case 7 : month = "July";
			break;
		case 8 : month = "August";
			break;
		case 9 : month = "September";
			break;
		case 10 : month = "Octomber";
			break;
		case 11 : month = "Novemnber";
			break;
		case 12 : month = "Cecember";
			break;
	}
	return month;
	}


	public String setSeasonName(){

	String season =" ";

		if (this.month==1 || this.month==2 || (this.month==12 && this.day>21) || (this.month==3 && this.day<21)){
			return "Winter";
		}
		if (this.month==4 || this.month==5 || (this.month==3 && this.day>21) || (this.month==6 && this.day<21)){
			return "Spring";
		}
		
		if (this.month==7 || this.month==8 || (this.month==6 && this.day>21) || (this.month==9 && this.day<21)){
			return "Summer";
		}
		
		if (this.month==10 || this.month==11 || (this.month==9 && this.day>21) || (this.month==12 && this.day<21)){
			return "Autumn";
		}
		return season;
		}



}
