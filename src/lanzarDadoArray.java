import java.util.Scanner;

public class lanzarDadoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		int[] contador = new int[6];

		contador = tiradaDado();

		System.out.println("En 100 tiradas de un dado, ¿cuantas veces salen cada numeros? ");
		for (int i = 0; i < contador.length; i++)
			System.out.println((i + 1) + " ---------> " + contador[i] + " veces.");

	}
	
	public static int[] tiradaDado() {
		int [] miarray = new int [6];
		
		for (int i = 1; i <= 100; i++) {
			int dado = (int) (Math.random() * 6) + 1;
			miarray[dado - 1] = miarray[dado - 1]+1;// Esto es lo que aumenta el contador que almacena las veces que ha salido un
									               // numero.
		}
		return miarray;
	}

	public static void printArray(int[] miarray) {
		
		for(int i=0; i<miarray.length; i++)
			System.out.println((i + 1) + "\t" + miarray[i] + "veces");
		
	}
	
}