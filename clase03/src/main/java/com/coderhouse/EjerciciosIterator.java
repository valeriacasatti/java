package com.coderhouse;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EjerciciosIterator {

	public static void main(String[] args) {
		// iterator NO se usa mas
		
		List<String> colores = new ArrayList<>();
		colores.add("Negro");
		colores.add("Blanco");
		colores.add("Gris");
		
		Iterator<String> iterator = colores.iterator();
		
		//CICLOS POR CONDICION
		//while
		while(iterator.hasNext()) { //existe un elemento siguiente?
			String color = iterator.next(); //si existe lo asigna a la variable
			System.out.println(color);
			iterator.remove();
		}
		
		//EJERCICIOS ITERABLE
		//Crea una List de números y utiliza Iterable para recorrerla.
		List<Integer> numeros = new ArrayList<>();
		numeros.add(1);
		numeros.add(2);
		numeros.add(3);
		
		Iterable<Integer> iterable = numeros;
		for(int numero : iterable) {
			System.out.println(numero);
		}
		
		//Utiliza Iterable para recorrer una colección de cadenas y mostrar los elementos.
		List<String> cadenas = new ArrayList<>();
		cadenas.add("Gato");
		cadenas.add("Perro");
		cadenas.add("Conejo");
		
		Iterable<String> iterableCadenas = cadenas;
		for(String palabra : iterableCadenas) {
			System.out.println(palabra);
		}
		
		//Convierte una List en un Iterable y úsala en un ciclo for.
		List<Integer> edades = new ArrayList<>();
		edades.add(22);
		edades.add(23);
		edades.add(24);
		
		Iterable<Integer> iterable3 = edades;
		for(int edad : iterable3) {
			System.out.println(edad);
		}
		
		//Crea un Iterable de números impares y recorre los valores.
		List<Integer> numerosImpares = new ArrayList<>();
		for(int numero : numeros) {
			if(numero  % 2 != 0) {
				numerosImpares.add(numero);
			}
		}
				
		Iterable<Integer> impares = numerosImpares;
		System.out.println("Numeros impares: " + impares);		

		//Usa un Iterable para recorrer una lista de palabras y contar cuántas tienen más de 5 letras.
		int cuenta = 0;
		for(String palabra : iterableCadenas) {
			if(palabra.length() >= 5) {
				cuenta++;
			}
		}
		
		System.out.println("Palabras con 5 letras: " + cuenta);
		
		//Crea una colección de números y úsala en un Iterable para encontrar cuántos son pares.
		List<Integer> numerosPares = new ArrayList<>();
		for(int numero : numeros) {
			if(numero % 2 == 0) {
				numerosPares.add(numero);
			}
		}
		
		Iterable<Integer> pares = numerosPares;
		System.out.println("Numeros pares: " + pares);
		
		//EJERCICIOS ITERATOR
		
		//Elimina elementos impares de una List usando un Iterator.
		List<Integer> nums = new ArrayList<>();
		nums.add(41);
		nums.add(63);
		nums.add(58);
		nums.add(23);
		nums.add(86);
		nums.add(10);
		
		Iterator<Integer> numsIterator = nums.iterator();
		while(numsIterator.hasNext()) {
			int n = numsIterator.next();
			if(n % 2 != 0) {
				System.out.println("Se elimina: " + n);
				numsIterator.remove();
			}
		}
		
		System.out.println("Quedan en la lista: " + nums);
		
		//Recorre una lista de cadenas con un Iterator y muestra sus elementos.
		List<String> cosas = new ArrayList<>();
		cosas.add("casa");
		cosas.add("avion");
		cosas.add("tv");
		cosas.add("silla");
		cosas.add("barco");
		
		//Cuenta cuántos elementos hay en una List utilizando un Iterator.
		int count = 0;
		Iterator<String> iteratorCosas = cosas.iterator();
		while(iteratorCosas.hasNext()) {
			//imprime elementos
			String elementos = iteratorCosas.next();
			System.out.println(elementos);
			count++;
		}
		//imprime cantidad de elementos
		System.out.println("Cantidad de elementos: " + count);
				
	}
}
