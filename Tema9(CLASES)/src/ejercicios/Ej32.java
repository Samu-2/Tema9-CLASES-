package ejercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import clases.Producto;

public class Ej32 {

	public static void main(String[] args) {
		Random r=new Random();
		List<Producto> lista = new  ArrayList<Producto>();
	for (int i = 1; i <= 10; i++) {
		double precio=Math.ceil(r.nextDouble(0.99, 15));
	String	nombre="petazetas"+i;
		Producto producto=new Producto(i,nombre,precio);
		System.out.println(producto);
		lista.add(producto);
		
	}
	double valor=0;
	for (Producto producto : lista) {
		valor+=(producto.getPrecio());
		
	}
System.out.println(valor);
	}

}
