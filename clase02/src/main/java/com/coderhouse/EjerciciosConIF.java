package com.coderhouse;

public class EjerciciosConIF {

	public static void main(String[] args) {
		
		//Determina si un número es positivo. Declara un número y usa if para verificar si es mayor que 0.
		int numero = 10;
		if(numero < 0) {
			System.out.println("El numero " + numero + " es negativo");
		}else {
			System.out.println("El numero " + numero + " es positivo");
		}
		
		//Verifica si una persona es mayor de edad (>= 18 años).
		int edad = 4;
		if(edad >= 18) {
			System.out.println("Eres mayor de edad");
		}else {
			System.out.println("Eres menor de edad :(");
		}
		
		//Comprueba si un número es impar usando el operador %.
		int numeroPar = numero % 2;
		if(numeroPar == 0) {
			System.out.println(numero + " es par");
		}else {
			System.out.println(numero + " es impar");
		}
		
		//Revisa si una cadena está vacía usando if con string.isEmpty().
		String texto = "";
		boolean textoVacio = texto.isEmpty();
		if (textoVacio) {
			System.out.println("Texto vacio!!");
		}else {
			System.out.println(texto);
		}
		
		//Determina si un número es divisible por 5.
		if (numero % 5 == 0) {
			System.out.println("El numero " + numero + " es divisible por 5");
		}else {
			System.out.println("El numero " + numero + " NO es divisible por 5");
		}
	}

}
