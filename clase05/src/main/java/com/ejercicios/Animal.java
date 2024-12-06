package com.ejercicios;

//Crea una clase Animal con un método hacerSonido, y una subclase Perro que sobrescriba este método.
public class Animal {
	
	private String nombre;
	
	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void hacerSonido() {
		System.out.println("sonido");
	}
}
