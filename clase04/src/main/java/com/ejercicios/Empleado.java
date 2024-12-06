package com.ejercicios;

//Crea una clase Empleado con atributos nombre y sueldo, y un método para calcular el sueldo anual.
public class Empleado {
	
	private String nombre;
	private double sueldo;
	
	//Define una constante SALARIO_MINIMO en una clase Empleado y úsala para validar el sueldo.
	private final double SALARIO_MINIMO = 200;
	
	public void validarSueldo() {
		if(sueldo < SALARIO_MINIMO) {
			System.out.println("El sueldo mensual de " + nombre + " no entra dentro del salario minimo");
		}else {
			System.out.println("El sueldo mensual de " + nombre + " cumple con las condiciones");
		}
	}
	
	//Define una constante HORAS_TRABAJO en una clase Empleado y úsala para calcular el sueldo semanal.
	private final double HORAS_TRABAJO = 48;
	public double sueldoSemanal(double pagoPorHora) {
		return HORAS_TRABAJO * pagoPorHora;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSueldo() {
		return this.sueldo;
	}
	
	//Crea una clase Empleado con un atributo sueldo y define un setter que valide si el sueldo es positivo.
	public void setSueldo(double sueldo) {
		if(sueldo > 0) {
			this.sueldo = sueldo;
		}else {
			System.out.println("Sueldo no puede ser negativo");
		}
	}

	public double sueldoAnual() {
		sueldo = 200;
		return sueldo*12;
	}

	public static void main(String[] args) {

		Empleado unEmpleado = new Empleado();
		unEmpleado.setNombre("Valeria");
		unEmpleado.setSueldo(100);
		
		System.out.println("El sueldo anual de " + unEmpleado.getNombre() + " es $" + unEmpleado.sueldoAnual());
		unEmpleado.validarSueldo();
		System.out.println(unEmpleado.getNombre() + " cobra $" + unEmpleado.sueldoSemanal(3) + " por semana");
	}

}
