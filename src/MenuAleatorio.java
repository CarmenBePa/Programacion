import java.util.Scanner;

public class MenuAleatorio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		int opcion = 0;
		int n;
		int n1;
		int num;

		do {
			opcion = menu();
			switch (opcion) {
			case 1: 
				n = 0;
				System.out.println("El numero aleatorio seleccionado es: " + numRandom(n) );
				break;
			
		
			case 2:
				char l = 'l';
				System.out.println("El caracter elegido es: " + letraRandom(l) );
			}
			
		}while (opcion != 4); 
		
	}
		
		public static int numRandom (int n) {
			
			int num = (int)(Math.random()*10);
			return num;
		}
		
		
		public static char letraRandom (char l) {
			char letra = (char)(int)(Math.random()*10);
			
			
			return letra;
			
		}
		
		
		public static int menu() {
			int opcion;
			Scanner input = new Scanner(System.in);
			System.out.println("");
			System.out.println(" Menu ");
			System.out.println("---------------");
			System.out.println("1.- Generar un numero del 1 al 9.");
			System.out.println("2.- Generar un caracter en minusculas de la 'a' a la 'z'.");
			System.out.println("3.- Generar un caracter en mayusculas de la 'a' a la 'z'.");
			System.out.println("4.- Salir.");
			System.out.println("---------------");
			System.out.println("¿Cual eliges?: ");
			opcion = input.nextInt();
			return opcion;
		
		
		
		
	}

}
