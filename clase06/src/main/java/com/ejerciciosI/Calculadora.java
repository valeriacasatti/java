package com.ejerciciosI;

//Sobrecarga un método sumar() en una clase Calculadora que acepte enteros, doubles, y floats.
public class Calculadora {
	//enteros
	public void sumar(int numeroA, int numeroB) {
		int resultado = numeroA + numeroB;
		System.out.println(resultado);
	}
	
	//doubles
	public void sumar(double numeroA, double numeroB) {
		double resultado = numeroA + numeroB;
		System.out.println(resultado);
	}
	
	//floats
	public void sumar(float numeroA, float numeroB) {
		float resultado = numeroA + numeroB;
		System.out.println(resultado);
	}
	
	public static void main(String[] args) {
		Calculadora calculadora = new Calculadora();
		calculadora.sumar(1, 4);
		calculadora.sumar(0.33, 5.22);
		calculadora.sumar(-5, 10.5);
	}
}

