import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.println("Vamos a calcular el Factorial de un numero. Por favor introduce un numero de 1 digito: ");
		int numero = input.nextInt();
		int factorial = 1;
		
		while (numero > 1) {
			factorial = factorial * numero;
			--numero;
		}
		
		System.out.println("El factorial es: " + factorial);
		
	}

}
