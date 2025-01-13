package ejercicios;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import clases.CatalogoProducto;
import clases.Pedido;
import clases.Persona2;
import clases.Producto;

public class Ej35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner (System.in);
		Random r=new Random();
		List<Producto> lista = new  ArrayList<Producto>();
	for (int i = 1; i <= 10; i++) {
		double precio=Math.ceil(r.nextDouble(0.99, 15));
	String	nombre="petazetas"+i;
		Producto producto=new Producto(i,nombre,precio);
		System.out.println(producto);
		lista.add(producto);
		
	}
List<Producto> listaPedido = new ArrayList<Producto>();
int numProducto=0;
do {
numProducto=	util.Funciones.dimeEntero("Introduce un codigo de producto", sc);
if (lista.contains(numProducto)) {
	System.out.println("El producto se ha add al pedido");
	((Pedido) listaPedido).addProducto(numProducto);
}else {
	System.out.println("Codigo incorrecto");
}
	
} while (numProducto!=-1);

	Persona2 person1= new Persona2("3445632", "PEPE", "Gutierrez", 277);
LocalDate hoy=	LocalDate.now();
	Pedido pedido1 = new Pedido(hoy, listaPedido, 5, person1);
	
	System.out.println(person1.getNombre()+" tiene que pagar " + pedido1.precioPedido()+ " euros");
	}

}
