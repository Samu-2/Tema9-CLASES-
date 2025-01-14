package clases;

public class Empleado {
private int idEmpleado;
private String nombre;
private double sueldo;
private double comision;



public Empleado() {
	super();
}
public Empleado(int idEmpleado, String nombre, double sueldo) {
	super();
	this.idEmpleado = idEmpleado;
	this.nombre = nombre;
	this.sueldo = sueldo;
}
public int getIdEmpleado() {
	return idEmpleado;
}
public void setIdEmpleado(int idEmpleado) {
	this.idEmpleado = idEmpleado;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public double getSueldo() {
	return sueldo;
}
public void setSueldo(double sueldo) {
	this.sueldo = sueldo;
}
public double getComision() {
	return comision;
}
public void setComision(double comision) {
	this.comision = comision;
}

public void calcularComision () {
	if (sueldo>1000) {
		comision=10/100;
	}else {
		comision=5/100;
	}
}
@Override
public String toString() {
	return "empleado [idEmpleado=" + idEmpleado + ", nombre=" + nombre + ", sueldo=" + sueldo + ", comision=" + comision
			+ "]";
}



}
