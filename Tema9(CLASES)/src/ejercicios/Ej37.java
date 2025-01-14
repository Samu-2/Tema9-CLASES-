package ejercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import clases.Empleado;
import clases.Tienda;

public class Ej37 {

	public static void main(String[] args) {
		Random r =new Random();
		List<Empleado> listaEmpleados=new ArrayList<Empleado>();
		for (int i = 1; i <10 ; i++) {
			Empleado empleado= new Empleado(i,"Pepe"+i,350*i+300);
			
			listaEmpleados.add(empleado);
			System.out.println(empleado);
		}
	List<Tienda> listaTiendas=new ArrayList<Tienda>();
		for (int i = 1; i < 4; i++) {
			List<Empleado> listaEmpleados1=new ArrayList<Empleado>();
			Tienda tienda=new Tienda("lalos"+i,"C/la Maruqesa"+i,listaEmpleados1);
			listaTiendas.add(tienda);
			
		}
		
            util.Funciones.muestraListaTienda(listaTiendas);
            int empleado=r.nextInt(1,10);
           
            do {
            	for (Empleado t : listaEmpleados) {
            		if(empleado==t.getIdEmpleado()) {
            		
            		}
					
				}
				
			} while (condition);
	}

}
