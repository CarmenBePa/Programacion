import java.util.Scanner;

public class AprendeRestar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);		
		
		int num1 = (int)(Math.random()*10);
		int num2 = (int)(Math.random()*10);
		System.out.println("Los numeros seleccionados son: " + num1 + " y " + num2);
		
		//Hay que comprobar que el primero es mayor que el segundo. Y si es asi, ponerlos al reves.
		
		if (num2 < num1) {
			System.out.println("Vamos a aprender a Restar. ¿Cuanto es " + num1 + " - " + num2 + " ?" );
			int respuesta = input.nextInt();
			int solucion = (num1 - num2);
			
				if(respuesta == solucion)
					System.out.println("Enhorabuena, esa es la solucion correcta");
				else
					System.out.println("Vaya, has fallado. Prueba de nuevo.");
		}
		else
				if (num1 < num2)
					System.out.println("Vamos a aprender a Restar. ¿Cuanto es " + num2 + " - " + num1 + " ?" );
					int respuesta = input.nextInt();
					int solucion = (num2 - num1);
						
						if(respuesta == solucion)
							System.out.println("Enhorabuena, esa es la solucion correcta");
						else
							System.out.println("Vaya, has fallado. Prueba de nuevo.");
					
					
	}

}
