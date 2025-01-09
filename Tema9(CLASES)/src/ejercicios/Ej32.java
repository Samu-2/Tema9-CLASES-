package ejercicios;

import java.util.Random;

import clases.Producto;

public class Ej32 {

	public static void main(String[] args) {
		Random r=new Random();
		
	for (int i = 1; i <= 10; i++) {
		double precio=Math.ceil(r.nextDouble(0.99, 15));
	String	nombre="petazetas"+i;
		Producto producto=new Producto(i,nombre,precio);
		System.out.println(producto);
		
	}

	}

}
