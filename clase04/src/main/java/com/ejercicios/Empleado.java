package com.ejercicios;

//Crea una clase Empleado con atributos nombre y sueldo, y un método para calcular el sueldo anual.
public class Empleado {
	
	private String nombre;
	private double sueldo;
	

	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSueldo() {
		return this.sueldo;
	}
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public double sueldoAnual() {
		return sueldo*12;
	}

	public static void main(String[] args) {

		Empleado unEmpleado = new Empleado();
		unEmpleado.setNombre("Valeria");
		unEmpleado.setSueldo(100);
		
		System.out.println("El sueldo anual de " + unEmpleado.getNombre() + " es $" + unEmpleado.sueldoAnual());
	}

}
