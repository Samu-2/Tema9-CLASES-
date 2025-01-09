package ejercicios;

import java.time.LocalDate;

import clases.Persona;

public class Ej26 {

	public static void main(String[] args) {

		double altura = 1.78;
		LocalDate fechaNa = LocalDate.of(2000, 04, 9);

		Persona per1 = new Persona("Pepe", fechaNa, altura);
		if (per1.cumpleAnios()) {
			System.out.println("Felicidades Pepe");
			
		}

	}
}
