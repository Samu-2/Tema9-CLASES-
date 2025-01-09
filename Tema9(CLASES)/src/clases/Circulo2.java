package clases;

public class Circulo2 {
	private double radio;

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}
		
	/*public Circulo2(double radio) {
		super();
		this.radio = radio;
	}*/

	public Circulo2(){
		
	}
	public double calculaArea() { /// metodo
		double area = Math.PI * radio * radio;
		return area;
	}

	public double calculaPerimetro() {

		double perimetro = 2 * Math.PI * radio;
		return perimetro;
	}

}
