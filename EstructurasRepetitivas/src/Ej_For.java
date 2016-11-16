/**
 *  El mismo ejercicio que el anterior pero con el bucle For en lugar de While
 */


import java.util.Scanner;

public class Ej_For {

	public static void main(String[] args) {
		
		//VARIABLES
		int numero, suma;
		
		suma = 0;
		
		//ENTRADA DE DATOS
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce un numero: ");
		numero = teclado.nextInt();
		
		//PROCESO
		for (int i=1; i<=numero; i++){
			suma = suma + i;
		}
		
		//SALIDA DE DATOS
		System.out.println("La suma total es: " + suma);
		
	}
}
