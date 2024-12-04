package com.ejercicios;

//Crea una clase Persona con atributos nombre y edad y un método para imprimir los datos.
public class Persona {
	//Crea una clase Persona que tenga los atributos nombre, edad, y un método saludar.
	private String nombre;
	private int edad;
	
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
	
	public void mostrarDatos() {
		System.out.println("Nombre: " + nombre);
		System.out.println("Edad: " + edad);
	}
	
	public void saludar() {
		System.out.println("Hola " + nombre + "!!");
	}
	
	public static void main(String[] args) {
		Persona unaPersona = new Persona();
		unaPersona.setNombre("Valeria");
		unaPersona.setEdad(24);
				
		unaPersona.mostrarDatos();
		unaPersona.saludar();
	}

}
