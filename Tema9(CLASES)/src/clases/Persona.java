package clases;

import java.time.LocalDate;

public class Persona {
	private String nombre;
	private LocalDate fechNac;
	private double altura;

	public Persona() {

	}

	public Persona(String nombre, LocalDate fechNac, double altura) {
		super();
		this.nombre = nombre;
		this.fechNac = fechNac;
		this.altura = altura;
	}

	public boolean cumpleAnios() {
		LocalDate hoy = LocalDate.now();
		if (fechNac.getMonth().equals(hoy.getMonth()) && fechNac.getDayOfMonth() == (hoy.getDayOfMonth())) {
			return true;

		} else {
			return false;
		}

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFechNac() {
		return fechNac;
	}

	public void setFechNac(LocalDate fechNac) {
		this.fechNac = fechNac;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

}
