package com.ejemplo;

//Escribir un programa que calcule el área de un círculo usando una constante para PI.
public class Circulo {
	public static final double PI = 3.14159265359;
	public static double calcularArea(double radio) {
		return PI * radio * radio;
	}
	
	public static void main(String[] args) {
		System.out.println("el area del circulo es: " + calcularArea(5));
	}
}
