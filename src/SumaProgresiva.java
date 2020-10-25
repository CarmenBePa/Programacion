import java.util.Scanner;

public class SumaProgresiva {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.println("Vamos a sumar consecutivamente. Introduce un termino: ");
		int n2 = input.nextInt();
		int numero = n2;

		while (n2 != 0) {
			System.out.println("Introduce el siguiente termino para sumar: ");
			n2 = input.nextInt();
			numero = numero + n2;
			System.out.println("El resultado es: " + (numero));
		}

		if (n2 == 0)
			System.out.println("Termino inadecuado. El resultado final es " + numero );
		
	}

}
