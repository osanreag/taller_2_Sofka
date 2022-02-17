package taller2;

public abstract class VehiculoEspacial {
	
	public String nombre;
		
	public VehiculoEspacial(String nombre) {
		this.nombre = nombre;
	}

	public abstract String tipoVehiculo();
	
	public abstract String funcion();

}
