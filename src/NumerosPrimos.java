import java.util.Scanner;

public class NumerosPrimos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.println("Vamos a calcular si un numero es primo o no. Introduce un numero: ");
		int numero = input.nextInt();
		int divisor = 2;
		

		while (divisor <= (numero/2) && (numero % divisor != 0)) 
			divisor++;
			
		

			if (numero % divisor == 0) 
				System.out.println("El numero " + numero + " no es primo ");
				
			else
			System.out.println("El numero " + numero + " es primo");	
	}

}
