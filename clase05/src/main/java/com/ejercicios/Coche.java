package com.ejercicios;

public class Coche extends Vehiculo {
	
	@Override
	public void arrancar() {
		System.out.println("el coche arranco");
	}

	public static void main(String[] args) {
		Coche fiat = new Coche();
		fiat.arrancar();
	}

}
