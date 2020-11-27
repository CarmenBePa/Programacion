import java.util.Scanner;

public class busquedaArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

	}	
		public static int search(){
			int[] lista = new int [(int) (Math.random()*10-1)]; //{3,7,12,19,23,31,39,45,63,68};
			int c;
			int p = lista[0];
			int f = lista[lista.length-1];
			int x = 39;
					
			c = (p+f)/2;
		if (lista[c] == x) {
			return c;
			
		} else if (lista[c] < x)
				p= c+1;
			else
				f= c-1;
		 System.out.println(c);
		return x;
		}

	
		
		
}
