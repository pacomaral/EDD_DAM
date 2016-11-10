/*	Escribe un	programa	que	lea	un	mes	en	n�mero	(1	para	enero,	2	para	
*	febrero,	 3	 para	 marzo�)	 y	 un	 a�o.	 El	 programa	 deber�	 mostrar	 el	
*	n�mero	de d�as de	ese	mes	teniendo	en	cuenta	el	mes	que	se	trata (por	
*	ejemplo	 diciembre	 tiene	 31	 d�as,	 pero	 noviembre	 tiene	 30	 d�as) y	
*	adem�s	de	si	un	a�o	en	concreto	es	bisiesto.	
*	Recordad	 que	 un	 a�o	 es	 bisiesto	 si	 es	 divisible	 por	 cuatro,	 excepto	
*	cuando	 es	 divisible	 por	 100,	 a	 no	 ser	 que	 sea	 divisible	 por	 400.	 Por	
*	ejemplo,	1900	no fue	bisiesto,	pero	el	a�o	2000	s�	lo	fue.
*/

import java.util.Scanner;

public class EjOpcional {

	public static void main(String[] args) {
		
		//VARIABLES
		int mes=0;
		int numDias=0;
		int anyo=0;
		String esBisiesto="";
		String resultado="";
		
		//INPUT
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce el numero del mes (1 = Enero, 2 = Febrero...): ");
		mes = teclado.nextInt();
		
		/**
		 * 		Comprobaci�n de datos
		 */
		
		if (mes > 12 || mes < 1){													//Comprobamos que se introduzcan datos correctos
			System.out.println("Introduce datos validos (numeros del 1 al 12)");	//Si se introducen datos correctos, el programa continua
			System.exit(0); 														//Con este comando lo que hacemos es parar la ejecuci�n del programa si son incorrectos
		}
		
		
		System.out.println("Ahora introduce el a�o: ");
		anyo = teclado.nextInt();
		
		//PROCESO
		
		/**
		 * 		Comprobamos primero si el a�o introducido es bisiesto o no
		 */
		
		if (anyo % 4 == 0){
			if (anyo % 100 == 0 && anyo % 400 == 0){							//Si es divisible por 4, por 100, y por 400 S� QUE SER� BISIESTO
				esBisiesto = " es bisiesto";
			}
			else if(anyo % 100 == 0 && anyo % 400 != 0){						//Si es divisible por 4, por 100, y no lo es por 400 NO SER� BISIESTO
				esBisiesto = " no es bisiesto";
			}
			else{																//Si s�lo es divisible por 4 S� QUE SER� BISIESTO
				esBisiesto = " es bisiesto";
			}
		}
		else{
			esBisiesto = " no es bisiesto";									//Si no es divisible por 4 NO SER� BISIESTO
		}
		
		
		/**
		 * 		Estructura SWITCH
		 */
		
		switch (mes){
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				numDias = 31;
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				numDias = 30;
				break;
			case 2:
				if (esBisiesto.equals(" es bisiesto")){					//Comprobamos si el String esBisiesto contiene esa cadena de texto (= ser� bisiesto)
					numDias = 29;
				}
				else{
					numDias = 28;										//Si no, no ser� bisiesto
				}
				break;
			
			//default:
			//	resultado = "Introduce datos validos (numeros del 1 al 12).";		NO NECESITAMOS EL DEFAULT YA QUE YA SE COMPRUEBA EN EL PROCESO DE INPUT SI 
			//	break;																LOS DATOS INTRODUCIDOS SON CORRECTOS
		}	
		
		//OUTPUT 
		System.out.println("El mes que has introducido tiene " + numDias + " d�as.");
		System.out.println("El " + anyo + esBisiesto + ".");
		

	}

}
