
public class OrdenNumerico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1 = (int)(Math.random()*100);
		int num2 = (int)(Math.random()*100);
		int num3 = (int)(Math.random()*100);
		
		System.out.println("Vamos a ordenar de menor a mayor los siguientes numeros: " + num1 + " , " + num2 + " y " + num3 + ".");
		
		if (num1 < num2) 
			if (num3 < num1) 
				System.out.println("El orden seria: " + num3 + " , " + num1 + " , " + num2);
				else
					if (num3 < num2)
						System.out.println("El orden seria: " + num1 + " , " + num3 + " , " + num2);
				else
				System.out.println("El orden seria: " + num1 + " , " + num2 + " , " + num3);
						
		
		else 
			if (num3 < num2) 
				System.out.println("El orden seria: " + num3 + " , " + num2 + " , " + num1);
			else
				if(num3 < num1)
					System.out.println("El orden seria: " + num2 + " , " + num3 + " , " + num1);
				else
					System.out.println("El orden seria: " + num2 + " , " + num1 + " , " + num3);
		

	}

}
