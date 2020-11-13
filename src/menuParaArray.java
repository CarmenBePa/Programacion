import java.util.Scanner;

public class menuParaArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		int opcion = 0;

		do {
			opcion = menu();
			switch (opcion) {
			case 1:
				int[] array = iniciarArray(12);
				break;

			case 2:

			case 3:

			case 4:

			case 5:

			case 6:

			case 7:

			}
		} while (opcion != 8);
		System.out.println("¡Hasta pronto!");

	}

	public static int[] iniciarArray(int n) {
		Scanner input = new Scanner(System.in);

		int array[] = new int[n];
		System.out.println("Introduce valores para rellenar la array");

		for (int i = 0; i < 12; i++) {

			array[i] = input.nextInt();
		}
		return array;
	}

	
	public static int[] 
	
	
	public static int menu() {
		int opcion;
		Scanner input = new Scanner(System.in);
		System.out.println("");
		System.out.println(" Menu ");
		System.out.println("---------------");
		System.out.println("1.- Inicializar una array con valores que tu introduzcas.");
		System.out.println("2.- Inicializar una array con valores aleatorios");
		System.out.println("3.- Mostrar array");
		System.out.println("4.- Sumar todos los elementos de la array");
		System.out.println("5.- Encuentra el valor mas alto");
		System.out.println("6.- Encuentra el indice mas pequeño donde se encuentra el elemento mas alto");
		System.out.println("7.- Mezcla aleatoria. ");
		System.out.println("---------------");
		System.out.println("¿Cual eliges?: ");
		opcion = input.nextInt();
		return opcion;

	}
}
