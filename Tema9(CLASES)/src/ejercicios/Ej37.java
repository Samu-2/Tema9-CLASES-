package ejercicios;

import java.lang.classfile.instruction.ReturnInstruction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import clases.Empleado;
import clases.Tienda;

public class Ej37 {

	public static void main(String[] args) {
		Random r = new Random();
		List<Empleado> listaEmpleados = new ArrayList<Empleado>();
		for (int i = 1; i < 10; i++) {
			Empleado empleado = new Empleado(i, "Pepe" + i, 350 * i + 300);

			listaEmpleados.add(empleado);
			System.out.println(empleado);
		}
		List<Tienda> listaTiendas = new ArrayList<Tienda>();
		List<Empleado> listaPuente = new ArrayList<Empleado>();
		for (int i = 1; i < 4; i++) {

			Tienda tienda = new Tienda("lalos" + i, "C/la Maruqesa" + i);
			listaTiendas.add(tienda);

		}

		util.Funciones.muestraListaTienda1(listaTiendas);
		List<Empleado> listaEmpleados1 = new ArrayList<Empleado>();
		for (int i = 0; i < listaTiendas.size()+1; i++) {
			int veces = 0;
			do {
				int empleado1 = r.nextInt(1, 10);
				// int empleado2=r.nextInt(1,10);
				Iterator<Empleado> iterator = listaEmpleados.iterator();
				while (iterator.hasNext()) {

					Empleado e = iterator.next();//
					if (empleado1 == e.getIdEmpleado()) { // si empleado1 coincide con el id de algun emplead
//lo añado a la lista de empleados que mas tarde sera la lista de empleados de la primera tienda
						listaPuente.add(e);
						iterator.remove();

					}

				}

				if (listaPuente.size() == 2) {
					listaEmpleados1 = pasarEmpleadosListaToLista(listaPuente);
					listaTiendas.get(i).setListaEmpleados(listaEmpleados1);
					listaPuente = new ArrayList<Empleado>();

				}

				veces++;
			} while (veces < 2 * listaTiendas.size());

		}
		util.Funciones.muestraListaEmpleado(listaPuente);
		util.Funciones.muestraListaTienda1(listaTiendas);
		
		
	}

	public static List<Empleado> pasarEmpleadosListaToLista(List<Empleado> listaPuente) {
		List<Empleado> listaEmpleados1 = new ArrayList<Empleado>();
		Iterator<Empleado> iterator3 = listaPuente.iterator();
		while (iterator3.hasNext()) {
			Empleado e = iterator3.next();
			listaEmpleados1.add(e);

		}
	//	System.out.println("pasar" + listaEmpleados1);
		return listaEmpleados1;
	}

}
