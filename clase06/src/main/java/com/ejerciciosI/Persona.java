package com.ejerciciosI;

//Implementa una clase Persona con atributos nombre y edad. Utiliza encapsulamiento para proteger el acceso a los atributos, y agrega métodos get y set para ambos.
public class Persona {

	protected String nombre;
	protected int edad;
	
	
	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return this.edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	//Implementa un método compararEdades() en la clase Persona, que acepte otra instancia de Persona y devuelva true si tienen la misma edad, y false en caso contrario.

	public void compararEdades(int edad1, int edad2) {
		if(edad1 == edad2) {
			boolean iguales = true;
			System.out.println("misma edad? " + iguales);
		}else {
			boolean diferentes = false;
			System.out.println("misma edad? " + diferentes);

		}
	}

	public static void main(String[] args) {
		
		Persona vale = new Persona();
		vale.setNombre("vale");
		String nombre = vale.getNombre();
		vale.setEdad(24);
		int edad = vale.getEdad();
		System.out.println(nombre + " tiene " + edad + " anios");
		
		Persona agus = new Persona();
		agus.setEdad(29);
		
		vale.compararEdades(agus.getEdad(), edad);
		
	}

}
