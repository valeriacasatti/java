package com.ejerciciosI;

//Crea una clase CalculadoraAvanzada con métodos estáticos para sumar, restar, multiplicar y dividir dos números enteros. Sobrecarga los métodos para aceptar diferentes tipos de datos (int, double, float).
public class CalculadoraAvanzada {
	
	public static void sumar(int num1, int num2) {
		int result = num1 + num2;
		System.out.println(result);
	}
	public static void restar(int num1, int num2) {
		int result = num1 - num2;
		System.out.println(result);
	}
	public static void multiplicar(int num1, int num2) {
		int result = num1 * num2;
		System.out.println(result);
	}
	public static void dividir(int num1, int num2) {
		int result = num1 / num2;
		System.out.println(result);
	}
	
	//sobrecarga
	public static void sumar(double num1, double num2) {
		double result = num1 + num2;
		System.out.println(result);
	}
	public static void restar(double num1, double num2) {
		double result = num1 - num2;
		System.out.println(result);
	}
	public static void multiplicar(double num1, double num2) {
		double result = num1 * num2;
		System.out.println(result);
	}
	public static void dividir(double num1, double num2) {
		double result = num1 / num2;
		System.out.println(result);
	}


	public static void main(String[] args) {
		CalculadoraAvanzada.sumar(2, 7);
		CalculadoraAvanzada.restar(5, 3);
		CalculadoraAvanzada.multiplicar(2, 8);
		CalculadoraAvanzada.dividir(6, 2);
		
		CalculadoraAvanzada.sumar(2.66, -9.3);
		CalculadoraAvanzada.restar(6.1, 5.7);
		CalculadoraAvanzada.multiplicar(3.44, 2.2);
		CalculadoraAvanzada.dividir(9.7, 1.4);

	}

}
