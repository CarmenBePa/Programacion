import java.util.Scanner;

public class ahorcadoJuego {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		int opcion = 0;

		String palabra = palabraSecreta();
		String palabraIngles = palabraSecretaIngles();
		int fallos = 6;

		do {
			opcion = menu();
			switch (opcion) {

			case 1:
				char[] mascara = guiones(palabra); // palabraGuiones
				boolean fin = false;

				do {
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
					System.out.println("¡Enhorabuena! La palabra oculta era " + palabra + " ¡¡Has ganado!!");
				}

				break;

			case 2:
				char[] mascaraIngles = guionesIngles(palabraIngles);
				boolean fin2 = false;

				do {
					System.out.println("Lives : " + fallos);
					System.out.println("Enter a letter: ");
					System.out.println("                                 ");
					System.out.println(mascaraIngles);

					char introducirLetra = input.next().charAt(0);

					boolean letraAcertada = false;
					for (int i = 0; i < palabraIngles.length(); i++) {
						if (palabraIngles.charAt(i) == introducirLetra) {
							mascaraIngles[i] = introducirLetra;
							letraAcertada = true;

						}
					}

					if (!letraAcertada && fallos > 0) {
						imprimirCuerpo(fallos);
						fallos--;
					}
					if (palabraIngles.equals(mascaraStringIngles(mascaraIngles)))
						fin2 = true;
					if (fallos == 0)
						fin2 = true;

				} while (!fin2);
				if (fallos == 0) {
					System.out.println("¡Whoops You lose! You have used all the lives. Try again");
				} else {
					System.out.println("!Congratulations! The hidden word was " + palabraIngles + "¡¡You win!!");
				}

				break;

			}

		} while (opcion != 3);
		System.out.println("¡Ven a jugar de nuevo! Hasta pronto");
		System.out.println("¡Come play again!. See you later");
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

	public static String mascaraString(char[] e) {
		String mascaraString = "";
		for (int i = 0; i < e.length; i++) {
			mascaraString += e[i];
		}
		return mascaraString;
	}

	
	
	
	public static String palabraSecretaIngles() {
		String[] diccionarioIngles = { "breakfast", "house", "dog", "lake", "computer", "sand", "tide", "speakers" };
		String palabraIngles = diccionarioIngles[(int) (Math.random() * diccionarioIngles.length) * 10 / 10];

		return palabraIngles;
	}

	public static char[] guionesIngles(String palabra) { 
		int letrasPorGuion = palabra.length();
		char[] mascaraIngles = new char[letrasPorGuion];
		for (int i = 0; i < mascaraIngles.length; i++) {
			mascaraIngles[i] = '-';
		}
		return mascaraIngles;
	}

	public static String mascaraStringIngles(char[] ingles) {
		String mascaraStringIngles = "";
		for (int i = 0; i < ingles.length; i++) {
			mascaraStringIngles += ingles[i];
		}
		return mascaraStringIngles;
	}

	
	
	
	public static int menu() {

		Scanner input = new Scanner(System.in);
		System.out.println("_______________________");
		System.out.println("                         ______          ");
		System.out.println("Juego del ahorcado      ||     |         ");
		System.out.println("                        ||     O         ");
		System.out.println("1.- Jugar en Español    ||    /|\\       ");
		System.out.println("2.- Jugar en Ingles     ||    / \\       ");
		System.out.println("3.- Salir               ||_________      ");
		System.out.println(" Tu eleccion            ||        ||     ");
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
