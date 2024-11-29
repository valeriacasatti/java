package com.coderhouse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EjerciciosCicloWhile {

	public static void main(String[] args) {
		//WHILE
		System.out.println("WHILE");
		
		//Imprime los números del 1 al 10 usando un ciclo while.
		int i = 1;
		while(i <= 10) {
			System.out.println(i);
			i++;
		}
		
		//Suma todos los números del 1 al 100 usando while.
		int suma = 0;
		while(i <= 100) {
			suma += i;
			i++;
		}
		System.out.println("Suma: " + suma);
		
		//Encuentra el número mayor en un array usando while.
		int[] array = {1, 2, 3, 4, 5};
		int max = array[0], index = 1;
		
		while(index < array.length) {
			if(array[index] > max) {
				max = array[index];
			}
			index++;
		}
		System.out.println("Mayor: " + max);
		
		//Cuenta cuántos números impares hay en un array usando while.
		int impar = 0, j = 0;
		while(j < array.length) {
			if(array[j] % 2 != 0) {
				impar++;
			}
			j++;
		}
		System.out.println(impar);
		
		//Imprime los números pares entre 1 y 20 usando while.
		int par = 2;
		while(par <= 20) {
			System.out.println(par + " es numero par");
				par += 2;
		}
		
		//Recorre una lista de enteros usando while y muestra cada elemento.
		List<Integer> enteros = new ArrayList<>();
		enteros.add(2);
		enteros.add(56);
		enteros.add(11);
		enteros.add(32);
		
		int indexList = 0;
		while(indexList < enteros.size()) {
			System.out.println(enteros.get(indexList));
			indexList++;
		}
		
		//Cuenta cuántos elementos hay en una lista de cadenas usando while.
		List<String> texto = Arrays.asList("a", "b", "c");
		int count = 0, indexString = 0;
		while(indexString < texto.size()) {
			count++;
			indexString++;			
		}
		System.out.println("cantidad de elementos en la lista: " + count);

		//Imprime los múltiplos de 7 del 7 al 70 usando while.
		int multiplo = 7;
		while(multiplo <= 70) {
			System.out.println("multiplos de 7: " + multiplo);
			multiplo += 7;
		}
		
		//Recorre un array de enteros y encuentra el menor valor usando while.
		int min = array[0];
		while(index > array.length) {
			if(array[index] < min) {
				min = array[index];
				index++;
			}
		}
		System.out.println("el numero de menor malor del array es: " + min);
		
		//DO WHILE
		System.out.println("DO WHILE");
		
		//Imprime los números del 1 al 10 usando un ciclo do-while.
		int a = 1;
		do {
			System.out.println(a);
			a++;
		}while(a <= 10);
		
		//Imprime los números impares del 1 al 20 usando do-while.
		int odd = 1;
		do {
			System.out.println(odd + " es impar");
			odd += 2;
		} while(odd <= 20);
		
		//Suma todos los números del 1 al 50 usando do-while.
		int sum = 0, n = 1;
		do {
			sum += n;
			n++;
		} while (n <= 50);
		System.out.println("suma de todos los números del 1 al 50: " + sum);
		
		//Cuenta cuántos números negativos hay en un array usando do-while.
		int[] numeros = {1, -8, 7, -20, -6, -14};
		int negativo = 0, indexNegativo = 0;
		do {
			if(numeros[indexNegativo] < 0) {
				negativo++;
			}
			indexNegativo++;
		} while (indexNegativo < numeros.length);
		System.out.println("cantidad de numeros negativos en el array: " + negativo);
		
		//Imprime las letras de una cadena de texto usando do-while.
		String cadena = "hola";
		int charIndex = 0;
		do {
			System.out.println(cadena.charAt(charIndex));
			charIndex++;			
		}while(charIndex < cadena.length());
		
		//Imprime los múltiplos de 3 del 3 al 30 usando do-while.
		int multiplo3 = 3;
		do {
			System.out.println("multiplos de 3: " + multiplo3);
			multiplo3 += 3;
		} while(multiplo3 <= 30);
		
		//Recorre un array de enteros y muestra los números pares usando do-while.
		int parIndex = 0;
		do {
			if(array[parIndex] % 2 == 0) {
				System.out.println(array[parIndex] + " es par");
			}
			parIndex++;
		} while(parIndex < array.length);
		
		//Cuenta los elementos de una List de enteros usando do-while.
		int contador = 0; //definir una variable que inicie un contador
		int indexContador = 0; //definir una variable que indique el indice de los elementos de la lista
		do {
			contador++; //aumenta el contador
			indexContador++; //aumenta el indice 
		} while(indexContador < enteros.size()); //mientras que exista un indice en la lista
		//imprime los elementos de la lista guardados en el contador
		System.out.println("cantidad de elementos en la lista: " + contador);
		
		//Imprime los números del 100 al 1 usando do-while.
		int reverse = 100; //empieza en 100
		do {
			System.out.println(reverse); //imprime
			reverse--; //descuenta uno y se repite el ciclo
		} while( reverse >= 1); //hasta que llegue a 1
		
		//Calcula la suma de los dígitos de un número usando do-while.
		int digitos = 23456; //numero a calcular
		int indexDigitos = 0; //variable para acumular la suma de digitos
		
		do {
			indexDigitos += digitos % 10;
			digitos /= 10;
		} while(digitos > 0);
		System.out.println("suma de dígitos: " + indexDigitos);

		
	}

}
