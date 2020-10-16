import java.util.Scanner;

public class Ecuacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in); 
		
		System.out.println("Vamos a calcular las soluciones de una ecuacion de segundo grado.");
		System.out.println("Introduce un valor para el primer termino: ");
		int a = input.nextInt();
		System.out.println("Introduce un valor para el segundo termino: ");
		int b = input.nextInt();
		System.out.println("Introduce un valor para el tercer termino: ");
		int c = input.nextInt();
		
		double res = Math.pow(b, 2) - 4 * a * c;
		
		if (res < 0) {
			System.out.println("La ecuacion no tiene solucion");
		}
		else if (res == 0) {
			System.out.println("La ecuacion tiene una unica solucion: " + (-b/(2*a)));
		}
		else {
			double x1 = (-b) + (Math.sqrt(res)/(2*a));
			double x2 = (-b) - (Math.sqrt(res)/(2*a));
			System.out.println("La ecuacion tiene dos soluciones. x="+x1 + " y x="+x2 );
		}
		
		
	}

}
