package com.ejercicios;

//Crea una constante PI en una clase Circulo y usa esa constante para calcular el área de un círculo.
public class Circulo {
	
	private final double PI = 3.1415;
	
	public double area(double radio) {
		return PI * radio * radio;
	}
	
	public static void main(String[] args) {
		Circulo unCirculo = new Circulo();
		System.out.println("Area del circulo: " + unCirculo.area(2));
	}

}
