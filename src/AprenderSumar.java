import java.util.Scanner;

public class AprenderSumar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);

		int num1 = (int)(Math.random()*10);
		int num2 = (int)(Math.random()*10);
		
		System.out.println("Vamos a aprender a sumar. ¿Cuanto es " + num1 + " + " + num2 + "?");
		
		int respuesta = input.nextInt();
		int solucion = num1 + num2;
		
		boolean sol = (respuesta == solucion);
		System.out.println(num1 + " + " + num2 + " = " + respuesta + ". Tu respuesta es " + sol);
		
	}

}
