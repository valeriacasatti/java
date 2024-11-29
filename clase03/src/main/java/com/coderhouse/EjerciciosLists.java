package com.coderhouse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EjerciciosLists {

	public static void main(String[] args) {

		//lista 1
		List<String> listaNombres1 = new ArrayList<>();
		listaNombres1.add("Valeria");
		listaNombres1.add("Agustin");
		
		//cantidad de elementos en la lista
		System.out.println(listaNombres1.size()); //2
		
		//lista 2
		List<String> listaNombres2 = new ArrayList<>();
		listaNombres2.add("Sofia");
		listaNombres2.add("Camila");
		
		//agrega valores de la lista 2 a la lista 1
		listaNombres1.addAll(listaNombres2);
		
		System.out.println(listaNombres1.size()); //4
		
		//lista 1 contiene todos los elementos de lista 2?
		System.out.println(listaNombres1.containsAll(listaNombres2));
		
		//eliminar de lista 1 todos los elementos de lista 2
		listaNombres1.removeAll(listaNombres2);
		System.out.println(listaNombres1.size()); //2
		
		//eliminar un solo elemento
		listaNombres1.remove(1);
		System.out.println(listaNombres1.size()); //1
		
		//CICLOS POR CONTEO
		//for
		//recorre toda la lista
		for(String nombre : listaNombres2) {
			System.out.println(nombre);
		}
		
		//tambien recorre toda la lista
		for(int i = 0; i <listaNombres2.size(); i++) {
			System.out.println(listaNombres2.get(i));
		}
		
		//for each
		listaNombres2.forEach(nombre -> {
			System.out.println(nombre);
		});
		
		//la lista esta vacia?
		System.out.println(listaNombres1.isEmpty());
		if(listaNombres1.isEmpty()) {
			System.out.println("La lista esta vacia");
		}else {
			System.out.println("La lista contiene: " + listaNombres1);
		}

		//vaciar la lista
		listaNombres1.clear();
		System.out.println(listaNombres1.isEmpty());

		//retorna un valor por indice
		System.out.println(listaNombres2.get(0));

		//setea un nuevo valor a un indice ya existente a la lista
		listaNombres2.set(1, "Leandro");
		System.out.println(listaNombres2);

		//retorna el indice al que pertenece el valor
		System.out.println(listaNombres2.indexOf("Sofia"));
		//si el valor no existe retorna -1
		System.out.println(listaNombres1.indexOf("Sofia"));
		
		//Crea una List de números enteros y añade 5 valores.
		List<Integer> enteros = new ArrayList<>();
		enteros.add(19);
		enteros.add(85);
		enteros.add(25);
		enteros.add(43);
		enteros.add(15);
		enteros.add(68);
		
		System.out.println("Lista de enteros: " + enteros);
		
		//Elimina el primer elemento de una List de enteros.
		enteros.remove(0);
		System.out.println("Lista de enteros luego de eliminar el primer elemento: " + enteros);
		
		//Encuentra el tamaño de una List de enteros.
		System.out.println("Tamaño de la lista de enteros: " + enteros.size());

		//Suma todos los elementos de una List de enteros.
		int suma = 0;
		for(int numero : enteros) {
			suma += numero;
		}
		
		System.out.println("Suma de todos los enteros de la lista: " + suma);

		//Encuentra el número mayor en una List de enteros.
		int mayor = enteros.get(0);
		for(int numero : enteros) {
			if(numero > mayor) {
				mayor = numero;
			}
		}
		
		System.out.println("Numero mayor de la lista de enteros: " + mayor);
		
		//Verifica si un valor está presente en una List de enteros.
		int valor = 2;
		boolean valorPresente = enteros.contains(valor);
		String resultado = valorPresente ? valor + " esta presente en la lista" : valor + " no esta presente en la lista";
		System.out.println(resultado);
		
		//Convierte una List en un array y muestra sus elementos.
		Integer[] newArray = enteros.toArray(new Integer[0]);
		System.out.println("New array: " + Arrays.toString(newArray));
		
		//Crea una List de cadenas y añade nombres de frutas.
		List<String> frutas = new ArrayList<>();
		frutas.add("frutilla");
		frutas.add("banana");
		frutas.add("durazno");
		frutas.add("pera");
		
		System.out.println(frutas);
		
		//Recorre una List de cadenas y muestra cada elemento.
		for(String fruta : frutas) {
			System.out.println("Fruta " + fruta);
		}
		
		//Elimina todos los elementos de una List.
		frutas.clear();
		System.out.println(frutas);

	}

}
