import java.util.Scanner;

public class RestaBucleAnidado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int restas = 5;
		
		System.out.println("Vamos a hacer algunas restas. Intenta acertar todas las que puedas.");
		
		while (restas > 0) {
			restas--;
			int n1 = (int)(Math.random()*10);
			int n2 = (int)(Math.random()*10);
			
			if (n1<n2) {
				int aux = n1;
				n1 = n2;
				n2 = aux;
			}
				
			System.out.println("¿Cuanto es " + n1 + " - " + n2 + " ?");	
				int respuesta=input.nextInt();
				
		while (!(n1-n2 == respuesta)) {
			System.out.println("¡Vaya! Has fallado, intentalo de nuevo ¿Cuanto es " + n1 + " - " + n2 + " ?");
			respuesta = input.nextInt();
		}
		
				System.out.println("¡Correcto! Muy bien.");	
											
		}

	}
}

