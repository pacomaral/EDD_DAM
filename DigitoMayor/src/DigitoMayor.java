import java.util.Scanner;

/**
 * Escribe	un	programa	en	Java	que	dado	un	determinado	número,	deberá	devolver
 * el	dígito	mayor.	Por	ejemplo,	si	el	número	es	el	764,	el	dígito	mayor	es	el	7. 
 */



public class DigitoMayor {

	public static void main(String[] args) {
		
		Scanner teclado=new Scanner(System.in);
		
		int numero,digitoMayor=0;
		
		System.out.println("Dime un número: ");
		numero=teclado.nextInt();
		
		while(numero>0){
			if((numero%10)>digitoMayor){
				digitoMayor=numero%10;
			}
			numero=numero/10;
		}
		
		
		//Mostramos el dígito mayor por pantalla
		System.out.println("El dígito mayor del numero es el: " + digitoMayor);
	
	}

}
