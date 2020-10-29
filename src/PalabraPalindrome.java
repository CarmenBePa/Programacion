import java.util.Scanner;

public class PalabraPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.println("Introduce una palabra, vamos a ver si es palindrome o no: ");
		String palabra = input.nextLine();
		
		int primero = 0;
		int ultimo = palabra.length() - 1;
		
		while (palabra.charAt(primero) == palabra.charAt(ultimo) && primero <=ultimo) {
			primero++;
			ultimo--;
			
		}
		
		if (primero > ultimo)
			System.out.println("Esa si es una palabra palindrome");
		else
			System.out.println("Esa no es una palabra palindrome");

	}

}
