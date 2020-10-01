import java.util.Scanner;
public class SegundosAMinutos {

	public static Scanner input = new Scanner (System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int seg;
		int min;
		int resto;
		
		System.out.println("Introducir numero de segundos: ");
		seg = input.nextInt();
		
		min = seg/60;
		resto = seg%60;
		
		System.out.println("En " + seg + " segundos hay " + min + " minuto y sobran " + resto + " segundos");	
		
		int horas;
		int resto2;
		
		horas = min/60;
		resto2 = min%60;
		
		System.out.println("En " + min + " minutos hay " + horas + " horas y sobran " + resto2 + " minutos");
		
		int dia;
		int resto3;
		
		dia = horas/60;
		resto3 = horas%60;
		
		System.out.println("Y " + horas + " horas corresponden a " + dia + " dias y sobran " + resto3 + " horas.");
		
		System.out.println("En conclusion, " + seg + " segundos corresponderian a " + dia + " dias, " + horas + " horas, " + min + " minutos y sobrarian " + resto + " segundos.");	
		
	}

}
