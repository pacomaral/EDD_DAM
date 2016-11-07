/*
 * Realizar	un programa en Java que determine si un número es múltiplo de 3 y de 5.
 * 
*/  


import java.util.Scanner;

public class Mult_3_y_5 {

	public static void main(String[] args) {
		
		//Variables
		int num;
		String resultado = "";
		
		//INPUT
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce un numero para saber si es multiplo de 3 y de 5: ");
		num = teclado.nextInt();
		
		//Proceso
		if (num%5 == 0 && num%3 == 0){								//Comprobamos que sea multiplo de ambos mediante el módulo 
			resultado = "El numero es multiplo de 3 y de 5";		//(que al dividir entre 5 y 3 de 0 de resto)
		}
		else if (num%5 == 0){
			resultado = "El numero solo es multiplo de 5";			//Sólo de 5
		}
		else if (num%3 == 0){
			resultado = "El numero solo es multiplo de 3";			//Sólo de 3
		}
		else{
			resultado = "El numero no es multiplo de 3 ni de 5";	//No es múltiplo de ninguno
		}
		
		//OUTPUT
		System.out.println(resultado);

	}

}
