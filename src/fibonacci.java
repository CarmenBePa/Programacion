import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		int num = 0; // primer termino de la serie fibonacci
		int num2 = 1; // segundo termino de la serie fibonacci
		System.out.println("Calcularemos la serie Fibonacci a partir a paartir del numero que elijas: ");
		int n = input.nextInt(); // numero de veces que quieres que se repita la suma

		for (int i = 1; i <= n; i++) {

			int suma = num + num2; // suma consecutiva de los numeros
			num = num2; // cambiamos el primer numero por el segundo, para asi sobrecargarlo
			num2 = suma; // cambiamos el segundo numero por el resultado de la suma, para de esa manera
							// seguir sumando hasta que "i" sea igual que el termino "n" introducido, es
							// decir, hasta que el numero de sumas que se realicen sea igual al numero
							// introducido por teclado.

			System.out.print("\t" + suma); // muestra el resultado de las sumas consecutivas
		}

	}

} 
