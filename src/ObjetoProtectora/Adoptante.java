package ObjetoProtectora;

public class Adoptante {

	private int idAdoptante;
	private String nombre;
	private int telefono;
	
	public Adoptante(int idAdoptante, String nombre, int telefono) {
		this.idAdoptante = idAdoptante;
		this.nombre = nombre;
		this.telefono = telefono;
		
	}

	public int getIdAdoptante() {
		return idAdoptante;
	}

	public void setIdAdoptante(int idAdoptante) {
		this.idAdoptante = idAdoptante;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	
	
}
