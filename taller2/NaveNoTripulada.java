package taller2;

public class NaveNoTripulada extends VehiculoEspacial {

	private String nombre;
	private String combustible;
	private int empuje;
	private boolean actividad;

	public NaveNoTripulada(String nombre, String combustible, int empuje, boolean actividad) {
		super(nombre);
		this.nombre = nombre;
		this.combustible = combustible;
		this.empuje = empuje;
		this.actividad = actividad;

	}

	@Override
	public String tipoVehiculo() {
		// TODO Auto-generated method stub
		return "Este es un vehiculo espacial de tipo nave no tripulada";
	}

	@Override
	public String funcion() {
		// TODO Auto-generated method stub
		return "Su principal objetivo estriba en estudiar otros cuerpos celestes.";
	}

	public boolean isActividad() {
		return actividad;
	}

	public void setActividad(boolean actividad) {
		actividad = actividad;
	}

	public String datos() {
		return tipoVehiculo() + " de nombre " + nombre + ", funciona con combustible " + combustible
				+ " como combustible, tiene un empuje de " + empuje + " toneladas, su acitividad es "+ actividad + " y tiene como funcion " + funcion();
	}

}
