package taller2;

public class CentroDeInvestiacion extends VehiculoEspacial {

	private int capacidad;
	private float peso;
	private float distancia;
	private boolean actividad;
	private String nombre;

	public CentroDeInvestiacion(String nombre, int capacidad, float peso, float velocidad, boolean actividad) {
		super(nombre);
		this.nombre = nombre;
		this.capacidad = capacidad;
		this.peso = peso;
		this.distancia = velocidad;
		this.actividad = actividad;
	}

	@Override
	public String tipoVehiculo() {
		// TODO Auto-generated method stub
		return "Centro de investigacion";
	}

	@Override
	public String funcion() {
		// TODO Auto-generated method stub
		return "mandar seres humanos al espacio para tareas de reparaci�n, mantenimiento o investigaci�n, en misiones donde se precisa de la destreza y de la toma de decisiones de personas, en detrimento de las m�quinas.";
	}

	public String datos() {

		return "Esta nave es de tipo " + tipoVehiculo() + ", tiene por nombre " + nombre + ", con capacidad de "
				+ capacidad + " personas, con un peso de " + peso + " toneladas, tiene una distancia de " + distancia
				+ " km de la superficie terrestre. Su actividad es " + actividad + " y su funcion es " + funcion();
	}

}
