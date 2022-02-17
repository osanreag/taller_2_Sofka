package taller2;

public class VehiculoLanzadera extends VehiculoEspacial {

	private String nombre;
	private float empuje;
	private float peso;
	private float transporte;
	private float altura;
	private float potencia;

	public VehiculoLanzadera(String nombre, float empuje, float peso, float transporte, float altura, float potencia) {
		super(nombre);
		this.nombre = nombre;
		this.empuje = empuje;
		this.peso = peso;
		this.transporte = transporte;
		this.altura = altura;
		this.potencia = potencia;
	}

	@Override
	public String tipoVehiculo() {
		// TODO Auto-generated method stub
		return "Este es un vehiculo de tipo lanzadera";
	}

	@Override
	public String funcion() {
		// TODO Auto-generated method stub
		return "Lanzar una carga útil al espacio, normalmente un satélite artificial, una sonda o una nave tripulada";
	}
	
	public String datos() {
		
		return tipoVehiculo() + " de nombre " + nombre + ", con un empuje de " + empuje + " toneladas, con un peso de "
				+ peso + " tonelads,con la capacidad de transportar " + transporte + "toneladas, tiene una altura de " + altura 
				+ "metros y una potencia de " + potencia + " caballos. Este vehiculo tiene la funcion de "+ funcion() ;
	}

}
