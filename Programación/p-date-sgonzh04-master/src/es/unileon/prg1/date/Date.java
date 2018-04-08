package es.unileon.prg1.date;


public class Date {
	private int day;
	private int month;
	private int year;
	
	// Constructor mal programado: Permite crear fechas no validas (ya no)
	public Date(int day, int month, int year) throws DateException{

		if ((month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12) && (day<1 || day>31)){
			throw new DateException ("Día " + day + " no válido." + " Valores posibles entre 1 y 31 en este mes");
		}else if ((month==4 || month==6 || month==9 || month==11) && (day<1 || day>30)){
			throw new DateException ("Día " + day + " no válido." + " Valores posibles entre 1 y 30 en este mes");
		}else if (month==2 && (day<1 || day>28)){
			throw new DateException ("Día " + day + " no válido." + " Valores posibles entre 1 y 28 en Febrero");
		}else{
			this.day = day;
		}


		if (month<1 || month>12){
			throw new DateException ("Mes " +month + " no válido." + " Valores posibles entre 1 y 12");
		}else{
			this.month = month;
		}

		if (year<1){
			throw new DateException ("Año " + year + " no válido." + " Valores posibles números positivos");
		}else{
		this.year=year;
		}
	}


	public void setYear(int year){
	
		this.year = year;
		
	}

	


	//Para saber si el mes es válido
	public void setMonth(int month){

		
			this.month = month;
		
	}
		
	
	//Para saber si el día es válido
	public void setDay(int day, int month){
		
			this.day = day;
		
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


	//TODO Métodos isSame sin los if (esto se va a quedar así porque no se me ocurre otra manera

	

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


	//Me piden lo de isDayRight, pero eso ya lo hice arriba para los días qeu son válidos, asi que no entiendo muy bien esto

	public String setSeasonName(){

	String season = " ";

		if (this.month==1 || this.month==2 || (this.month==12 && this.day>=21) || (this.month==3 && this.day<21)){
			return "Winter";
		}
		if (this.month==4 || this.month==5 || (this.month==3 && this.day>=21) || (this.month==6 && this.day<21)){
			return "Spring";
		}
		
		if (this.month==7 || this.month==8 || (this.month==6 && this.day>=21) || (this.month==9 && this.day<21)){
			return "Summer";
		}
		
		if (this.month==10 || this.month==11 || (this.month==9 && this.day>=21) || (this.month==12 && this.day<21)){
			return "Autumn";
		}
		return season;
	}

	//Simplemente cuenta los meses que quedan para el final del año, no te da nombres ni nada, contando en el que estamos (lo cual 		supongo que dará igual)
	public int getMonthsLeft(){

	int i=0;
	int months=0;
		for (i=this.getMonth();i<=12;i++){
			
			months=months+1;
		}
		return months;
	}


	

	

	//Dias que faltan del mes, cuenta en el que estamos
	
	public int getDaysLeftOfMonth(){

	int i=0;
	int days=0;
	int daysinmonth=0;
		if (month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12){
			for (i=this.getDay();i<=31;i++){
			days = days+1;
			}
		}else if(month==4 || month==6 || month==9 || month==11){
			for (i=this.getDay();i<=30;i++){
			days = days+1;
			}
		}else{
			for (i=this.getDay();i<=28;i++){
			days = days+1;
			}
		}
		return days;
	}
	

	public int setMonthsSameDays(){

	int months = 0;
	switch (this.month){
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			months = 31;
			break;

		case 4:
		case 6:
		case 9:
		case 11:
			months = 30;
			break;

		case 2: months = 28;
			break;
		}
		return months;
	}
			
	public String getMonthsSameDays(){

	String monthsamedays = " ";
		if (setMonthsSameDays(this.months)==31){
			monthsamedays = "January, March, May, July, August, October, December";
		}else if (setMonthsSameDays(this.months)==30){
			monthsamedays = "April, June, September, November";
		}else{
			monthsamedays = "February";
		}
		return monthsamedays;
	}



	//Días que han pasado en este año
	//public int daysPast(){
	
	







}
