package ObjetoProtectora;

public class Miembro {

	private int idMiembro;
	private String nombre;
	private int contrase�a;
	
	public Miembro(int idMiembro, String nombre, int contrase�a) {
		this.idMiembro = idMiembro;
		this.nombre = nombre;
		this.contrase�a = contrase�a;
		
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

	public int getContrase�a() {
		return contrase�a;
	}

	public void setContrase�a(int contrase�a) {
		this.contrase�a = contrase�a;
	}
	
	
	
}
