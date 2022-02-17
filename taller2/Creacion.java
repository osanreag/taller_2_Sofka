package taller2;

import java.util.Scanner;

public class Creacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		boolean pa = true;

		while (pa) {

			System.out.println("¿Quieres crear una nave espacial?");
			System.out.println("Escribe n si no deseas, de lo contrario responde y");
			String resp = sc.nextLine();

			if (resp.equals("n")) {
				pa = false;
				System.out.println("Programa finalizado");
			} else if (resp.equalsIgnoreCase("y")) {
				System.out.println("Perfecto, vamos a crear la nave: ");
				System.out.println("Presione: \n 1: Vehiculo lanzadera \n 2: nave no tripulada \n"
						+ " 3: nave tripulada \n 4: centro de investigacion");

				String resp2 = sc.nextLine();
				switch (resp2) {

				case "1":
					System.out.println("Vamos a crear el Vehiculo lanzadera");

					System.out.println("Ingrese el nombre: ");
					String nombre = sc.nextLine();
					System.out.println("Ingrese el empuje en ton: ");
					float empuje = Float.valueOf(sc.nextLine());
					System.out.println("Ingrese el peso en ton: ");
					float peso = Float.valueOf(sc.nextLine());
					System.out.println("Ingrese el transporte en ton: ");
					float transporte = Float.valueOf(sc.nextLine());
					System.out.println("Ingrese el altura m: ");
					float altura = Float.valueOf(sc.nextLine());
					System.out.println("Ingrese el potencia caballos: ");
					float potencia = Float.valueOf(sc.nextLine());

					VehiculoLanzadera vehiculo = new VehiculoLanzadera(nombre, empuje, peso, transporte, altura,
							potencia);

					System.out.println("Se creo el vehiculo: " + vehiculo.datos());

					break;

				case "2":
					boolean actividad2 = false;
					System.out.println("Vamos a crear el Vehiculo nave no tripulada");
					System.out.println("Ingrese el nombre: ");
					String nombre2 = sc.nextLine();
					System.out.println("Ingrese el tipo de combustible: ");
					String combustible = sc.nextLine();
					System.out.println("Ingrese el empuje ton: ");
					int empuje2 = Integer.parseInt(sc.nextLine());
					System.out.println("Indique con t si se encuentra activo: ");
					String actividad = sc.nextLine();
					if (actividad.equals("t")) {
						actividad2 = true;
					}

					NaveNoTripulada nave2 = new NaveNoTripulada(nombre2, combustible, empuje2, actividad2);

					System.out.println("Se creo el vehiculo: " + nave2.datos());
					break;

				case "3":
					System.out.println("Vamos a crear el Vehiculo nave tripulada");
					System.out.println("Ingrese el nombre: ");
					nombre = sc.nextLine();
					System.out.println("Ingrese la finalidad 1, 2 o 3: ");
					String fin = sc.nextLine();
					NaveTripulada nave3 = new NaveTripulada(nombre);
					System.out.println("Se creo el vehiculo: " + nave3.datos()+ nave3.finalidad(fin));
					break;

				case "4":
					System.out.println("Vamos a crear el Vehiculo centro de investigacion ");
					System.out.println("Ingrese el nombre: ");
					nombre = sc.nextLine();
					System.out.println("Ingrese la capacidad de personas: ");
					int capacidad = Integer.parseInt(sc.nextLine());
					System.out.println("Ingrese el peso en ton: ");
					float peso2 = Float.valueOf(sc.nextLine());
					System.out.println("Ingrese la distancia de la superfice terrestre en km: ");
					float velocidad = Float.valueOf(sc.nextLine());
					System.out.println("Indique con t si se encuentra activo: ");
					boolean actividad3 = false;
					String actividad4 = sc.nextLine();
					if (actividad4.equals("t")) {
						actividad3 = true;
					}

					CentroDeInvestiacion nave4 = new CentroDeInvestiacion(nombre, capacidad, peso2, velocidad,
							actividad3);
					System.out.println("Se creo el vehiculo: " + nave4.datos());

				default:
					System.out.println("Ingresa un opcion valida");
					break;
				}

			} else {
				System.out.println("Escriba una opcion valida");
			}

		}

	}

}
