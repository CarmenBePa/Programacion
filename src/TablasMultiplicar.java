import java.util.Scanner;

public class TablasMultiplicar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.println(
				"Vamos a hacer las tablas de multiplicar del 1 hasta el que tu quieras. Introduce un numero: ");
		int numero = input.nextInt();

		int inicio = 1;

		for (int i = inicio; i <= numero; i++) { // "i" es el contador de los numeros desde el 1 hasta el numero que tu
													// has introducido
			System.out.println("Tabla de multiplicar de " + i);
			System.out.println("_____________");

			for (int c = 1; c <= 10; c++) { // "c" es el contador que va multiplicando cada numero del 1 al 10
				System.out.println(i + " * " + c + " = " + (i * c));
				if (c == 10)
					System.out.println();
			}

		}

	}

}
