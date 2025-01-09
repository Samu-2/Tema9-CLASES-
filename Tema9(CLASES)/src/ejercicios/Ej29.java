package ejercicios;

import java.util.Scanner;

import clases.Particular2;

public class Ej29 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String email = "";
		String nombre = "";
		String telefono = "";
		int edad = 0;
		/*
		do {
			edad = util.Funciones.dimeEntero("Introduce tu edad ", sc);

			System.out.println("Introduce nombre");
			nombre = sc.nextLine();

			System.out.println("Introduce tu email");
			email = sc.nextLine();
		} while (!((validarEmail(email) == true) && nombre.length() > 0 && edad > 0));
		*/
		Particular2 persona1 = new Particular2("pepe","myexample@ewev.com",23);
		
		int opcion=0;
		do {
		opcion=	util.Funciones.dimeEntero("Introduce una opcion\n 1.Añadir telefono\n 2.Salir", sc);
					switch (opcion) {
					case 1:
						
							System.out.println("Introduce un numero de telefono");
							telefono =sc.nextLine();
								persona1.addTelefono(telefono);
						
						break;
					case 2:
						break;

					default:
						break;
					}
			
			
		} while (opcion!=2);
		
		util.Funciones.muestraListaString(persona1.getListaTelefonos());
		System.out.println(persona1);

}

 

		private static boolean validarEmail(String email) {
		String arroba = "@";
		String punto = ".";
		for (int i = 0; i < email.length() - 1; i++) {
			if (email.contains(arroba) && email.contains(punto)) {

				return true;
			}

		}
		return false;
	}

}
