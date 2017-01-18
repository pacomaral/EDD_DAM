import java.util.Scanner;

/**	
	Un	 n�mero	 perfecto es	 un	 entero	 positivo	 igual	 a	 la	 suma	 de	 sus	 divisores	
	propios.	Un	 divisor	 propio	es	 un	entero	 positivo	 distinto	 que	el	 n�mero	en	 s�	
	mismo,	que	divide	al	n�mero	de	forma	exacta	(es	decir,	sin	resto).	Por	ejemplo,	
	6	es	un	n�mero	perfecto,	porque	la	suma	de	sus	divisores	propios	1,	2	y	3	es	igual	
	a	6.	Por	el	contrario, el	n�mero	8	no	es	no	n�mero	perfecto	porque	la	suma	de	
	sus	 divisores	propios	 (1+2+4)	es	 distinto	a	 8.	Se	 pide	escribir	 un	 programa	en	
	Java,	que	dado	un	determinado	n�mero	determine	si	es	un	n�mero	perfecto.
*/

	public class NumeroPerfecto {
		
	public static void main(String[] args) {
		
		Scanner teclado=new Scanner(System.in);
		int numero, divisor=1, suma=0;							//Divisor ser� 1 ya que el con el 0 no funcionar�a
		
		System.out.println("Dime un n�mero");
		numero=teclado.nextInt();
		
		while(divisor<numero){
			if(numero%divisor==0){
				suma+=divisor;									// Lo mismo que suma=suma+divisor
			}
			divisor++;
		}
		
		if(suma==numero){
			System.out.println("El n�mero es perfecto");
		}
		else{
			System.out.println("El n�mero NO es perfecto");
		}

	}

}
