import java.util.Scanner;

public class Monedas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);

		System.out.println("Introducir cantidad total de dinero a contar: ");
		double cantidad = input.nextDouble();
		int total = (int)(cantidad);
		
		
		int euros2 = total / 200;
		 total = total % 200;
		
		int euros1 = total / 100;
		 total = total % 100;
		
		int cent50 = total / 50;
		 total = total % 50;
		
		int cent20 = total / 20;
		 total = total % 20;
		
		int cent10 = total / 10;
		 total = total % 10;
		
		int cent5 = total / 5;
		 total = total % 5;
		
		int cent2 = total / 2;
		 total = total % 2;
		
		int cent1 = total / 1;
		 total = total % 1;
		
		
		System.out.println("En " + cantidad + " centimos hay: ");
		System.out.println("");
		System.out.println( euros2 + " monedas de 2€");
		System.out.println( euros1 + " monedas de 1€");
		System.out.println( cent50 + " monedas de 50 centimos");
		System.out.println( cent20 + " monedas de 20 centimos");
		System.out.println( cent10 + " monedas de 10 centimos");
		System.out.println( cent5 + " monedas de 5 centimos");
		System.out.println( cent2 + " monedas de 2 centimos");
		System.out.println( cent1+ " monedas de 1 centimos");
	}

}
