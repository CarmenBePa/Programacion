import java.util.Scanner;

public class fibonacci_con_metodo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.println("Calcularemos la serie Fibonacci a partir a paartir del numero que elijas: ");
		
		int n = input.nextInt();
		System.out.println("Tu termino es: " + fibonacci(n));
		
	}
	
		public static int fibonacci(int n) {
			int primero = 0;
			int segundo = 1;
						
			if (n==1) return 0;
			if (n==2) return 1;
			
			int tercero = 0;
			for (int i = 3; i <= n; i++) {
				
				tercero = primero + segundo;
				primero = segundo;
				segundo = tercero;
			}	
		return tercero;	
	} 
		

}
