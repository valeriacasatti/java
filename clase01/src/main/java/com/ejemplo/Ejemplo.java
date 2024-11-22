package com.ejemplo;

public class Ejemplo {
	//Definir un método estático que reciba un int y devuelva su cuadrado.
		public static int cuadrado(int numero) {
			return numero * numero;
		}
		
		//Crear un programa que determine si un número es primo utilizando operadores relacionales y bucles.
		public static boolean esPrimo(int numero) {
			if(numero < 2) return false;
			for(int i = 2; i <= Math.sqrt(numero); i++) {
				if(numero % i == 0) return false;
			}
			return true;
		}

	public static void main(String[] args) {
		System.out.println("Hola! Este es un mensaje desde la clase Ejemplo");
		//Cuadrados
		System.out.println("El cuadrado de 5 es: " + cuadrado(5));
		System.out.println("El cuadrado de 75 es: " + cuadrado(75));
		//Es primo?
		int numero = 12;
		System.out.println("Es " + numero + " un numero primo? " + esPrimo(numero));
	}

}
