/*		Realizar	un	programa	en	 Java,	que	reciba	un	número	entre	1	y	4	y	muestre	la	
		estación	del	año	según	la	siguiente	tabla.	Para	este	ejercicio,	se	deberá	usar	la	
		estructura	selectiva	múltiple	switch.

			Número 		Estación
			
			1 			Verano
			2 			Otoño
			3 			Invierno
			4 			Primavera
*/

import java.util.Scanner;

public class Ej4 {

	public static void main(String[] args) {
		
		//VARIABLES
		int num;
		String estacion = "";
		
		//INPUT
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce un numero del 1 al 4 para ver a que estacion del año corresponde: ");
		num = teclado.nextInt();
		
		//PROCESO
		switch (num){
		case 1:
			estacion = "Verano";
			break;
		case 2:
			estacion = "Otoño";
			break;
		case 3:
			estacion = "Invierno";
			break;
		case 4:
			estacion = "Primavera";
			break;
		default:
			estacion = "No has introducido un numero del 1 al 4.";
			break;
		}
		
		//OUTPUT
		System.out.println(estacion);
		

	}

}
