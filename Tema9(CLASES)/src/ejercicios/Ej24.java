package ejercicios;

import clases.Circulo2;

public class Ej24 {

	public static void main(String[] args) {
		Circulo2 c=new Circulo2();
		c.setRadio(3.54);
		System.out.println(c.calculaArea());
		System.out.println(c.calculaPerimetro());
		System.out.println(c.getRadio());
	}

}
