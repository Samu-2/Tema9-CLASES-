package clases;

public class Particular {
private String nombre;
private String email;
private int edad;

public Particular() {
	
}
public Particular(String nombre, String email, int edad) {
	this.nombre=nombre;
	this.email=email;
	this.edad=edad;
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

public double seguro () {
	
	return 1000.0/edad;
	
}
}
