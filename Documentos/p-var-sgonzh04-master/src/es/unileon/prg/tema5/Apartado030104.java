package es.unileon.prg.tema5;

/**
 * Clase con los ejercicios correspondientes a conversiones de tipo.
 *
 * @author PRG
 * @version 1.0
 */
    public class Apartado030104 extends Apartado {
   
       protected String obtenerPractica(){
         return "P-VAR";
      }
   
       protected String obtenerBloque() {
         return "Conversiones de tipo";
      }
   
   /**
    * Conversiones de tipo - Ejercicio1.
    *
    * </br>
    *
    * Comprobar cuales de las conversiones implicitas realizadas son correctas y comentar las incorrectas.
    */
       public void ejercicio01() {
         cabecera("01","");
      
         byte varByte;
         short varShort;
         int varInt;
         long varLong;
         float varFloat;
         double varDouble;
         char varChar ;
         boolean varBoolean;
          
         varByte = 50;
         varShort = 1500 ;
         varInt = 1500000 ;
         varLong = 65000000 ;
         varFloat = 20.0E4F ;
         varDouble = 0.123456789e9 ;
         varChar = 'H' ;
         varBoolean = true ;
      
         varInt    = varShort;
         varDouble = varFloat;  
         varFloat  = varLong;
         varLong   = varInt;
         varLong   = 9223372036854775807L;
         varFloat  = varLong;
/*
	 varByte   = varShort;
         varShort  = varInt;

Lo pongo en comentarios porque sino me da error al compilar constantemente. Estas dos conversiones son incompatibles ya que 	varShort es mayor que varByte y varInt es mayor que varShort, no pueden contener todos sus valores. Las demás parece que están bien.
*/

      
      }
   
   /**
    * Conversiones de tipo - Ejercicio2.
    *
    * </br>
    *
    * Asignar varLong al resto de variables realizando las conversiones explicitas necesarias
    * Imprime por pantalla el resultado de dichas conversiones
    */
       public void ejercicio02() {
         cabecera("02", "");
      
      // Inicio modificacion
         byte varByte;
         short varShort;
         int varInt;
         long varLong;
      
         varLong=35000L;
	//No estoy seguro de como se hace, pero parece que tengo que hacer algo llamado "casting" para que pueda usar los valores long en 
	//los otros que son más pequeños
	varByte = (byte) varLong;
	varShort = (short) varLong;
	varInt = (int) varLong;
	System.out.println (varByte);
	System.out.println (varShort);
	System.out.println (varInt);
      // Fin modificacion
      }
   
   /**
    * Conversiones de tipo - Ejercicio3.
    *
    * </br>
    *
    * Asignar varFloat al resto de variables realizando las conversiones necesarias.
    * Imprime por pantalla el resultado de dichas conversiones
    */
       public void ejercicio03() {
         cabecera("03", "");
      
      // Inicio modificacion
         byte varByte;
         short varShort;
         int varInt;
         long varLong;
         float varFloat;
         double varDouble;
         varFloat= 123.1f;
	varByte = (byte) varFloat;
	varShort = (short) varFloat;
	varInt = (int) varFloat;
	varLong = (long) varFloat;
	varDouble = varFloat;
	System.out.println (varByte);
	System.out.println (varShort);
	System.out.println (varInt);
	System.out.println (varLong);
	System.out.println (varDouble);
        // Fin modificacion
      }
   
   /**
    * Conversiones de tipo - Ejercicio4.
    *
    * </br>
    *
    * Arreglar los posibles errores de compilacion y explicar en el fichero LEEME.TXT los resultados    */
       public void ejercicio04() {
         cabecera("04", "");
      
         double dGigante, dNormal, dMinimo;
         float  fGigante, fNormal, fMinimo;
      
         dGigante = 1.766e289;
         dNormal  = 35.987654321;
         dMinimo  = 0.2E-256;
      
         fGigante = (float)dGigante;
         fNormal  = (float)dNormal;
         fMinimo  = (float)dMinimo;
      
         System.out.println("Gigante: " + fGigante);    
         System.out.println("Normal : " + fNormal);    
         System.out.println("Minimo : " + fMinimo);
      
         byte b = (byte)130;
         short s = (short)32770;
         int i = (int)2147483650l; 
      
         System.out.println("Byte  : " + b);    
         System.out.println("Short : " + s);    
         System.out.println("Int   : " + i);
      
         double f = 1.3e22;   
         System.out.println("f: " + f);    
      }
   }
