package com.coderhouse;

import java.util.ArrayList;
import java.util.List;

public class EjerciciosForEach {

	public static void main(String[] args) {
		//Recorre un array de enteros usando foreach y muestra cada valor.
		int[] array = {1, 2, -3, 4, 5, -6};
		for(int numero : array) {
			System.out.println(numero);
		}
		
		//Imprime los elementos de una List de cadenas usando foreach.
		List<String> lista = new ArrayList<>();
		lista.add("casa");
		lista.add("tenedor");
		lista.add("cuchara");
		lista.add("cuchillo");
		lista.add("mesa");

		for(String palabra : lista) {
			System.out.println(palabra);
		}
		
		//Crea un array de enteros y suma sus elementos usando un ciclo foreach.
		int suma = 0;
		for(int numero : array) {
			suma += numero;
		}
		System.out.println("Suma de todos los elementos: " + suma);
		
		//Multiplica todos los elementos de un array de enteros por 3 usando foreach.
		int resultado = 0;
		for(int numero : array) {
			resultado = numero * 3;
			System.out.println(numero + " * 3 = " + resultado);
		}
		
		//Recorre un array de enteros y muestra los pares usando foreach.
		for(int numero : array) {
			if(numero % 2 == 0) {
				System.out.println(numero + " es par");
			}
		}
		
		//Recorre una List de cadenas y muestra solo las que tienen más de 5 letras usando foreach.
		System.out.println("Palabras con mas de 5 letras:");
		for(String palabra : lista) {
			if(palabra.length() > 5) {
				System.out.println(palabra);
			}
		}
		
		//Convierte todos los elementos de una lista de cadenas a mayúsculas usando foreach.
		for(int i = 0; i < lista.size(); i++) {
			lista.set(i, lista.get(i).toUpperCase());
		}
		System.out.println("Cadena de texto mayuscula: " + lista);
		
		//Cuenta cuántos números negativos hay en un array de enteros usando foreach.
		for(int numero : array) {
			if(numero < 0) {
				System.out.println(numero + " es negativo");
			}
		}
		
		//Recorre una lista de enteros y elimina los menores de 10 usando foreach.
		List<Integer> enteros = new ArrayList<>();
		enteros.add(45);
		enteros.add(9);
		enteros.add(89);
		enteros.add(23);
		enteros.add(2);
		
		for(int entero : enteros) {
			if(entero < 10) {
				System.out.println(entero + " es menor a 10");
			}
		}
		
		//Recorre una lista de cadenas y concatena todas las palabras usando foreach.
		List<String> oracion = new ArrayList<>();
		oracion.add("Lola");
		oracion.add("tiene");
		oracion.add("ocho");
		oracion.add("años");
		
		StringBuilder concatenedString = new StringBuilder();
		
		for(String palabra : oracion) {
			concatenedString.append(palabra).append(" ");
		}
		System.out.println("Oracion: " + concatenedString);
	}

}
