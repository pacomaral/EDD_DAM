import java.util.Scanner;

/**	
	Un	 número	 perfecto es	 un	 entero	 positivo	 igual	 a	 la	 suma	 de	 sus	 divisores	
	propios.	Un	 divisor	 propio	es	 un	entero	 positivo	 distinto	 que	el	 número	en	 sí	
	mismo,	que	divide	al	número	de	forma	exacta	(es	decir,	sin	resto).	Por	ejemplo,	
	6	es	un	número	perfecto,	porque	la	suma	de	sus	divisores	propios	1,	2	y	3	es	igual	
	a	6.	Por	el	contrario, el	número	8	no	es	no	número	perfecto	porque	la	suma	de	
	sus	 divisores	propios	 (1+2+4)	es	 distinto	a	 8.	Se	 pide	escribir	 un	 programa	en	
	Java,	que	dado	un	determinado	número	determine	si	es	un	número	perfecto.
*/

	public class NumeroPerfecto {
		
	public static void main(String[] args) {
		
		Scanner teclado=new Scanner(System.in);
		int numero, divisor=1, suma=0;							//Divisor será 1 ya que el con el 0 no funcionaría
		
		System.out.println("Dime un número");
		numero=teclado.nextInt();
		
		while(divisor<numero){
			if(numero%divisor==0){
				suma+=divisor;									// Lo mismo que suma=suma+divisor
			}
			divisor++;
		}
		
		if(suma==numero){
			System.out.println("El número es perfecto");
		}
		else{
			System.out.println("El número NO es perfecto");
		}

	}

}
