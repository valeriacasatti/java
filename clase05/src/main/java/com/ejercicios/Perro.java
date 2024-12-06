package com.ejercicios;

public class Perro extends Animal {
	
	@Override
	public void hacerSonido() {
		System.out.println(getNombre() + " esta ladrando");
	}

	public static void main(String[] args) {
		
		Perro firulai = new Perro();
		firulai.setNombre("firulai");
		firulai.hacerSonido();
		
	}

}
