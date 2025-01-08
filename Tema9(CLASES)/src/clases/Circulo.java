package clases;

public class Circulo {
	public 	double radio; //propiedad radio
	public Circulo(){

	}
	public Circulo(double d){
		radio=d;
	}
	



public double calculaArea() {
  double area=Math.PI*radio*radio;
  return area;
}

}
