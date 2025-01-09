package clases;

import java.util.ArrayList;
import java.util.List;

public class Particular2 {
	private String nombre;
	private String email;
	private int edad;
	private List<String> listaTelefonos;
	
	
	public List<String> getListaTelefonos() {
		return listaTelefonos;
	}



	public void setListaTelefonos(List<String> listaTelefonos) {
		this.listaTelefonos = listaTelefonos;
	}



	public Particular2(String nombre, String email, int edad) {
		super();
		this.nombre = nombre;
		this.email = email;
		this.edad = edad;
		listaTelefonos=new ArrayList<String>();
	}
	
	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public void  addTelefono(String telefono) {
		listaTelefonos.add(telefono);
		
	}
	public double seguro() {

		return 1000.0 / edad;

	}



	@Override
	public String toString() {
		return "Particular2 [nombre=" + nombre + ", email=" + email + ", edad=" + edad + ", listaTelefonos="
				+ listaTelefonos + "]";
	}

}
