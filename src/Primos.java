
public class Primos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Vamos a mostrar los 50 primero numeros primos.");

		int contador = 0;
		int numero = 0;
		String espacio = "";

		while (contador < 50) {
			numero++;
			int divisor = 2;

			while (divisor < (numero / 2) && (numero % divisor != 0))
				divisor++;

			if (numero % divisor != 0 || numero == 2) {
				espacio += "\t" + numero;
				contador++;

				if (contador % 10 == 0)
					espacio += "\n";
			}
			

		}
		
		System.out.print(espacio);
	}

}
