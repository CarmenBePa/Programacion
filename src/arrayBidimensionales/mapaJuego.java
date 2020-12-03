package arrayBidimensionales;
import java.util.Scanner;

public class mapaJuego {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.println("¡Juego nuevo!");
		System.out.println("Introduce la dimension del mapa: ");
		int dimension = input.nextInt();  // esto determinara la dimension del mapa.
		
		int[][] mapa = crearMapa(dimension);
		
		System.out.println(mapaString(mapa));
		
		
	}
	
	public static int[][] crearMapa (int d){
		int[][] mapa = new int[d][d];
		for(int f=0; f<mapa.length; f++)
			for(int c=0; c<mapa.length; c++)
				if(f == 0 || c == 0 || f == d-1 || c == d-1)
					mapa[f][c] = 1;
				else
					mapa[f][c] = 0;
		return mapa;
		
	}
	
	public static String mapaString (int[][] mapa){  //Esto te lo combiente e un string para visualizarlo
		String mapaString = "";
		for(int f=0; f<mapa.length; f++) {
		 mapaString += "\n";
			for(int c=0; c<mapa.length; c++)
				mapaString += " " + mapa[f][c];
		}
		return mapaString;
	}
	
	// para acabar el juego, hay que llegar a una posicion ganadora, que se decidira automaticamente.
	
	public static int[][] jugador (int[][] j) {
		int pj = 5;
		int posicion = dimension/2;
		for (int f = 0; f<posicion; f++)
			for(int c = 0; c<posicion; c++)

		
		return null;
	}
	
	
	
	
	
	
	
	
}
