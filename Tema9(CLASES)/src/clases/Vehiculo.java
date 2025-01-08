package clases;

public class Vehiculo {
	
	public int pasajeros;  //número de pasajeros
	public int maxPasajeros;  //máximo de pasajeros

	
	public Vehiculo(int num) {
		maxPasajeros=num;
		
	}
//y luego van los métodos
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
