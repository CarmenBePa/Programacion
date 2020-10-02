import java.util.Scanner;
public class Redondeo {

	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		
		System.out.println("Introduce el total de tu compra: ");
		double compra = input.nextDouble();
		
		double iva = compra * 0.20;
		
		double total = (int)((compra+iva)*100)/100.0;
		
		
		System.out.println("El precio total de la compra con el IVA incluido es: " + total);
		
		
	}

}
