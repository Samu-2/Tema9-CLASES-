package clases;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
//propiedades
	private LocalDate fecha;
	private List<Producto> listaProdcucto;
	private int gastosEnvio;
	private Persona2 persona;
	
	
	
	
	public Pedido() {
		super();
		listaProdcucto = new ArrayList<Producto>();
	}
	public Pedido(LocalDate fecha, List<Producto> listaProdcucto, int gastosEnvio, Persona2 persona) {
		super();
		this.fecha = fecha;
		this.listaProdcucto = listaProdcucto;
		this.gastosEnvio = gastosEnvio;
		this.persona = persona;
	}
	
	public void addProducto ( Producto codigo) {
		listaProdcucto.add(codigo);
		
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	public List<Producto> getListaProdcucto() {
		return listaProdcucto;
	}
	public void setListaProdcucto(List<Producto> listaProdcucto) {
		this.listaProdcucto = listaProdcucto;
	}
	public int getGastosEnvio() {
		return gastosEnvio;
	}
	public void setGastosEnvio(int gastosEnvio) {
		this.gastosEnvio = gastosEnvio;
	}
	public Persona2 getPersona() {
		return persona;
	}
	public void setPersona(Persona2 persona) {
		this.persona = persona;
	}
	
	public double precioPedido() {
		int valor =0;
		for (Producto producto : listaProdcucto) {
			valor+=producto.getPrecio();
		}
		return valor+gastosEnvio;
	}
	@Override
	public String toString() {
		return "pedido [fecha=" + fecha + ", listaProdcucto=" + listaProdcucto + ", gastosEnvio=" + gastosEnvio
				+ ", persona=" + persona + "]";
	}
	

}
