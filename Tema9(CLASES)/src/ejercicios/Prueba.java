package ejercicios;

import clases.Vehiculo;

public class Prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehiculo vehiculo = new Vehiculo(10);
		
		System.out.println(vehiculo.maxPasajeros);
		Vehiculo vehiculo2 = new Vehiculo(5);
		System.out.println(vehiculo2.maxPasajeros);
		System.out.println(vehiculo);
	}

}
