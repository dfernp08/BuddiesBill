package es.unileon.prg.tema5;

/**
 * Clase con los ejercicios correspondientes a cadenas de caracteres.
 * La clase "String"
 *
 * @author PRG
 * @version 1.0
 */
    public class Apartado030201 extends Apartado {
   
       protected String obtenerPractica(){
         return "P-VAR";
      }
   
       protected String obtenerBloque() {
         return "Cadenas de caracteres - Clase <<String>>";
      }
   
   /**
    * Cadenas de caracteres - Clase <<String>> - Ejercicio1.
    *
    * </br>
    *
    * Se pide anyadir el codigo necesario para realizar las siguientes tareas:
    *	Obtener el numero de caracteres de la cadena.
    *	Calcular la posicion intermedia de la cadena.
    *	Extraer el caracter que ocupa dicha posicion.
    *	Mostrar por pantalla dicho caracter y el codigo que lo representa.
    */
       public void ejercicio01() {
         cabecera("01","");
         String cadena = "En un lugar de la Mancha";
        // Inicio modificacion
	//Para saber la longitud de la frase
	int frase = cadena.length();
	//Esto es para saber cual es la letra que está en el medio, aunque que creo que no se haría así
	String letra = cadena.substring (11,13);
	
	System.out.println (cadena);
	System.out.println (frase);
	System.out.println (letra);
	
        // Fin modificacion
      }
   
   /**
    * Cadenas de caracteres - Clase <<String>> - Ejercicio2.
    *
    * </br>
    *
    *	Comparar las dos cadenas para ver si son iguales y mostrar por pantalla el resultado de la comparacion.
    * Volver a compararlas pero ahora sin tener en cuenta si estan en mayusculas o minusculas y mostrar por pantalla el resultado de la comparacion.
    *	Convertir las dos cadenas a minusculas, volver a compararlas y mostrar por pantalla el resultado de la comparacion.
    *
    */
       public void ejercicio02() {
         cabecera("02", "");
         String cadena = "Viaje al Parnaso";
         String otraCadena = "ViAje al pArnaso";
      // Inicio modificacion
	boolean comparación1 = cadena.equals(otraCadena);
	System.out.println (comparación1);
	boolean comparación2 = cadena.equalsIgnoreCase(otraCadena);
	System.out.println (comparación2);
	boolean comparación3 = cadena.toLowerCase().equals(otraCadena.toLowerCase());
	System.out.println (comparación3);
      // Fin modificacion
      }
   
   /**
    * Cadenas de caracteres - Clase <<String>> - Ejercicio3.
    *
    * </br>
    * Se pide anyadir el codigo necesario para realizar las siguientes tareas:
    *	Concatenar las dos cadenas formando una tercera usando el operador +
    * Concatenar las dos cadenas formando una tercera usando el metodo concat
    * Mostrar los resultados por pantalla.
    */
       public void ejercicio03() {
         cabecera("03", "");
      
         String cadena = "Viaje al Parnaso";
         String otraCadena = "Persiles y Segismunda";
      // Inicio modificacion
	String primera = cadena + otraCadena;
	System.out.println (primera);
	String segunda = cadena.concat(otraCadena);
	System.out.println (segunda);
        // Fin modificacion
      }
   
   /**
    * Cadenas de caracteres - Clase <<String>> - Ejercicio4.
    *
    * </br>
    *
    * Se pide anyadir el codigo necesario para realizar las siguientes tareas:
    * Comprobar si la cadena termina con la palabra Parnaso utilizando endsWith.
    * Comprobar si la cadena empieza con la palabra Viaje utilizando startsWith.
    * Mostrar los resultados por pantalla.
    */
       public void ejercicio04() {
         cabecera("04", "");
         String cadena = "Viaje al Parnaso";
        // Inicio modificacion
	boolean end = cadena.endsWith ("Parnaso");
	boolean start = cadena.startsWith ("Viaje");
	System.out.println ("¿Empieza por Viaje? " + end);
	System.out.println ("¿Acabo por Parnaso? " + start);
        // Fin modificacion
      }
   
   /**
    * Cadenas de caracteres - Clase <<String>> - Ejercicio5.
    *
    * </br>
    *
    * Se pide anyadir el codigo necesario para realizar las siguientes busquedas en cadena utilizando indexOf:
    * Buscar si el caracter p esta en la cadena y mostrar el resultado por pantalla.
    * Buscar si la cadena Par esta en la cadena y mostrar el resultado por pantalla.
    * Buscar la ultima ocurrencia de la letra a en la cadena y mostrar el resultado por pantalla.
    * Buscar la letra a empezando por la posicion 3 y mostrar el resultado por pantalla.
    */
       public void ejercicio05() {
         cabecera("05","");
         String cadena = "Viaje al Parnaso";
      // Inicio modificacion
	boolean p = cadena.contains("p");
	System.out.println ("¿Tiene la letra p? "  + p);
	boolean Par = cadena.contains("Par");
	System.out.println ("¿Tiene las letras Par? " + Par);
	int a = cadena.lastIndexOf('a');
	System.out.println ("la posicion del ultimo caracter a es = " + a);
	a = cadena.indexOf('a', 3);
	System.out.println("la posicion del ultimo caracter a desde la tercera letra es = " + a);
        // Fin modificacion  
      }
   
   /**
    * Cadenas de caracteres - Clase <<String>> - Ejercicio6.
    *
    * </br>
    *
    * Se pide anyadir el codigo necesario para realizar las siguientes tareas:
    *	Reemplazar las ocurrencias de la letra a por * y mostrar el resultado por pantalla.
    * Reemplazar las ocurrencias de la palabra Parnaso por Olimpo y mostrar en resultado por pantalla
    */
       public void ejercicio06() {
         cabecera("06", "");
      
         String cadena = "Viaje al Parnaso";
      // Inicio modificacion
	System.out.println (cadena);
	String cadena1;
	cadena1 = cadena.replaceAll("a", "*");
	System.out.println (cadena1);
	String cadena2;
	cadena2 = cadena.replaceAll("Parnaso", "Olimpo");
	System.out.println (cadena2);
      // Fin modificacion
      }
   
   /**
    * Cadenas de caracteres - Clase <<String>> - Ejercicio7.
    *
    * </br>
    *
    * Se pide anyadir el codigo necesario para realizar las siguientes tareas:
    * Obtener la subcadena que va desde la mitad al final.
    * Obtener la subcadena que empieza en la primera j y termina antes de la primera s
    */
       public void ejercicio07() {
         cabecera("07", "");
         String cadena = "Viaje al Parnaso";
      // Inicio modificacion
	int frase = cadena.length();
	int mitad = frase/2;
	String cadena1 = cadena.substring (mitad,frase);
	System.out.println (cadena1);
	
	int s = cadena.indexOf('s');
	int j = cadena.indexOf('j');
	String cadena2 = cadena.substring(j,s);
	System.out.println (cadena2);
	
        // Fin modificacion
      }
   
   /**
    * Cadenas de caracteres - Clase <<String>> - Ejercicio8.
    *
    * </br>
    *
    * Se pide anyadir el codigo necesario quitar los espacios sobrantes al principio y al final.
    */
       public void ejercicio08() {
         cabecera("08", "");
         String cadena = " La Galatea   ";
      // Inicio modificacion
	String cadena1 = cadena.trim();
	System.out.println (cadena1);
        // Fin modificacion
      }
   
   /**
    * Cadenas de caracteres - Clase <<String>> - Ejercicio9.
    *
    * </br>
    *
    * Se pide anyadir el codigo necesario convertir las variables a String utilizando el metodo valueOf. Mostrar el resultado por pantalla.
    */
       public void ejercicio09() {
         cabecera("09", "");
         double numero = 1.12e12;
         boolean expresion = true;
         long enteroGrande = 1231231L;
      // Inicio modificacion
	String uno;
	uno = String.valueOf(numero);
	System.out.println (uno);
	String dos;
	dos = String.valueOf(expresion);
	System.out.println (dos);
	String tres;
	tres = String.valueOf(enteroGrande);
	System.out.println (tres);
        // Fin modificacion
      }
   
   /**
    * Cadenas de caracteres - Clase <<String>> - Ejercicio10.
    *
    * </br>
    *
    * Se pide compara las dos cadenas lexicograficamente y mostrar el resultado por pantalla.
    */
       public void ejercicio10() {
         cabecera("10", "");
         String cadena = "Viaje al Parnaso";
         String otraCadena = "Viaje al Olimpo";
      // Inicio modificacion
	int lexicograficamente = cadena.compareTo(otraCadena);
	System.out.println (lexicograficamente);
        // Fin modificacion
      }
   }
