import java.util.Scanner;

/**
 * Escribe	un	programa	en	Java	que	dado	un	determinado	n�mero,	deber�	devolver
 * el	d�gito	mayor.	Por	ejemplo,	si	el	n�mero	es	el	764,	el	d�gito	mayor	es	el	7. 
 */



public class DigitoMayor {

	public static void main(String[] args) {
		
		Scanner teclado=new Scanner(System.in);
		
		int numero,digitoMayor=0;
		
		System.out.println("Dime un n�mero: ");
		numero=teclado.nextInt();
		
		while(numero>0){
			if((numero%10)>digitoMayor){
				digitoMayor=numero%10;
			}
			numero=numero/10;
		}
		
		
		//Mostramos el d�gito mayor por pantalla
		System.out.println("El d�gito mayor del numero es el: " + digitoMayor);
	
	}

}
