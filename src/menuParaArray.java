import java.lang.reflect.Array;
import java.util.Scanner;

public class menuParaArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		int opcion = 0;
		int array[] = null;

		do {
			opcion = menu();
			switch (opcion) {
			case 1:
				array = iniciarArray(12);
				break;

			case 2:

				array = aleatorios();
				break;

			case 3:
				mostrar(array);
				break;

			case 4:
				int sum = sumar(array);
				System.out.println("La suma de valores de la array dan como resultado: " + sum);
				break;

			case 5:
				

			case 6:
				System.out.println("El elemento menor esta en la posicion" + posicionMenor(array) + " con el valor " + array[posicionMenor(array)]);
				break;

			case 7:
				System.out.println();
				
				break;

			}
		} while (opcion != 8);
		System.out.println("¡Hasta pronto!");

	}

/*1*/
	public static int[] iniciarArray(int n) {
		Scanner input = new Scanner(System.in);

		int array[] = new int[n];
		System.out.println("Introduce valores para rellenar la array");

		for (int i = 0; i < 12; i++) {

			array[i] = input.nextInt();
		}
		return array;
	}


/*2*/
	public static int[] aleatorios() {
		int array[] = new int[12];

		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 50);
		}
		return array;
	}


/*3*/
	public static String mostrar(int[] array) {
		String report = "";
		for (int i = 0; i < array.length; i++) {
			report += "valor" + i + ":" + array[i] + "\t";

			if (i % 10 == 0)
				report += "\n";

			System.out.println(array[i]);
		}
		return report;
	}


/*4*/
	public static int sumar(int array[]) {
		int suma = 0;

		for (int i = 0; i < array.length; i++) {

			suma += array[i];
		}
		//System.out.println(suma);
		return suma;
	}

	
/*5*/ 
// public static int valorMayor (int array[])


/*6*/
	public static int posicionMenor(int[] array) {
		int menor = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[menor] < array[i])
				menor = i;
		}
		return menor;
	}


/*7*/
	public static void mezclaAleatoria(int[] array) {

		for (int i = 0; i < array.length; i++) {
			int r = (int) (Math.random() * array.length);
			int auxiliar = array[i];
			array[i] = array[r];
			array[r] = auxiliar;
		}

	}

	
	
	
	
	
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
