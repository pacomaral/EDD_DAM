import java.util.Scanner;

/**
 * 
 * 	Escribe	 un	 programa	en	 Java	 que	 dado	 un	 determinado	 número	indique	 si	es	
 *	primo o	no.	Un	número	es	primo	si	es	divisible	únicamente	por	1	y	por	el	propio	
 *	número. Por	ejemplo,	el	número	13	es	primo	porque	únicamente	 tiene	como	
 *	divisores	el	 1	y	el	 propio	 número	 13,	 por	 tanto,	 no	 se	encuentra	 ningún	 otro	
 *	número	divisible.	
 *
 */
public class Numero_primo {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		int numero,divisor=2,contador=0;			//Divisor empieza en 2 ya que el 1 no cuenta como divisor
		
		System.out.println("Dime un número");
		numero=teclado.nextInt();
		
		while(divisor<numero){
			if(numero%divisor==0){					//Si tiene un divisor diferente a 1 aumentaremos el contador
				contador++;
			}
			divisor++;
		}
		if(contador==0){							//Por tanto si el contador es 0, será primo
			System.out.println("El número es primo");
		}
		else{
			System.out.println("El número NO es primo");
		}

	}

}
