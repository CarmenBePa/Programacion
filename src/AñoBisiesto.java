import java.util.Scanner;

public class A�oBisiesto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in); 

		System.out.println("Vamos a comprobar si un a�o es bisiesto o no. Introduce un a�o: ");
		int a�o = input.nextInt();
		
		if ((a�o % 4 == 0 && a�o % 100 != 0) || a�o % 400 == 0)
			System.out.println("El a�o " + a�o + " SI es bisiesto");
		else
			System.out.println("El a�o " + a�o + " NO es bisiesto");

	}

}
