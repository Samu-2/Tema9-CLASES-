package clases;

public class Persona2 {
private String DNI;
	private String nombre;
	private String apellidos;
	private int telefono;
	
	
	public Persona2() {
		super();
	}

	public Persona2(String dNI, String nombre, String apellidos, int telefono) {
		super();
		DNI = dNI;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.telefono = telefono;
	}

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Persona2 [DNI=" + DNI + ", nombre=" + nombre + ", apellidos=" + apellidos + ", telefono=" + telefono
				+ "]";
	}
	
}
