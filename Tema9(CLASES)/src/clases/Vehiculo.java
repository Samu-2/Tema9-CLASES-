package clases;

public class Vehiculo {
	
	public int pasajeros;  //n�mero de pasajeros
	public int maxPasajeros;  //m�ximo de pasajeros

	
	public Vehiculo(int num) {
		maxPasajeros=num;
		
	}
//y luego van los m�todos
public void subePasajero()
{
	//le sumo 1 a los que tuviera
	pasajeros = pasajeros + 1;
}
@Override
public String toString() {
	return "Vehiculo [pasajeros=" + pasajeros + ", maxPasajeros=" + maxPasajeros + "]";
}

}
