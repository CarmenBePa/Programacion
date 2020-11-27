import java.util.Scanner;

public class barajaCartas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int []baraja = newBaraja(40);
		int op;
		do {
			op = menu();
			switch(op) {
			case 1: printDeck(baraja);
				break;
			case 2: mezclarCartas(baraja);
				break;
				
				
			}
		}while(op!=3);
		System.out.println("Chao!");
		
	}

	public static void printDeck(int[] baraja) {
		for(int i=0; i<baraja.length;i++) {
			System.out.println(getValorCarta(baraja[i]) + " de " + getMezclar(baraja[i]));
		}
	}
	
	public static String getValorCarta(int c) {
		String[] cartas = {"Rey","As","2","3","4","5","6","7","Sota","Caballo"};
		
		return cartas[c %10];
	}
	
	public static String getMezclar(int n) {
		String[] mezclar = {"Oro","Espadas","Copas","Bastos"};
		if (n%10 == 0)
			return mezclar[n/10-1];
		return mezclar[n/10];
	}
	
	
	
	public static int[] newBaraja(int n) {
		int[] baraja = new int[n];
		for (int i = 0; i < n; i++)
			baraja[i] = i + 1;

		return baraja;

	}
	
	public static void mezclarCartas (int[] baraja) {
		for (int i=0; i<baraja.length;i++) {
			int r = (int)(Math.random()*40);
			int aux = baraja[i];
			baraja[i] = baraja[r];
			baraja[r] = aux;
		}
		
	}

	public static int menu() {
		int op = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("MENU");
		System.out.println("1.- Mostrar carta");
		System.out.println("2.- Mezclar cartas");
		System.out.println("3.- Salir");
		System.out.println("Tu eleccion");
		int opcion = input.nextInt();
		return opcion;

	}

}
