package com.ejercicios;

public class Calculadora {
	
	//Crea una clase Calculadora con un método sumar que sume dos números enteros.	
	public int sumar(int a, int b) {
		return a + b;
	}
	
	//Crea un método restar en una clase Calculadora que reste dos números enteros.
	public int restar(int a, int b) {
		return a - b;
	}

	public static void main(String[] args) {
		Calculadora calculadora = new Calculadora();
		
		System.out.println("Suma: " + calculadora.sumar(2,8));	
		System.out.println("Resta: " + calculadora.restar(10,7));	
	
	}
}
