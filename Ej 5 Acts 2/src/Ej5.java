/*		Realizar un programa que al recibir un determinado mes devuelva la estación del
		año correspondiente. Para este ejercicio se debe usar la estructura selectiva
		switch.

			Mes 			Estación
			3,4,5 			Primavera
			6,7,8	 		Verano
			9,10 			Otoño
			11,12,1,2 		Invierno
*/

import java.util.Scanner;

public class Ej5 {

	public static void main(String[] args) {
		
		//VARIABLES
		int num;
		String estacion = "";
		
		//INPUT
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce el numero del mes para ver a que estacion corresponde: ");
		num = teclado.nextInt();
		
		//PROCESO 
		switch (num){
		case 3:
		case 4:
		case 5:
			estacion = "Primavera";
			break;
		case 6:
		case 7:
		case 8:	
			estacion = "Verano";
			break;
		case 9:
		case 10:
			estacion = "Otoño";
			break;
		case 11:
		case 12:
		case 1:
		case 2:
			estacion = "Invierno";
			break;
		default:
			estacion = "No has introducido un numero del 1 al 12.";
			break;
		}
		
		//OUTPUT
		System.out.println(estacion);

	}

}
