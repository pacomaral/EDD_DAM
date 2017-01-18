import java.util.Scanner;

/**
 * 
 * 	Escribe	 un	 programa	en	 Java	 que	 dado	 un	 determinado	 n�mero	indique	 si	es	
 *	primo o	no.	Un	n�mero	es	primo	si	es	divisible	�nicamente	por	1	y	por	el	propio	
 *	n�mero. Por	ejemplo,	el	n�mero	13	es	primo	porque	�nicamente	 tiene	como	
 *	divisores	el	 1	y	el	 propio	 n�mero	 13,	 por	 tanto,	 no	 se	encuentra	 ning�n	 otro	
 *	n�mero	divisible.	
 *
 */
public class Numero_primo {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		int numero,divisor=2,contador=0;			//Divisor empieza en 2 ya que el 1 no cuenta como divisor
		
		System.out.println("Dime un n�mero");
		numero=teclado.nextInt();
		
		while(divisor<numero){
			if(numero%divisor==0){					//Si tiene un divisor diferente a 1 aumentaremos el contador
				contador++;
			}
			divisor++;
		}
		if(contador==0){							//Por tanto si el contador es 0, ser� primo
			System.out.println("El n�mero es primo");
		}
		else{
			System.out.println("El n�mero NO es primo");
		}

	}

}
