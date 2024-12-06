package com.ejercicios;

//Crea una clase ConversorMoneda con un método estático que convierta dólares a euros.
public class ConversorMoneda {
	
	private static final double TASA_CAMBIO = 0.93;
	
	public static double cambio(double dolares) {
		return dolares * TASA_CAMBIO;
	}

	public static void main(String[] args) {
		double dolares = 100;
		System.out.println(dolares + "USD equivale a " + ConversorMoneda.cambio(dolares) + "EUR");
	}

}
