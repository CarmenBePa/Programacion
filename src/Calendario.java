import java.util.Scanner;

public class Calendario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.println("Introduce el año completo: ");
		int año = input.nextInt();
		int mes;
		
		do {
			System.out.println("Introduce un numero entre 1 y 12 para el mes:  ");
			mes = input.nextInt();
			
		}while (mes < 1 || mes > 12);
		System.out.println("\t\t\t\t" + NombreMes(mes) + "     " +  año );
		System.out.println();
		
		System.out.println("---------------------------------------------------------------------------------");
		System.out.println("Lunes   Martes   Miercoles   Jueves   Viernes   Sabado   Domingo");
		printMes(año, mes); 
		
		
	}
	
	public static void printMes (int año, int mes) {
		final int PRIMER_DIA = 3;
		int numeroDias = DiasEnMes(mes, año);
		int dias = TotalDias(año, mes);
		
		int primerDia = (dias + PRIMER_DIA) % 7;
	//System.out.println("\t");
		for (int espacio = 1; espacio < primerDia; espacio++)// Imprime espacios hasta el primer dia
			System.out.println("\t");
				
		
		for (int d = 1; d <= numeroDias; d++) {
			System.out.print(d + "\t");
			
			if((d + primerDia) % 7  == 0)
				System.out.println(" ");
						
				
		}
	}
	
	
	
	public static int TotalDias (int año, int mes) {
		final int AÑO = 1800;
		
		int TotalDias = 0;
		
		for (int y = AÑO; y < año; y++) //La "y" es el numero total de dias transcurridos hasta el año anterior al seleccionado
			if(AñoBisiesto(y))
				TotalDias += 366;
			else 
				TotalDias += 365;
		
		for (int j = 1; j < mes; j++ ) //La 'j' es el numero total de dias que han transcurrido a lo largo del año seleccionado, hasta llegar al mes que queremos.
			TotalDias += DiasEnMes(mes, año);
			
		return TotalDias;
		
	}
	
	
	
	public static int DiasEnMes (int mes, int año) {
		
		if (mes == 4 || mes == 6 || mes == 9 || mes == 11)
		      return 30;
		
		if (mes == 2)
			if (AñoBisiesto(año))
				return 29;
		else
			return 28;
		
		return 31;

	}
	
	
	
	public static boolean AñoBisiesto (int año) {
		if(año % 4 == 0 && año % 100 != 0 || año % 400 == 0)
			return true;
		return false;
	}
	

	
	public static String NombreMes (int m) {
		String mes = "";
		switch (m) {
			case 1: mes= "Enero"; break;
			case 2: mes= "Febrero"; break;
			case 3: mes= "Marzo"; break;
			case 4: mes= "Abril"; break;
			case 5: mes= "Mayo"; break;
			case 6: mes= "Junio"; break;
			case 7: mes= "julio"; break;
			case 8: mes= "Agosto"; break;
			case 9: mes= "Septiembre"; break;
			case 10: mes= "Octubre";break;
			case 11: mes= "Noviembre"; break;
			case 12: mes= "Diciembre"; break;
			
		} return mes;
		
		
		
		
		
		}

}
