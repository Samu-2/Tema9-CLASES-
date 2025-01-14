package clases;

import java.util.List;

public class Tienda {
	private String nombre;
	private String direccion;
	private List<Empleado> listaEmpleados;

	public Tienda() {
		super();
	}

	public Tienda(String nombre, String direccion, List<Empleado> listaEmpleados) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.listaEmpleados = listaEmpleados;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public List<Empleado> getListaEmpleados() {
		return listaEmpleados;
	}

	public void setListaEmpleados(List<Empleado> listaEmpleados) {
		this.listaEmpleados = listaEmpleados;
	}

	public void addEmpleado(Empleado empleado) {
		listaEmpleados.add(empleado);
	}

	public double pagoMensual() {
		double pagoMensual = 0;
		for (Empleado empl : listaEmpleados) {

			pagoMensual = empl.getSueldo() + empl.getComision() * empl.getSueldo();
		}
		return pagoMensual;

	}
	

	@Override
	public String toString() {
		return "tienda [nombre=" + nombre + ", direccion=" + direccion + ", listaEmpleados=" + listaEmpleados + "]";
	}
}
