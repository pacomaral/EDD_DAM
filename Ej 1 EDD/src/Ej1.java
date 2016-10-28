/*En una universidad se han establecido las siguientes puntuaciones para
escoger la facultad de ingreso. Realiza un programa en Java que dado una
puntuación muestre la facultad a la que puede acceder.
----------------------------------------------------------------------*/


import java.util.Scanner;  //Biblioteca necesaria para utilizar la clase Scanner

public class Ej1 {

	public static void main(String[] args) {
		//Variables
		int punt;
		String facultad = "";
		
		//INPUT
		Scanner teclado = new Scanner(System.in);  //Creamos un objeto de la clase Scanner
		System.out.println("Escribe tu puntuación: ");
		punt = teclado.nextInt();
		
		//Proceso. Estructura condicional if-else if
		if (punt >= 100){
			facultad = "Sistemas";
		}
		else if(punt >= 90){
			facultad = "Electronica";
		}
		else if(punt >= 80){
			facultad = "Industrial";
		}
		else if(punt >= 70){
			facultad = "Administracion";
		}
		else{
			System.out.println("Tu puntuacion es menor de 70 o has introducido datos no validos");
		}
		
		//OUTPUT
		System.out.println("Puedes acceder a la facultad de: " + facultad);

	}

}
