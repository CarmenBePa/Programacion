import java.util.Scanner;

public class juegoAhorcado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int opcion = 0;
		System.out.println("Vamos a jugar al ahorcado.");
		
		String [] diccionario = {"paracaidas","casa","perro","lago","ordenador","arena","marea","bronceado"};
		String palabra = diccionario[(int) (Math.random() * diccionario.length)*10/10];
		char[] mascara = ocultar(palabra);
	
		int fallos = 0;
		System.out.println(palabra);
		System.out.println(mascara);
}		
	
	public static char[] ocultar(String palabra) {
		int letrasPorGuion = palabra.length();
		char[] mascara = new char [palabra.length()];
			for(int i=0; i<mascara.length; i++) {
				mascara[i] = '-';
			}
			return mascara;
	}

	
	
	
	public static boolean comprobar {
		
	}
	
	
	
	

	public static int menu() {

		Scanner input = new Scanner(System.in);
		System.out.println();
		System.out.println("Juego del ahorcado");
		System.out.println("-----");
		System.out.println("1.- Adivina la palabra oculta");
		System.out.println("2.- Salir");

		System.out.println("Tu eleccion");
		int opcion = input.nextInt();
		return opcion;

	}

}

