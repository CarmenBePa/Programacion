import java.util.Scanner;

public class TablaMultilicar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.println("Vamos a hacer la tabla de multiplicar. Introduce un numero: ");
		int numero = input.nextInt();
		

		System.out.println("La tabal de multiplicar del numero " + numero);
		for (int m = 0; m <= 10; m++)
		// El termino "m" seria el multiplicador. Por tanto, "m" empieza en 0; y mientras que
		// "m" sea menor o igual que 10 se seguira multiplicando. Ademas, "m" ira aumentando hasta que sea 10
	
			
		System.out.println(numero + " * " + m + " = " + (numero * m));

	}

}
