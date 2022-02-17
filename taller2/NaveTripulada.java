package taller2;

public class NaveTripulada extends VehiculoEspacial implements FinalidadNaveTripulada {

	private String nombre;
	private String finalidad;

	public NaveTripulada(String nombre) {
		super(nombre);
		this.nombre = nombre;

		// TODO Auto-generated constructor stub
	}

	@Override
	public String tipoVehiculo() {
		// TODO Auto-generated method stub
		return "Esta es una vane espacial de tipo tripulada";
	}

	@Override
	public String funcion() {
		// TODO Auto-generated method stub
		return "Mandar seres humanos al espacio para tareas de reparación, mantenimiento o investigación, en misiones donde se precisa de la destreza y de la toma de decisiones de personas, en detrimento de las máquinas.";
	}
	
	@Override
	public String finalidad(String num) {
		// TODO Auto-generated method stub
		String accion = "";
		if(num.equalsIgnoreCase("1")) {
			accion="misiones lunares";
		}else if(num.equalsIgnoreCase("2")) {
			accion="experimentación y estudio del comportamiento humano en condiciones ingrávidas y en el exterior de la cápsula";
		}else if (num.equalsIgnoreCase("3")){
			accion="mantenimiento de satélites, probar acoplamientos con otras naves y equipos electrónicos";
		}else {
			accion="respuesta no valida";
		}
		return accion;
	}

	
	public String datos() {
		return tipoVehiculo() + " de nombre " + nombre + " y tiene como funcio " + funcion() + " y su finalidad en especifico es ";
	}

	
	
	

}
