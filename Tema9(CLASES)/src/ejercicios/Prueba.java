package ejercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Prueba {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Random r = new Random();
		List<Integer> listaAle = new ArrayList<Integer>();
//para evitar repetidos
		for (int i = 0; i <6; i++) {
		int n=	r.nextInt(1, 10);
			if (listaAle.contains(n)) {
				i--;
			}else {
				listaAle.add(n);
			}
		}
			
			for (Integer num : listaAle) {
				System.out.println(num);
			}
	
	}
		
	

	private static boolean estaEnList(List<Integer> lista, int num) {

		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i) == num) {
				return true;
			}

		}
		return false;
	}

}
