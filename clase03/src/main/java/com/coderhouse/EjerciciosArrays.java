package com.coderhouse;

import java.util.Arrays;

public class EjerciciosArrays {

	public static void main(String[] args) {

		//forma 1 de inicializar un array
		int [] arrayNumeros = new int[5];
		arrayNumeros[0] = 1;
		arrayNumeros[1] = 2;
		arrayNumeros[2] = 3;
		arrayNumeros[3] = 4;
		arrayNumeros[4] = 5;

		//cantidad de elementos en el array
		System.out.println(arrayNumeros.length);
		//datos de un indice en especifico
		System.out.println(arrayNumeros[0]);
		//visualizar todos los elementos del array
		System.out.println(Arrays.toString(arrayNumeros));
		
		//forma 2 de inicializar un array
		String[] palabras = {
			"Hola", "Mundo", "Coder"
		};
		
		System.out.println(palabras.length);
		System.out.println(Arrays.toString(palabras));
		
		//Crea un array de enteros de tamaño 5 y asigna valores a cada elemento.
		int[] enteros = new int[5];
		enteros[0] = 56;
		enteros[1] = 48;
		enteros[2] = 36;
		enteros[3] = 91;
		enteros[4] = 27;
		
		//Suma todos los elementos de un array de enteros y muestra el resultado.
		int suma = 0;
		for (int numero : enteros) {
			suma += numero;
		};
		
		System.out.println("La suma de todos los elementos del array es: " + suma);
		
		//Encuentra el número mayor en un array de enteros.
		int mayor = enteros[0];
		for(int numero : enteros) {
			if(numero > mayor) {
				mayor = numero;
			}
		}
		
		System.out.println("El mayor de todos los elementos del array es: " + mayor);

		//Encuentra el número menor en un array de enteros.
		int menor = enteros[0];
		for(int numero : enteros) {
			if(numero < menor) {
				menor = numero;
			}
		}
			
		System.out.println("El menor de todos los elementos del array es: " + menor);

		//Cuenta cuántos números pares hay en un array.
		int par = enteros[0];
		for(int numero : enteros) {
			if(numero % 2 == 0) {
				par = numero;
				System.out.println("Numero par: " + par);
			}
		}
				
		//Invierte los elementos de un array de enteros.
		//crea un nuevo array con la misma cantidad de elementos que el array original
		int[] invertido = new int[enteros.length];

		for (int i = 0; i < enteros.length; i++) {
		    invertido[i] = enteros[enteros.length - 1 - i];
		}
		System.out.println("Array invertido: " + Arrays.toString(invertido));
		
		//Crea un array de cadenas y muestra sus elementos.
		String[] cadenas = new String[3];
		cadenas[0] = "Hola";
		cadenas[1] = "Java";
		cadenas[2] = "Array";
		
		System.out.println("Array de cadenas: " + Arrays.toString(cadenas));
		
		//Ordena un array de enteros en orden ascendente.
		//metodo sort ordena ascendentemente el array
		Arrays.sort(enteros);
		System.out.println("Array ordenado: " + Arrays.toString(enteros));
		
		//Encuentra si un número está en un array y muestra su índice.
		int buscar = 1;
		int indice = -1;
		
		for(int i = 0; i < enteros.length; i++) {
			if(buscar == enteros[i]) {
				indice = i;
				break;
			}
		};
		
		if(indice != -1) {
			System.out.println("El numero " + buscar + " se encuentra en el array en el indice " + indice);
		} else {
			System.out.println("El numero " + buscar + " no se encuentra en el array");
		}
		
		//Muestra los elementos de un array en orden inverso.
		for (int i = enteros.length - 1; i >= 0; i--) {
		    System.out.print(enteros[i] + " ");
		}
		
	}
	
}
