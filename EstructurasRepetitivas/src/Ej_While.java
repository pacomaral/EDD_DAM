/**
 *  DIAGRAMA DE FLUJO:		https://www.draw.io/#LEjWhile
 */

//Podría hacerse el mismo ejercicio con FOR en lugar de WHILE

import java.util.Scanner;

public class Ej_While {

	public static void main(String[] args) {
		
		//VARIABLES
		int contador, numero, suma;
		
		contador = 1;
		suma = 0;
		
		//ENTRADA DE DATOS
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce un numero: ");
		numero = teclado.nextInt();
		
		//PROCESO
		while(contador <= numero){
			suma = suma + contador;
			contador++;
		}
		
		//SALIDA DE DATOS
		System.out.println("La suma total es: " + suma);
		
	}

}
