
public class contraseña {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String p = randomContraseña();
		System.out.println(p);
		
	}
	
	public static String randomContraseña() {
		String p = "";
		
		for (int i = 1; i <= 10; i++) {
			int r= (int)(Math.random()*3);
			
			char c;
			switch (r) {
				case 0: c = randomChar('0','9'); break;
				case 1: c = randomChar('a','z'); break;
				default: c = randomChar('A','Z'); break; // el default se usa cuando no se inicializa alguna variable. 
														 // en este caso, la variable 'c' no esta inicializada.
			}
			p += c;
		}
		return p;
		
	}

	public static char randomChar(char comienzo, char fin) {
		return (char) (comienzo + (int)(Math.random() * (fin - comienzo)));
	}
	
}
