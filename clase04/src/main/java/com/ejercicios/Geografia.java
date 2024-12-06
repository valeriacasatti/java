package com.ejercicios;

//Crea una constante RADIO_TIERRA en una clase Geografia y úsala en un método para calcular la circunferencia.
public class Geografia {
	
	private final double RADIO_TIERRA = 6378;
	public double circunferencia() {
		return 2 * Math.PI * RADIO_TIERRA;
	}

	public static void main(String[] args) {
		Geografia circunferenciaDeLaTierra = new Geografia();
		System.out.println("La circunferencia de la tierra en km es: " + circunferenciaDeLaTierra.circunferencia());
	}

}
