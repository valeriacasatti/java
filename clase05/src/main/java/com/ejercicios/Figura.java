package com.ejercicios;

//Crea una clase Figura con el método calcularArea y subclases Cuadrado y Círculo que implementen este método.
public class Figura {
	
	public int calcularAreaCuadrado(int lado) {
		return lado * lado;
	}
	
	public double calcularAreaCirculo(double radio) {
		return Math.PI * radio * radio;
	}
}
