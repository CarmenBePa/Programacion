import java.util.Scanner;

public class Media {

	public static Scanner input = new Scanner (System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double num1;
		double num2;
		double num3;
		
		System.out.print("Introduce un valor para el primer numero: ");
		 num1 = input.nextDouble();
		
		System.out.print("Introduce un valor para el segundo numero: ");
		num2 = input.nextDouble();
		
		System.out.print("Introduce un valor para el tercer numero: ");
		num3 = input.nextDouble();
		
		double media = (num1+num2+num3)/3;
		
		System.out.print("La media de " + num1 + "," + num2 + "," + num3 + " es " + media);

		
	}

}
