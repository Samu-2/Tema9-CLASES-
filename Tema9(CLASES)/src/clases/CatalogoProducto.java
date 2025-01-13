package clases;

import java.util.List;

public class CatalogoProducto {
	private List<Producto> listaProdcucto;
	private Producto producto;
	public List<Producto> getListaProdcucto() {
		return listaProdcucto;
	}
	public void setListaProdcucto(List<Producto> listaProdcucto) {
		this.listaProdcucto = listaProdcucto;
	}
	public Producto getProducto() {
		return producto;
	}
	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	@Override
	public String toString() {
		return "CatalogoProducto [listaProdcucto=" + listaProdcucto + ", producto=" + producto + "]";
	}
	
	
}
