package com.ejercicios;

//Crea una clase Empleado con un atributo sueldo y una subclase Gerente que tenga un método para calcular bonificaciones.
public class Empleado extends Persona{
	
	protected double sueldo;
	
	public double getSueldo() {
		return this.sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public void sueldoMensual() {
		System.out.println("El sueldo mensual de " + getNombre() + " es: $" + sueldo / 12);
	}

	public static void main(String[] args) {
		Empleado juan = new Empleado();
		juan.setNombre("juan");
		juan.setSueldo(3000);
		juan.sueldoMensual();
	}
}
