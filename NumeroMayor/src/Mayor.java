import java.util.Scanner;

public class Mayor {

	public static void main(String[] args) {
		//Variables
		int num1, num2, mayor;
		
		//INPUT
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dime un numero: ");
		num1 = teclado.nextInt();
		System.out.println("Dime otro numero: ");
		num2 = teclado.nextInt();
		
		//Condicional IF + Proceso
		if (num1 > num2){
			mayor = num1;
		}
		else{
			mayor = num2;
		}
		
		//OUTPUT
		System.out.println("El numero mayor es: " + mayor);
		
	}

}
