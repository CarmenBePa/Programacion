import java.util.Scanner;
public class PasarNotas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		
		System.out.println("Introducir nota comprendida entre 0 y 10: ");
		double nota = input.nextDouble();
		
		if (nota < 0 || nota > 10) {
			System.out.println("Nota incorrecta. Por favor introduce una nota comprendida entre 0 y 10");
		
		}
		
		else
			if (nota >= 9.0)
			  System.out.println ("Tienes un Sobresaliente");
		  
			else if (nota >= 7.0)
			  System.out.println ("Tienes un Notable");
		  
			else if (nota >= 6.0)
			  System.out.println ("Tienes un Bien");
		  
			else if (nota >= 5.0)
			  System.out.println ("Tienes un Suficiente");
		  
			else if (nota >= 1.0)
			  System.out.println ("Tienes un Insuficiente");
		
	}

}
