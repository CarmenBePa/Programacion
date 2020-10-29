import java.util.Scanner;

public class ConvertirEnHexadecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.println("Vamos a transformar un numero decimal a hexadecimal. Introduce un numero decimal: ");
		int num = input.nextInt();
		String hex = "";

		while (num != 0) {
			int resto = num % 16;

			char numhex;

			if (0 <= resto && resto <= 9) {
				numhex = (char) (resto + '0');

			} else
				numhex = (char) (resto - 10 + 'A');
			hex = numhex + hex;
			num = num/16;

		}

		System.out.println("El numero hexadecimal es " + hex);
	}

}
