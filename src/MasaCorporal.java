import java.util.Scanner;

public class MasaCorporal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		
		System.out.println("Vamos a calcular el indice de la masa corporal.");
		
		System.out.println("Introducir peso en Kilos: ");
		double peso = input.nextDouble();
		
		System.out.println("Introducir altura en metros: ");
		double altura = input.nextDouble();
		
		
		//int pesoFinal = (int)(peso*10);
		//int alturaFinal = (int)(altura*10);
		
		double indice = peso / Math.pow(altura,2);
		
		System.out.println("Tu indice de masa corportal es: " + indice );
			if(indice < 18.5)
				System.out.println("Tu peso esta por debajo de lo normal");
			else if (indice >= 18.5 && indice < 25.0)
				System.out.println("Tienes un peso dentro de la media");
			//else if (indice >= 25.0 && indice < 30.0)
				//System.out.println("Tienes sobrepeso");
			else if (indice >= 30.0)
				System.out.println("Tienes obesidad");
		
		
	}

}
