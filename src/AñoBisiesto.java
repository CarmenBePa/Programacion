import java.util.Scanner;

public class AñoBisiesto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in); 

		System.out.println("Vamos a comprobar si un año es bisiesto o no. Introduce un año: ");
		int año = input.nextInt();
		
		if ((año % 4 == 0 && año % 100 != 0) || año % 400 == 0)
			System.out.println("El año " + año + " SI es bisiesto");
		else
			System.out.println("El año " + año + " NO es bisiesto");

	}

}
