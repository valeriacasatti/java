package com.ejercicios;

public class Circulo extends Figura {
	
	@Override
	public double calcularAreaCirculo(double radio) {
		return Math.PI * radio * radio;
	}

	public static void main(String[] args) {
		Circulo circulo = new Circulo();
		System.out.println("El area del circulo es: " + circulo.calcularAreaCirculo(11));
	}

}
