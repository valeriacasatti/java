package com.ejercicios;

//Crea una constante VELOCIDAD_LUZ en una clase Fisica y muestra su valor en un método.
public class Fisica {
	
	private final double VELOCIDAD_LUZ = 299792.458;
	
	//Crea una constante GRAVEDAD en una clase Fisica y úsala para calcular la fuerza gravitatoria.
	private final double GRAVEDAD = 9.80665;
	public double fuerzaGravitatoria(double masa) {
		return GRAVEDAD * masa;
	}

	public static void main(String[] args) {
		Fisica fisica = new Fisica();
		System.out.println("La velocidad de la luz es: " + fisica.VELOCIDAD_LUZ + " m/s");
		System.out.println("La fuerza gravitatoria de Valeria es: " + fisica.fuerzaGravitatoria(57));
	}

}
