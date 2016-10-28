import java.util.Random;		//Importamos la libreria Random

public class NumeroAleatorio {

	public static void main(String[] args) {
		int n1;
		Random numRandom = new Random();		//Creamos objeto de la clase Random
		n1 = numRandom.nextInt(8) + 1;			//Este comando genera un numero entre 1 y 8
		System.out.println(n1); 				//Imprimimos el numero aleatorio creado
	}

}
