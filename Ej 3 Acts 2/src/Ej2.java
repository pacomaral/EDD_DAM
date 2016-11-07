/*		Realiza	 un	 programa	 en	 Java,	 que	 dada	 una	 temperatura,	 obtenga	 el	 tipo	 de	
		clima	según	la	siguiente	tabla.

			Temperatura 				Clima
			
			Temp	<	10 				Frío
			Temp.	Entre	10	y	20 	Templado
			Temp.	Entre	21	y	30 	Calor
			Temp.	>	30 				Tropical
*/

import java.util.Scanner;

public class Ej2 {

	public static void main(String[] args) {
		
		//VARIABLES
		float temperatura;
		String clima = "";
		
		//INPUT
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce la temperatura en ºC: ");
		temperatura = teclado.nextFloat();
		
		//PROCESO
		if (temperatura < 10){										//Temperatura menor de 10
			clima = "Frio";
		}
		else if (temperatura >= 10 && temperatura <= 20){			//Temperatura entre 10 y 20
			clima = "Templado";
		}
		else if (temperatura >= 21 && temperatura <= 30){			//Temperatura entre 21 y 30
			clima = "Calor";
		}
		else{														//Temperatura mayor de 30
			clima = "Tropical";
		}
		
		//OUTPUT
		System.out.println("Clima: " + clima);

	}

}
