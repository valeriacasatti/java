package com.ejercicios;

//Crea una clase Conversor con un método estático para convertir de grados Celsius a Fahrenheit.
public class Conversor {
	
	public static double convertir(double celsius) {
		return (celsius * 9 / 5) + 32;
	}

	public static void main(String[] args) {
		double celsius = 25;
		System.out.println(celsius + "°C = " + Conversor.convertir(celsius) + "°F");
	}

}
