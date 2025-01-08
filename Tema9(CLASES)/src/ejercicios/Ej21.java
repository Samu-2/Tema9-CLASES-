package ejercicios;

import clases.Circulo;

public class Ej21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circulo circulo1 = new Circulo();
		circulo1.radio = 3.45;
		circulo1.calculaArea();
		System.out.println("area=" + circulo1.calculaArea() + "  " + "perimetro=" + circulo1.calculaPerimetro());
		Circulo circulo2 = new Circulo(12.4);
		circulo2.calculaArea();
		System.out.println("area=" + circulo2.calculaArea() + "  " + "perimetro=" + circulo2.calculaPerimetro());
		System.out.println(circulo1);
		System.out.println(circulo2);
	}

}
