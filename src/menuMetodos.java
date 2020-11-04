import java.util.Scanner;

public class menuMetodos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		int opcion = 0;
		int n;
		int n1;

		do {
			opcion = menu();
			switch (opcion) {
			case 1:
				System.out.print("Introduce un numero para comprobar si es primo o no");
				n = input.nextInt();
				if (Primo(n))
					System.out.println("El numero " + n + " es primo");
				else
					System.out.println("El numero " + n + " no es primo");
				break;
				

			case 2:
				System.out.print("Introuce un numero para comprobar si es par o no");
				n = input.nextInt();

				if (Par(n))
					System.out.println("El numero " + n + " es par");
				else
					System.out.println("El numero " + n + " no es par");
				break;
				

			case 3:
				System.out.println("Introduce dos numeros para calcular su MCD.");
				System.out.println("Primer numero: ");
				n = input.nextInt();
				System.out.println("Segundo numero: ");
				n1 = input.nextInt();

				System.out.println("El MCD de " + n + " y " + n1 + " es: " + MCD(n, n1));

				break;
				

			case 4:
				System.out.println("Introduce un numero decimal para transformarlo a hexadecimal.");
				System.out.println("Numero decimal: ");
				n = input.nextInt();

				System.out.println(n + " decimal seria " + conversor(n) + " en hexadecimal");

			}

		} while (opcion != 5);
		System.out.println("¡Hasta pronto!");

	}

	public static boolean Primo(int n) {
		int d = 2;

		while (d < (n / 2) && (n % d != 0))
			d++;

		if (n % d != 0 || n == 2)
			return true;
		return false;
	}

	public static boolean Par(int n) {

		if (n % 2 == 0)
			return true;
		return false;

	}

	public static int MCD(int n1, int n2) {

		int d = (n1 < n2) ? n1 : n2;

		while (n1 % d != 0 || n2 % d != 0)
			d--;

		return d;
	}

	public static String conversor(int decimal) {
		String hex = "";

		while (decimal != 0) {
			int valorHex = decimal % 16;
			// convertimos un valor decimal en un digito hexadecimal:
			char numHex;

			if (0 <= valorHex && valorHex <= 9) {
				numHex = (char) (valorHex + '0');
			} else
				numHex = (char) (valorHex - 10 + 'A');

			hex = numHex + hex;
			decimal = decimal / 16;
		}
		return hex;
	}

	public static int menu() {
		int opcion;
		Scanner input = new Scanner(System.in);
		System.out.println(" Menu ");
		System.out.println("---------------");
		System.out.println("1.- Calcular si un numero es primo o no");
		System.out.println("2.- Calcular si un numero es par o no");
		System.out.println("3.- Calcular el MCD de dos numeros");
		System.out.println("4.- Pasar un numero de decima a Hexadecimal");
		System.out.println("5.- Salir");
		System.out.println("---------------");
		System.out.println("¿Cual eliges?: ");
		opcion = input.nextInt();
		return opcion;
	}

}
