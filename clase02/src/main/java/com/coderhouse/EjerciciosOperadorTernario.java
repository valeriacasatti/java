package com.coderhouse;

public class EjerciciosOperadorTernario {

	public static void main(String[] args) {
		
		//Verifica si un número es par o impar usando un operador ternario.
		int numero = 7;
		boolean par = numero % 2 == 0;
		
		String parOImpar = par ? "El numero " + numero + " es par" : "El numero " + numero + " es impar";
		System.out.println(parOImpar);
		
		//Determina si una persona es mayor de edad con un operador ternario.
		int edad = 18;
		boolean mayor = edad >= 18;
		
		String mayorDeEdad = mayor ? "Eres mayor de edad" : "Eres menor de edad";
		System.out.println(mayorDeEdad);
		
		//Asigna el valor "Positivo" o "Negativo" a una variable según el valor de un número.
		boolean positivo = numero > 0;
		
		String positivoONegativo = positivo ? "El numero " + numero + " es positivo" : "El numero " + numero + " es negativo";
		System.out.println(positivoONegativo);
		
		//Calcula el mayor de dos números usando un operador ternario.
		int numero1 = 2, numero2 = 8;
		boolean numeroMayor = numero1 > numero2;
		
		String mayorOMenor = numeroMayor ? numero1 + " es mayor a " + numero2 : numero1 + " es menor a " + numero2;
		System.out.println(mayorOMenor);
		
		//Asigna un valor "Aprobado" o "Reprobado" a una variable en función de una nota.
		int nota = 6;
		boolean aprobado = nota >= 6;
		
		String aprobadoOReprobado = aprobado ? "Nota: " + nota + ", estas aprobado!!" : "Nota: " + nota + ", reprobaste :(";
		System.out.println(aprobadoOReprobado);

	}

}
