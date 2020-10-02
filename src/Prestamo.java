import java.util.Scanner;
public class Prestamo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		
		System.out.println("Introducir importe solicitado: ");
		double prestamo = input.nextDouble();
		
		System.out.println("Introducir el interes anual: ");
		double interesAnual = input.nextDouble();
		
		System.out.println("Introducir años a pagar: ");
		int años = input.nextInt();
		
		double interesMensual = interesAnual/1200;
		
		
		double deuda = prestamo * interesMensual /(1- 1 / Math.pow(1 + interesMensual, años*12));
		double totalDeuda = (int)(deuda*100)/100.0;
		
		System.out.println(" Ha de pagar " + totalDeuda + " € al mes");
		

	}

}
