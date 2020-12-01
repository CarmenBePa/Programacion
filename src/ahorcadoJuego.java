import java.util.Scanner;

public class ahorcadoJuego {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		int opcion = 0;

		String palabra = palabraSecreta();
		int fallos = 6;

		do {
			opcion = menu();
			switch (opcion) {

			case 1:
				char[] mascara = guiones(palabra); // palabraGuiones
				boolean fin = false;

				do {
					// System.out.println(palabra); // esto muestra la palabra que es. Acuerdate de
					// quitarlo

					System.out.println("Vidas restantes: " + fallos);
					System.out.println("Introduce una letra: ");
					System.out.println("                                 ");
					System.out.println(mascara);

					char introducirLetra = input.next().charAt(0); // Esto lee la posicion de la letra que se introduce

					boolean letraAcertada = false; // Se usara para el contador de fallos, para que te cuente solo las
													// letras que no estan, y no cada letra que introduces

					// ahora se recorrera la palabra para ver si la letra introducida esta en la
					// palabra o no
					for (int i = 0; i < palabra.length(); i++) {
						if (palabra.charAt(i) == introducirLetra) {
							mascara[i] = introducirLetra;
							letraAcertada = true;

						}
					}
					// Esto cuenta los fallos cuando metes una letra que no esta.
					if (!letraAcertada && fallos > 0) {
						imprimirCuerpo(fallos);
						fallos--;
					}
					if (palabra.equals(mascaraString(mascara)))
						fin = true; // compara la mascara de guiones con la palabra secreta
					if (fallos == 0)
						fin = true;

				} while (!fin);
				if (fallos == 0) {
					System.out.println("¡Vaya! Has agotado las vidas, has perdido. Intentalo de nuevo");
				} else {
					System.out.println("¡Enhorabuena! La palabra oculta era " + palabra + "¡¡Has ganado!!");
				}

				break;
			}

		} while (opcion != 2);
		System.out.println("¡Ven a jugar de nuevo! Hasta pronto");
	}

	public static String palabraSecreta() {
		String[] diccionario = { "paracaidas", "casa", "perro", "lago", "ordenador", "arena", "marea", "bronceado" };
		String palabra = diccionario[(int) (Math.random() * diccionario.length) * 10 / 10];

		return palabra;
	}

	public static char[] guiones(String palabra) { // intercambiara la palabra por los guiones
		int letrasPorGuion = palabra.length();
		char[] mascara = new char[letrasPorGuion];
		for (int i = 0; i < mascara.length; i++) {
			mascara[i] = '-';
		}
		return mascara;
	}

	public static String mascaraString(char[] x) {
		String mascaraString = "";
		for (int i = 0; i < x.length; i++) {
			mascaraString += x[i];
		}
		return mascaraString;
	}

	public static int menu() {

		Scanner input = new Scanner(System.in);
		System.out.println("_______________________");
		System.out.println("                         ______          ");
		System.out.println("Juego del ahorcado      ||     |         ");
		System.out.println("                        ||     O         ");
		System.out.println("1.- Jugar en Español    ||    /|\\       ");
		System.out.println("2.- Salir               ||    / \\       ");
		System.out.println("Tu eleccion             ||_________      ");
		System.out.println("                        ||        ||     ");
		System.out.println("_______________________");
		int opcion = input.nextInt();
		return opcion;

	}

	public static void imprimirCuerpo(int f) {
		switch (f) {
		case 6:
			System.out.println(" ___________.._______           ");
			System.out.println("| .__________))______|          ");
			System.out.println("| | / /      ||                 ");
			System.out.println("| |/ /       ||                 ");
			System.out.println("| | /        ||                 ");
			System.out.println("| |/      --------              ");
			System.out.println("| |      |  ·   ·  |            ");
			System.out.println("| |      |  -._.-  |            ");
			System.out.println("| |        --------             ");
			System.out.println("| |                             ");
			System.out.println("| |                             ");
			System.out.println("| |                             ");
			System.out.println("| |                             ");
			System.out.println("| |                             ");
			System.out.println("| |                             ");
			System.out.println("| |                             ");
			System.out.println("| |                             ");
			System.out.println("| |__________________________   ");
			System.out.println("|-|_______________________|-|   ");
			System.out.println("| |                       | |   ");
			System.out.println("| |                       | |   ");
			System.out.println("| |                       | |   ");
			System.out.println("| |                       | |   ");
			System.out.println("| |                       | |   ");
			break;
		case 5:
			System.out.println(" ___________.._______           ");
			System.out.println("| .__________))______|          ");
			System.out.println("| | / /      ||                 ");
			System.out.println("| |/ /       ||                 ");
			System.out.println("| | /        ||                 ");
			System.out.println("| |/      --------              ");
			System.out.println("| |      |  ·   ·  |            ");
			System.out.println("| |      |   -_-   |            ");
			System.out.println("| |        --------             ");
			System.out.println("| |          | |                ");
			System.out.println("| |       /Y     Y\\            ");
			System.out.println("| |         |   |               ");
			System.out.println("| |         |   |               ");
			System.out.println("| |         |   |               ");
			System.out.println("| |                             ");
			System.out.println("| |                             ");
			System.out.println("| |                             ");
			System.out.println("| |                             ");
			System.out.println("| |__________________________   ");
			System.out.println("|-|_______________________|-|   ");
			System.out.println("| |                       | |   ");
			System.out.println("| |                       | |   ");
			System.out.println("| |                       | |   ");
			System.out.println("| |                       | |   ");
			System.out.println("| |                       | |   ");
			break;
		case 4:
			System.out.println(" ___________.._______           ");
			System.out.println("| .__________))______|          ");
			System.out.println("| | / /      ||                 ");
			System.out.println("| |/ /       ||                 ");
			System.out.println("| | /        ||                 ");
			System.out.println("| |/      ---------             ");
			System.out.println("| |      |  ·   ·  | 	        ");
			System.out.println("| |      |    -    |            ");
			System.out.println("| |       ---------             ");
			System.out.println("| |         | |                 ");
			System.out.println("| |      /Y     Y\\             ");
			System.out.println("| |        |   | \\\\           ");
			System.out.println("| |        |   |  \\\\          ");
			System.out.println("| |        |   |    ()          ");
			System.out.println("| |                             ");
			System.out.println("| |                             ");
			System.out.println("| |                             ");
			System.out.println("| |                             ");
			System.out.println("| |                             ");
			System.out.println("| |__________________________   ");
			System.out.println("|-|_______________________|-|   ");
			System.out.println("| |                       | |   ");
			System.out.println("| |                       | |   ");
			System.out.println("| |                       | |   ");
			System.out.println("| |                       | |   ");
			System.out.println("| |                       | |   ");
			break;
		case 3:
			System.out.println(" ___________.._______           ");
			System.out.println("| .__________))______|          ");
			System.out.println("| | / /      ||                 ");
			System.out.println("| |/ /       ||                 ");
			System.out.println("| | /        ||                 ");
			System.out.println("| |/      ---------             ");
			System.out.println("| |      |  ·   ·  |            ");
			System.out.println("| |      |    O    |            ");
			System.out.println("| |       ---------             ");
			System.out.println("| |         | |                 ");
			System.out.println("| |      /Y     Y\\             ");
			System.out.println("| |     // |   | \\\\           ");
			System.out.println("| |    //  |   |  \\\\          ");
			System.out.println("| |    ()  |   |    ()          ");
			System.out.println("| |                             ");
			System.out.println("| |                             ");
			System.out.println("| |                             ");
			System.out.println("| |                             ");
			System.out.println("| |                             ");
			System.out.println("| |__________________________   ");
			System.out.println("|-|_______________________|-|   ");
			System.out.println("| |                       | |   ");
			System.out.println("| |                       | |   ");
			System.out.println("| |                       | |   ");
			System.out.println("| |                       | |   ");
			System.out.println("| |                       | |   ");
			break;
		case 2:
			System.out.println(" ___________.._______           ");
			System.out.println("| .__________))______|          ");
			System.out.println("| | / /      ||                 ");
			System.out.println("| |/ /       ||                 ");
			System.out.println("| | /        ||                 ");
			System.out.println("| |/      --------              ");
			System.out.println("| |      |  T  T  |             ");
			System.out.println("| |      |   __   |             ");
			System.out.println("| |       --------              ");
			System.out.println("| |         | |                 ");
			System.out.println("| |      /Y     Y\\             ");
			System.out.println("| |     // |   | \\\\           ");
			System.out.println("| |    //  |   |  \\\\          ");
			System.out.println("| |    ()  |   |    ()          ");
			System.out.println("| |        ||                   ");
			System.out.println("| |        ||                   ");
			System.out.println("| |        ||                   ");
			System.out.println("| |       / |                   ");
			System.out.println("| |__________________________   ");
			System.out.println("|-|_______________________|-|   ");
			System.out.println("| |                       | |   ");
			System.out.println("| |                       | |   ");
			System.out.println("| |                       | |   ");
			System.out.println("| |                       | |   ");
			System.out.println("| |                       | |   ");
			break;
		case 1:
			System.out.println(" ___________.._______         ");
			System.out.println("| .__________))______|        ");
			System.out.println("| | / /      ||               ");
			System.out.println("| |/ /       ||               ");
			System.out.println("| | /        ||               ");
			System.out.println("| |/      --------            ");
			System.out.println("| |      |  X  X  |   	      ");
			System.out.println("| |      |   __   |           ");
			System.out.println("| |       --------            ");
			System.out.println("| |         | |               ");
			System.out.println("| |      /Y     Y\\           ");
			System.out.println("| |     // |   | \\\\         ");
			System.out.println("| |    //  |   |  \\\\        ");
			System.out.println("| |    ()  |   |    ()        ");
			System.out.println("| |        || ||              ");
			System.out.println("| |        || ||              ");
			System.out.println("| |        || ||              ");
			System.out.println("| |       / | | \\            ");
			System.out.println("| |                           ");
			System.out.println("| |______          __________ ");
			System.out.println("|-|______          _______|-| ");
			System.out.println("| |       \\   \\         | | ");
			System.out.println("| |        \\   \\        | | ");
			System.out.println("| |         \\   \\       | | ");
			System.out.println("| |                       | | ");
			System.out.println("| |                       | | ");
			break;

		}
	}

}
