package com.ejercicios;

public class Calculadora {	
	
	//Crea una clase Calculadora con un método sumar que sume dos números enteros.	
	public static int sumar(int a, int b) {
		return a + b;
	}
	
	//Crea un método restar en una clase Calculadora que reste dos números enteros.
	public int restar(int a, int b) {
		return a - b;
	}
	
	//Crea una variable local dentro de un método en una clase Calculadora que sume dos números.
	public void variableSuma(int a, int b) {
		int variable = a + b;
		System.out.println("La suma es: " + variable);
	}
	//Define una variable local en un método multiplicar de una clase Calculadora.
	public void multiplicar(int a, int b) {
		int multiplicacion = a * b;
		System.out.println("Multiplicacion: " + multiplicacion);
	}

	//Crea una clase Matematica con un método estático que calcule el cuadrado de un número.
	public static int cuadrado(int numero) {
		return numero * numero;
	}
	
	public static void main(String[] args) {
		Calculadora calculadora = new Calculadora();
		
		//metodo estatico no necesita ser instanciado para ejecutarlo
		System.out.println("Suma: " + Calculadora.sumar(2,8));	
		System.out.println("Resta: " + calculadora.restar(10,7));
		calculadora.variableSuma(1, 1);
		calculadora.multiplicar(20, 2);
		System.out.println("Cuadrado: " + Calculadora.cuadrado(5));
		
	}
}
