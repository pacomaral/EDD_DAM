/*		Un	restaurante	ofrece	un	10%	de	descuento	para	consumos	de	hasta	100€	y	un	
		descuento	 del	 20%	 para	 consumos	 mayores.	 En	 ambos	 casos	 se	 aplica	 un	
		impuesto del	19%.	Determinar	la	cantidad	del	descuento,	el	impuesto	y	el	importe	
		final	a	pagar.
*/

import java.util.Scanner;

public class Ej2 {

	public static void main(String[] args) {
		
		//Variables
		float consumo, descuento, impuesto, importeTotal;

		//INPUT
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce el precio de tu consumo: ");
		consumo = teclado.nextFloat();
		
		//PROCESO
		if (consumo <= 100){
			descuento = consumo * 0.10f;						//Descuento del 10% para consumos de hasta 100 eur
		}
		else{
			descuento = consumo * 0.20f;						//Descuento del 20% para consumos mayores de 100 eur
		}
		
		impuesto = (consumo - descuento) * 0.19f;			//Calculamos el impuesto con el descuento ya aplicado al precio	
		importeTotal = consumo - descuento +  impuesto;		//Calculamos finalmente el importe total a pagar por el cliente
	
		//OUTPUT
		System.out.println("El precio es de: " + consumo + " euros");
		System.out.println("Tienes un descuento de: " + descuento + " euros y un impuesto de: " + impuesto + " euros");
		System.out.println("El precio total es de: " + importeTotal + " euros");
		
	}
		
		
	

}
