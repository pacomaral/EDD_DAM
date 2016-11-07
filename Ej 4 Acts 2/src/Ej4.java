/*		Realizar	un	programa	en	 Java,	que	reciba	un	n�mero	entre	1	y	4	y	muestre	la	
		estaci�n	del	a�o	seg�n	la	siguiente	tabla.	Para	este	ejercicio,	se	deber�	usar	la	
		estructura	selectiva	m�ltiple	switch.

			N�mero 		Estaci�n
			
			1 			Verano
			2 			Oto�o
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
		System.out.println("Introduce un numero del 1 al 4 para ver a que estacion del a�o corresponde: ");
		num = teclado.nextInt();
		
		//PROCESO
		switch (num){
		case 1:
			estacion = "Verano";
			break;
		case 2:
			estacion = "Oto�o";
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
