package clases;

import java.util.ArrayList;
import java.util.List;

//añadir objetos a una lista
public class Prueba {
	private List<Integer> numeros;
	double altura;
	
	public List<Integer> getNumeros() {
		return numeros;
	}
	public void setNumeros(List<Integer> numeros) {
		this.numeros = numeros;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public Prueba(int altura)
	{
		this.altura=altura;
		numeros = new ArrayList<Integer>();
	}
	public void addNumero(int n)
	{
		numeros.add(n);
	}

}
