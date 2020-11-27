import java.util.Scanner;

public class contadorLetras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		int[] letras =new int[26]; 
		
		System.out.println("Introduce una frase: ");
		String frase = input.nextLine().toUpperCase();
		
		
		for (int i = 0; i<frase.length(); i++) {
			char c = frase.charAt(i);
			if (c >= 'A' && c <= 'Z')
				letras[c-'A']++;
		
		}
		System.out.println(printAray(letras));
	}
	
	public static String printAray (int[] elem) {
		String report = "";
		for (int i = 0; i < elem.length; i++) {
			char c = (char)(i+'A');
			report += " letra " + c + " : " + elem[i] + " veces \t";
			if (i%5 == 0) report += "\n";
			
		}
		return report;
	}
}
