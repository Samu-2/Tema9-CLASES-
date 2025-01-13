package ejercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import clases.Persona2;
import clases.Producto;

public class Ej35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r=new Random();
		List<Producto> lista = new  ArrayList<Producto>();
	for (int i = 1; i <= 10; i++) {
		double precio=Math.ceil(r.nextDouble(0.99, 15));
	String	nombre="petazetas"+i;
		Producto producto=new Producto(i,nombre,precio);
		System.out.println(producto);
		lista.add(producto);
		
	}

	
	}

}
