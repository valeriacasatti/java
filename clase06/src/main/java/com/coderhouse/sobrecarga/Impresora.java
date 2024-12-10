package com.coderhouse.sobrecarga;

public class Impresora {
	public void imprimir(int numero) {
		System.out.println("imprimiendo el numero: " + numero);
	}
	public void imprimir(int numeroA, int numeroB) {
		System.out.println("imprimiendo los numeros: " + numeroA + " y " + numeroB);
	}
	public void imprimir(String palabra) {
		System.out.println("imprimiendo la palabra: " + palabra);
	}
	public void imprimir(int[] numeros) {
		System.out.println("imprimiendo el array de numeros");
		for(int numero : numeros) {
			System.out.println("#" + numero);
		}
	}
}
