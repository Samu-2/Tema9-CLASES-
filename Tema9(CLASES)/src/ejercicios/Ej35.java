package ejercicios;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import clases.Pedido;
import clases.Persona2;
import clases.Producto;

public class Ej35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		Producto producto = new Producto();
		List<Producto> lista = new ArrayList<Producto>();
		for (int i = 1; i <= 10; i++) {
			double precio = Math.ceil(r.nextDouble(0.99, 15));
			String nombre = "petazetas" + i;
			producto = new Producto(i, nombre, precio);
			System.out.println(producto);
			lista.add(producto);

		}

		List<Producto> listaPedido = new ArrayList<Producto>();
		int numProducto = 0;
		Persona2 person1 = new Persona2("3445632", "PEPE", "Gutierrez", 277);
		LocalDate hoy = LocalDate.now();
		Pedido pedido1 = new Pedido(hoy, listaPedido, 5.9, person1);

		do {
			numProducto = util.Funciones.dimeEntero("Introduce un codigo de producto", sc);
			for (Producto p : lista) {
				if (numProducto == p.getCodigo()) {
					System.out.println("El producto se ha add al pedido");
					pedido1.addProducto(p);
					//compara cada codigo de cada producto con el num introducido
		}
			}

		} while (numProducto != -1);

	
	

		System.out.println(person1.getNombre() + " tiene que pagar " + pedido1.precioPedido() + " euros");
	}

	public static List<Producto> generarProductos() {
		Random r = new Random();
		Producto producto = new Producto();
		List<Producto> lista = new ArrayList<Producto>();
		for (int i = 1; i <= 10; i++) {
			double precio = Math.ceil(r.nextDouble(0.99, 15));
			String nombre = "petazetas" + i;
			int codigo=0;
			do {
				codigo=r.nextInt(1,100);
			} while (estaCodigo(lista,codigo)==false);
			
			producto = new Producto(codigo, nombre, precio);
			System.out.println(producto);
			lista.add(producto);

		}
		return lista;
	}
public static boolean estaCodigo(List<Producto>lista,int codigo) {
	for (Producto producto : lista) {
		if (producto.getCodigo()==codigo) {
			return true;
			
		}
		
	}
	return false;
}
}
