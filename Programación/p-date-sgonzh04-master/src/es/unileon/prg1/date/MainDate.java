package es.unileon.prg1.date;

public class MainDate {

	//Esto es por si os da por leer los comentarios, cada vez que quiero subir el repositorio a github tengo que crear un nuevo token porque ninguno de los anteriores va, me da muchisima pereza tener que hacer eso cada vez que lo subo.

	public static void main(String[] args) throws DateException{
		Date today, tomorrow;
		today = new Date(21, 3, 2018);
		tomorrow = new Date(22, 3, 2018);
		System.out.println(today + " isSameYear " + tomorrow + "? " + today.isSameYear(tomorrow));
		System.out.println(today + " isSameMonth " + tomorrow + "? " + today.isSameMonth(tomorrow));
		System.out.println(today + " isSameDay " + tomorrow + "? " + today.isSameDay(tomorrow));
		System.out.println(today + " isSameDate " + tomorrow + "? " + today.isSame(tomorrow));
		System.out.println(today + " getMonthName " + "? " + today.getMonthName());
		System.out.println(today + " setSeasonName " + "? " + today.setSeasonName());
		System.out.println(today + " getMonthsLeft (cuenta en el que estamos) " + "? " + today.getMonthsLeft());
		System.out.println(today + " getDaysLeftOfMonth (cuenta en el que estamos) " + "? " + today.getDaysLeftOfMonth());
		System.out.println(today + " getMonthsSameDays " + "? " + today.getMonthsSameDays());
		
	}
	


	//Si algo ha ido mal solo tiene que llegar el mensaje, es decir, si pone una fecha inválida
	
		//He quitado por ahora el try porque me daba errores de complicacion y no sabia porque







}
