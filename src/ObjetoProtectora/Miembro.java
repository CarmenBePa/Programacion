package ObjetoProtectora;

public class Miembro {

	private int idMiembro;
	private String nombre;
	private int contraseña;
	
	public Miembro(int idMiembro, String nombre, int contraseña) {
		this.idMiembro = idMiembro;
		this.nombre = nombre;
		this.contraseña = contraseña;
		
	}

	public int getIdMiembro() {
		return idMiembro;
	}

	public void setIdMiembro(int idMiembro) {
		this.idMiembro = idMiembro;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getContraseña() {
		return contraseña;
	}

	public void setContraseña(int contraseña) {
		this.contraseña = contraseña;
	}
	
	
	
}
