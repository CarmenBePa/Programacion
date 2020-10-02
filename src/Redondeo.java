import java.util.Scanner;
public class Redondeo {

	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		
		System.out.println("Introduce el total de tu compra: ");
		double compra = input.nextDouble();
		
		double iva = compra * 0.20; // Se hace el claculo del IVA, que seria el 20/100=0.20
		
		double total = (int)((compra+iva)*100)/100.0; 
// Aqui se calcula el total de la compra con el IVA incluido. Se multiplica por 100 para correr la coma dos lados, 
// luego se transforma en un int (numero entero) y luego se divide entre 100.0 para consegiur el numero final.
		
		
		System.out.println("El precio total de la compra con el IVA incluido es: " + total);
		
	
	}

}
