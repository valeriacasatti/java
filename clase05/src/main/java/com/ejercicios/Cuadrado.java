package com.ejercicios;

public class Cuadrado extends Figura {
	
	@Override
	public int calcularAreaCuadrado(int lado) {
		return lado * lado;
	}

	public static void main(String[] args) {
		Cuadrado cuadrado = new Cuadrado();
		System.out.println("Area del cuadrado: " + cuadrado.calcularAreaCuadrado(15));
	}

}
