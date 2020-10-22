import java.util.Scanner;

public class AdivinaNumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		int aleatorio = (int)(Math.random()*101);
		int intentos = 1;
		
		System.out.println("El Pc ha generado un nuemro aleatorio entre 0 y 100. Adivina cual es: ");
		int user = input.nextInt();
		
			while (user != aleatorio) {
				
				if (user < aleatorio) {
					System.out.println("El numero del PC es mayor. Elige un numero mas alto.");
					user = input.nextInt();	
				    }
				
				else if (user > aleatorio) {
				System.out.println("El numero del PC es menor. Elige un numero mas bajo");
				user = input.nextInt();
				}
				
			 intentos++;
			}
		 
			System.out.println("¡Bien! Lo has acertado. Lo has intentado " + intentos + " veces.");
		
	}

}
