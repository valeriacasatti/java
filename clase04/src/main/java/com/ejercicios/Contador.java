package com.ejercicios;

//Crea una variable de clase (estática) en una clase Contador para contar cuántos objetos de esa clase se han creado.
public class Contador {
	
	private static int contador = 0;
	
	public void contadorDeObjetos() {
		contador++;
	}
	
	public static int returnContador() {
		return contador;
	}

	public static void main(String[] args) {
		Contador contador = new Contador();
		contador.contadorDeObjetos();
		System.out.println(Contador.returnContador());	
	}

}
