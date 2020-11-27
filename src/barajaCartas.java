import java.util.Scanner;

public class barajaCartas {

	// Variables globales

	static int top = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		int[] baraja = newBaraja(40);
		int op;
		top = 0;
		do {
			op = menu();
			switch (op) {
			case 1:
				printDeck(baraja);
				break;
			case 2:
				mezclarCartas(baraja);
				break;
			case 3:
				int carta = dealCarta(baraja);
				if (carta != 0)
					System.out.println(cartaARepartir(carta));
				else {
					System.out.println("Mezclando la baraja. Vuelve a pedir carta.");
					top = 0;
					mezclarCartas(baraja);
				}

			}
		} while (op != 4);
		System.out.println("Chao!");

	}

	public static int dealCarta(int baraja[]) { // reparte la siguiente carta ò un 0 si ya no quedan cartas en el mazo
		if (top == baraja.length)
			return 0;
		return baraja[top++];
	}

	public static String cartaARepartir(int c) {
		return (getValorCarta(c) + " de " + getMezclar(c));
	}

	public static void printDeck(int[] baraja) { // al poner i=top, cuando muestras la baraja empezaara desde la ultima
													// carta que se ha repartido.Si no se ha repartido nada, pues se
													// muestra desde el principio
		for (int i = top; i < baraja.length; i++) {
			System.out.println(getValorCarta(baraja[i]) + " de " + getMezclar(baraja[i]));
		}
	}

	public static String getValorCarta(int c) {
		String[] cartas = { "Rey", "As", "2", "3", "4", "5", "6", "7", "Sota", "Caballo" };

		return cartas[c % 10];
	}

	public static String getMezclar(int n) {
		String[] mezclar = { "Oro", "Espadas", "Copas", "Bastos" };
		if (n % 10 == 0)
			return mezclar[n / 10 - 1];
		return mezclar[n / 10];
	}

	public static int[] newBaraja(int n) {
		int[] baraja = new int[n];
		for (int i = 0; i < n; i++)
			baraja[i] = i + 1;

		return baraja;

	}

	public static void mezclarCartas(int[] baraja) {
		for (int i = 0; i < baraja.length; i++) {
			int r = (int) (Math.random() * 40);
			int aux = baraja[i];
			baraja[i] = baraja[r];
			baraja[r] = aux;
		}

	}

	public static int menu() {
		int op = 0;
		Scanner input = new Scanner(System.in);
		System.out.println(" ------------------ ");
		System.out.println("MENU");
		System.out.println("1.- Mostrar carta");
		System.out.println("2.- Mezclar cartas");
		System.out.println("3.- Repartir carta");
		System.out.println("4.- Salir");
		System.out.println("Tu eleccion");
		System.out.println(" ------------------ ");
		int opcion = input.nextInt();
		return opcion;

	}

}
