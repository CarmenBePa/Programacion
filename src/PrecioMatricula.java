import java.util.Scanner;

public class PrecioMatricula {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		double matricula = 10000;
		int año = 0;
		
		while (matricula<20000) {
			matricula = (matricula * 1.07);
			año++;
		}
		
		System.out.println("La matricula costrara el doble en " + año + " años.");
		
		
	}

}
