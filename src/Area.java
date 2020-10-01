import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 	double radio;
		    double area;
		    
		    
		    System.out.print("Introduce un valor: ");
		    Scanner input = new Scanner(System.in);

		    radio = input.nextDouble();
		    
		    area= radio*radio*3.14159;
		     
		    System.out.println("El area resultante de un circulo con radio " + radio + " es " + area);
		   
		    

		    
	}

}
