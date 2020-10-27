import java.util.Scanner;

public class MaxComunDiv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.println("Vamos a calcular el Maximo Comun Divisor de 2 numeros.");
		System.out.println("Introduce el primer numero: ");
		int n1 = input.nextInt();
		System.out.println("Introduce el segundo numero: ");
		int n2 = input.nextInt();

		int divisor;
		if (n1 < n2) { // int d = n1<n2 ? n1:n2 -> Esto quiere decir que si "n1" es mas pequeño que "n2"(se usa ?) 
					   // se usa como "d" el n1. Si no se usa el "n2"(para eso se usa los dos puntos ":")
			divisor = n1;
		} else
			divisor = n2;
		
// mientras que el resto de dividir "n1" entre el divisor sea diferente de 0  ó  el resto de dividir "n2" 
// entre "divisor" sea diferente de 0, el divisor decrementa en 1. Esto sera asi hasta que se encuentre un
// numero cuyo resto sea 0;
		
		while (n1 % divisor != 0 || n2 % divisor != 0) 
			divisor--;
		
		System.out.println("El MCD de " + n1 + " y " + n2 + " es " + divisor);
		

	}

}
