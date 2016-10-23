import java.util.Scanner; //Importamos la biblioteca para poder crear el objeto de la clase Scanner

public class SumaDosNumeros {

	public static void main(String[] args) {
		//Variables
		int n1, n2, suma;
		
		//Input
		Scanner teclado = new Scanner(System.in);  //Creamos objecto de la clase Scanner
		
		System.out.println("Dime un numero: ");
		n1 = teclado.nextInt();
		System.out.println("Dime otro numero: ");
		n2 = teclado.nextInt();
		
		//Proceso
		suma = n1 + n2;
		
		//Output
		System.out.println("La suma de ambos numeros es " + suma);

	}

}
