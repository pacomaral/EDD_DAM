/*Se pide realizar una aplicación que determine el importe a pagar para el
examen de una universidad en base al nivel socioeconómico y al colegio
de procedencia. Por lo tanto, dado el colegio y el nivel se mostrará el
importa a pagar.
-------------------------------------------------------------------*/


import java.util.Scanner;

public class Ej2 {

	public static void main(String[] args) {
		
		//Variables
		int importe = 0;
		String colegio;
		String nivel;
		
		//INPUT
		Scanner teclado = new Scanner(System.in);
		System.out.println("Colegio Nacional o Particular? ");
		colegio = teclado.nextLine();
		System.out.println("Nivel A, B o C? ");
		nivel = teclado.nextLine();
		
		//Proceso
		if (colegio.equals("Nacional") && nivel.equals("A")){			//nombrestring.equals("String") sirve para comprobar que la string almacena un texto determinado
			importe = 300;
		}
		else if (colegio.equals("Nacional") && nivel.equals("B")){
			importe = 200;
		}
		else if (colegio.equals("Nacional") && nivel.equals("C")){
			importe = 100;
		}
		else if (colegio.equals("Particular") && nivel.equals("A")){
			importe = 400;
		}
		else if (colegio.equals("Particular") && nivel.equals("B")){
			importe = 300;
		}
		else if (colegio.equals("Particular") && nivel.equals("C")){
			importe = 200;
		}
		else{
			System.out.println("Has introducido datos no validos.");
		}
		
		//OUTPUT
		System.out.println("El importe a pagar es de: " + importe);
		
	}
}
