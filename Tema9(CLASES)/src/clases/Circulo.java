package clases;

public class Circulo {
	public double radio; // propiedad radio

	public Circulo() {

	}

	public Circulo(double radio) {
		this.radio = radio;
	}

	public double calculaArea() { /// metodo
		double area = Math.PI * radio * radio;
		return area;
	}

	public double calculaPerimetro() {

		double perimetro = 2 * Math.PI * radio;
		return perimetro;
	}

	@Override
	public String toString() {
		return "Circulo [radio=" + radio + ", calculaArea()=" + calculaArea() + ", calculaPerimetro()="
				+ calculaPerimetro() + "]";
	}

}
