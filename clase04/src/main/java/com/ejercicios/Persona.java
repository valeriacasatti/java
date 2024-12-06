package com.ejercicios;

//Crea una clase Persona con atributos nombre y edad y un método para imprimir los datos.
public class Persona {
	
	//Crea una clase Persona que tenga los atributos nombre, edad, y un método saludar.
	private String nombre;
	private int edad;
	
	//Crea una variable de instancia en una clase Persona y muestra cómo accedes a ella desde los métodos de la clase.
	private String apellido;
	
	public String getNombre() {
		return this.nombre;
	}
	
	//Define un getter para el atributo nombre en una clase Persona y un setter que valide si el nombre no está vacío.
	public void setNombre(String nombre) {
		if(nombre.isEmpty()) {
			System.out.println("No hay nombre definido");
		}else {
			this.nombre = nombre;
		}
	}
	
	public int getEdad() {
		return this.edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public void mostrarDatos() {
		System.out.println("Nombre: " + nombre);
		System.out.println("Edad: " + edad);
	}
	
	public void saludar() {
		System.out.println("Hola " + nombre + "!!");
	}
	
	//Crea una variable local en un método calcularEdad de una clase Persona que calcule la edad a partir del año de nacimiento.
	public void calcularEdad(int anioNacimiento) {
		int anio = 2024;
		int edad = anio - anioNacimiento;
		System.out.println("Edad calculada segun el anio de nacimiento: " + edad);
	}
	
	//Crea un método en una clase Persona que imprima si la persona es mayor de edad o no.
	public void mayor() {
		if(edad >= 18) {
			System.out.println(nombre + " es mayor de edad");
		}else {
			System.out.println(nombre + " es menor de edad");
		}
	}
	
	public void datos() {
		System.out.println(nombre + " " + apellido);
	}
	
	public static void main(String[] args) {
		Persona unaPersona = new Persona();
		unaPersona.setNombre("Valeria");
		unaPersona.setApellido("Casatti");
		unaPersona.setEdad(24);
				
		unaPersona.mostrarDatos();
		unaPersona.saludar();
		unaPersona.mayor();
		unaPersona.datos();
		unaPersona.calcularEdad(2000);
	}

}
