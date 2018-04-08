package es.unileon.prg1.date;

public class MainDate {

	//No se porque no funciona la verdad,lo dejo por ahora en comentarios porque sino no me compila, ya se que es mala idea, pero que quieres que le haga 
	public static void main(String[] args) {
		Date today, tomorrow;
		today = new Date(21, 3, 2018);
		tomorrow = new Date(22, 3, 2018);
		System.out.println(today + " isSameYear " + tomorrow + "? " + today.isSameYear(tomorrow));
		System.out.println(today + " isSameMonth " + tomorrow + "? " + today.isSameMonth(tomorrow));
		System.out.println(today + " isSameDay " + tomorrow + "? " + today.isSameDay(tomorrow));
		System.out.println(today + " getMonthName " + "? " + today.getMonthName());
		System.out.println(today + " setSeasonName " + "? " + today.setSeasonName());
		System.out.println(today + " getMonthsLeft (cuenta en el que estamos) " + "? " + today.getMonthsLeft());
	}
	


	//Si algo ha ido mal solo tiene que llegar el mensaje, es decir, si pone una fecha inválida
	
		//He quitado por ahora el try porque me daba errores de complicacion y no sabia porque







}
