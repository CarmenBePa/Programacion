import java.util.Scanner;

public class Divisibilidad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in); 
		
		
		System.out.println("Comprobacion de divisibilidad. Introduzca un numero entero.");
		int numero =  input.nextInt();
		
		int div2 = numero % 2;
		int div3 = numero % 3;
		
		
		if (div2 == 0) {
			System.out.println("El numero " + numero + " es divisible entre 2");
		}	
		else		
			System.out.println("El nmero " + numero + " no es divisible entre 2");
		
		
		
		if (div3 == 0) {
			System.out.println("El numero " + numero + " es divisible entre 3");
		}
		else		 
			System.out.println("El numero " + numero + " no es divisible entre 3");
		
	
	}

}
