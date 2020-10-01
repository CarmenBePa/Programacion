import java.util.Scanner;
public class TemperaturaFahrenheit {
   
	public static Scanner input = new Scanner (System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
     double celsius;
     double f;
     
     System.out.println("Introducir grados Fahrenheit: ");
      f = input.nextDouble();
       
      celsius = ( 5.0 / 9 ) * (f - 32);
    
      System.out.println("Los grados Fahrenheit " + f + " corresponderian a " + celsius + " grados celsius");
   
      
	}

}
