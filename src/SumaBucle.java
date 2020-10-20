import java.util.Scanner;

public class SumaBucle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		int num1 = (int) (Math.random() * 10);
		int num2 = (int) (Math.random() * 10);
		int fallos = 1;

		System.out.println("Vamos a aprender a sumar. ¿Cuanto es " + num1 + " + " + num2 + "?");

		int respuesta = input.nextInt();
		int solucion = num1 + num2;

		while (solucion != respuesta) {
			System.out.println("¡Vaya has fallado!. Intentalo de nuevo, ¿Cuanto es " + num1 + " + " + num2 + "?");
			respuesta = input.nextInt();

			fallos++;
		}

		System.out.println("¡Enhorabuena! Has acertado. Has fallado " + fallos + " veces");

	}

}