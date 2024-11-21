package com.ejemplo;

//Crear una calculadora simple que permita sumar, restar, multiplicar y dividir dos números.

public class Calculadora {

	public static void main(String[] args) {
		//Numeros a calcular
		double numero1 = 10;
		double numero2 = 2;
				
		//Operacion a realizar
		int operacion = 4;
				
		//Resultado
		double resultado = 0;
		switch(operacion) {
			case 1 -> resultado = numero1 + numero2;
			case 2 -> resultado = numero1 - numero2;
			case 3 -> resultado = numero1 * numero2;
			case 4 -> resultado = numero2 != 0 ? numero1 / numero2 : Double.NaN;
			default -> System.out.println("Opcion invalida");
		}
				
		System.out.println("El resultado es: " + resultado);
	}

}
