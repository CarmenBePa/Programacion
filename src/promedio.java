
public class promedio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			int[]numeros = generateArray(100);
			double promedio = promedio(numeros);
			int numerosConMayorPro = numerosConMayorPro(numeros,promedio);
			int[] numerosMayores =  generateArrayMayores(numeros,promedio);
			
			System.out.println(printArray(numeros));
			
			System.out.println("El promedio: "+ promedio +"     Cantidad de numeros mayores que el promedio: "+ numerosConMayorPro);
	        
			System.out.println(printArray(numerosMayores));
		
		}
		public static int[] generateArrayMayores(int numeros[],double pro) {
			int[] numeroMayor = new int[ numerosConMayorPro(numeros,pro)];
			int j=0;
			for (int i = 0;i<numeros.length;i++)
				if (numeros[i]>pro) numeroMayor[j++] = numeros[i];
			
			return numeroMayor;
		}
		public static String printArray(int n[]) {
			String report="";
			for (int i = 0;i<n.length;i++) {
				if (i%10==0) report +="\n";
				report +=n[i]+"\t";
				
			}
			
			return report;
		}
		public static String printArray(int n[],double pro) {
			String report="";
			for (int i = 0;i<n.length;i++) {
				report +=n[i]+"  ";
				if (i%10==0) report +="\n";
			}
			
			return report;
		}
		public static int numerosConMayorPro(int[] numeros, double pro) {
			int n=0;
			for (int i = 0;i<numeros.length;i++)
				if(numeros[i]>pro) n++;
			
			return n;
		}
		public static int[] generateArray(int n) {
			int[] numeros = new int[n];
			for (int i = 0;i<n;i++)
				numeros[i] = (int) (Math.random()*11);
			
			return numeros;
		}

		public static double promedio(int[] numeros) {
			double av=0;
			for (int i = 0;i<numeros.length;i++)
				av+=numeros[i];
			
			return av/numeros.length;
		}

	
		
	}


