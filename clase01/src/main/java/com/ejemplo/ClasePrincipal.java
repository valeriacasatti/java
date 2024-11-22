package com.ejemplo;
//Escribir un programa que use múltiples clases y acceda a sus métodos desde una clase principal.
public class ClasePrincipal {
	public static void main(String[] args) {
		ClaseA objA = new ClaseA();
		ClaseB objB = new ClaseB();
		
		objA.metodoClaseA();
		objB.metodoClaseB();
	}
}
