import java.util.Scanner;

public class Loteria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in); 
		
		int loteria = (int)(Math.random()*100);
		System.out.println(loteria);
		
		System.out.println("Introduce un numero de dos digitos para tu loteria: ");
		int usuario = input.nextInt();
		
		int loteria1 = loteria/10;
		int loteria2 = loteria%10;
		
		int numero1 = usuario / 10;
		int numero2 = usuario % 10;
		
		
		if (loteria == usuario)
			System.out.println("¡Enhorabuena!. Has ganado el PRIMER premio de 10.000€!!");
		
		else if (loteria1 == numero2 && loteria2 == numero1)
			System.out.println("¡Enhorabuena!. Has ganado el SEGUNDO premio de 3.000€!!");
		else if (loteria1 == numero1 || loteria1 == numero2 || loteria2 == numero1 || loteria2 == numero2)
			System.out.println("¡Enhorabuena!. Has ganado el TERCER premio de 1.000€!!");
		else
			System.out.println("Lo siento, no has tenido suerte. Prueba de nuevo");
		
		
	}

}
