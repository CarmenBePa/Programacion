import java.util.Scanner;

public class Monedas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);

		System.out.println("Introducir cantidad total de dinero a contar: ");
		double cantidad = input.nextDouble();
		int total = (int)(cantidad*100);
		
		
		int euros2 = total / 200;
		int restEuros2 = euros2 % 200;
		
		int euros1 = restEuros2 / 100;
		int restEuros1 = restEuros2 % 100;
		
		int cent50 = restEuros1 / 50;
		int restCent50 = restEuros1 % 50;
		
		int cent20 = restCent50 / 20;
		int restCent20 = restCent50 % 20;
		
		int cent10 = restCent20 / 10;
		int restCent10 = restCent20 % 10;
		
		int cent5 = restCent10 / 5;
		int restCent5 = restCent10 % 5;
		
		int cent2 = restCent5 / 2;
		int restCent2 = restCent5 % 2;
		
		int cent1 = restCent2 / 1;
		int restCent1 = restCent2 % 1;
		
		
		System.out.println("En " + total + " centimos hay: ");
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
