package com.coderhouse;

public class EjerciciosCicloFor {

	public static void main(String[] args) {
		//Imprime los números del 1 al 10 usando un ciclo for.
		for (int i = 1; i <= 10; i++) {
		    System.out.println(i);
		}
		
		//Suma todos los números del 1 al 100 usando un ciclo for.
		int suma = 0;
		for(int i = 1; i <= 100; i++) {
			suma+= i;
		}
		System.out.println("La suma es: " + suma);
		
		//Imprime los números pares del 2 al 20 usando un ciclo for.
		for(int i = 2; i <=20; i+=2) {
			System.out.println("par: " + i);
		}
		
		//Recorre un array de enteros con un ciclo for y muestra cada valor.
		int[] enteros = {1, 2, 3, 4, 5};
		
		for(int entero : enteros) {
			System.out.println("entero: " + entero);
		}
		
		//Imprime los múltiplos de 5 del 5 al 50 usando un ciclo for.
		for(int i = 5; i <= 50; i+= 5) {
			System.out.println("multiplo de 5: " + i);
		}
		
		//Encuentra el número mayor en un array de enteros usando un ciclo for.
		int mayor = enteros[0];
		for(int i = 0; i < enteros.length; i++) {
			if(enteros[i] > mayor) {
				mayor = enteros[i];
			}
		}
		System.out.println(mayor + " es el mayor del array");
		
		//Crea un programa que imprima los primeros 10 números de la secuencia Fibonacci usando for.
		int a = 0, b = 1;
		System.out.println(a);
		System.out.println(b);
		for (int i = 2; i < 10; i++) {
		    int siguiente = a + b;
		    System.out.println(siguiente);
		    a = b;
		    b = siguiente;
		}
		
		//Multiplica todos los elementos de un array de enteros por 2 usando un ciclo for.
		for(int i = 0; i < enteros.length; i++) {
			int multiplicacion = i * 2;
			System.out.println("2 * " + i + " = " + multiplicacion);
		}
		
		//Imprime las letras de una cadena de texto usando un ciclo for.
		String cadena = "hola";
		for(int i = 0; i < cadena.length(); i++) {
			System.out.println(cadena.charAt(i));
		}
		
		//Crea un programa que imprima una tabla de multiplicar del 1 al 10 usando for.
		for(int i = 1; i <= 10; i++) {
			System.out.println("Tabla del " + i);
			for(int j = 1; j <= 10; j++) {
				System.out.println(i + " * " + j + " = " + (i*j));
			}
		    System.out.println(); // Separador entre tablas
		}
	}

}
