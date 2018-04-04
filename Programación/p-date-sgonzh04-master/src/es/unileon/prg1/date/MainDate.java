package es.unileon.prg1.date;

public class MainDate {

	public static void main(String[] args) {
		Date today, tomorrow;
		today = new Date(20, 3, 2018);
		tomorrow = new Date(21, 3, 2018);
		System.out.println(today + " isSameYear " + tomorrow + "? " + today.isSameYear(tomorrow));
	}



	//Si algo ha ido mal solo tiene que llegar el mensaje, es decir, si pone una fecha inválida
	try {
		today = new Date (99, 14, 2017);
		System.out.println (today.toString());
	}catch (DateException e) {
		System.out.println (e.getMessage());
	}








}
