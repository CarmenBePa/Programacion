package ObjetoProtectora;

public class Gato {
	
	private int idGato;
	private int edad;
	private String raza;
	
	public Gato(int idGato, int edad, String raza) {
		this.idGato = idGato;
		this.edad = edad;
		this.raza = raza;
		
	}

	public int getIdGato() {
		return idGato;
	}

	public void setIdGato(int idGato) {
		this.idGato = idGato;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}
	
	

}
