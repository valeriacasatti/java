package com.ejemplo;

//Implementar un programa que reciba un String y cuente la cantidad de vocales que tiene.
public class ContarVocales {
	public static int contarVocales(String texto) {
		int contador = 0;
		texto = texto.toLowerCase();
		
		for (char c : texto.toCharArray()) {
			if( c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ) {
				contador++;
			}
		}
		return contador;
	}

	public static void main(String[] args) {
		String texto = "Hola Mundo";
		System.out.println("La cantidad de vocales en '" + texto + "' es: " + contarVocales(texto));
	}

}
