/*	Realiza una aplicación con Java que permita mostrar el premio (oro, plata
	o bronce) con respecto al lanzamiento de tres dados en base a la cantidad
	de valores seis que se han obtenido. El resultado será oro, plata, bronce
	o si resultas perdedor. Las puntuaciones junto con los premios son las
	siguientes:
		a. Tres dados con valor seis: Oro
		b. Dos dados con valor seis: Plata
		c. Un dado con valor seis: Bronce
		d. Ningún dado con valor seis: Perdedor
----------------------------------------------------------------------*/



import java.util.Random;		//Importamos la biblioteca Random

public class Ej3 {

	public static void main(String[] args) {
		
		//Variables
		int num1, num2, num3;
		
		//Asignación aleatoria a los 3 numeros (lanzamiento de dados)
		Random rand = new Random();											//Creamos un objeto de la clase Random 	
		num1 = rand.nextInt(6) + 1;												
		num2 = rand.nextInt(6) + 1;											//Con nombreobjeto.nextInt(6) + 1 generamos un número aleatorio entre 1 y 6
		num3 = rand.nextInt(6) + 1;
		
		//OUTPUT (Para saber los 3 números del lanzamiento de los 3 dados)
		System.out.println("Primer dado: " + num1);
		System.out.println("Segundo dado: " + num2);
		System.out.println("Tercer dado: " + num3);
		
		//Proceso + output (resultado o premio)
		if (num1 == 6 && num2 == 6 && num3 == 6){
			System.out.println("Enhorabuena, has obtenido el premio de ORO");
		}
		else if ((num1 == 6 && num2 == 6) || (num1 == 6 && num3 == 6) || (num2 == 6 && num3 == 6)){
			System.out.println("Enhorabuena, has obtenido el premio de PLATA");
		}
		else if (num1 == 6 || num2 == 6 || num3 == 6){
			System.out.println("Enhorabuena, has obtenido el premio de BRONCE");
		}
		else{
			System.out.println("Lo siento, has perdido.");
		}
		
		
	}

}
