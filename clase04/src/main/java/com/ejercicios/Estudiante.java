package com.ejercicios;

//Crea una clase Estudiante con atributos nombre, matricula, y un método calcularPromedio.
public class Estudiante {
	
	private String nombre;
	private int matricula;

	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getMatricula() {
		return this.matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public double calcularPromedio(int nota1, int nota2, int nota3) {
		return (nota1 + nota2 + nota3) / 3;
	}

	public static void main(String[] args) {
		Estudiante nuevoEstudiante = new Estudiante();
		nuevoEstudiante.setNombre("Valeria");
		nuevoEstudiante.setMatricula(1);
		System.out.println("Promedio de " + nuevoEstudiante.getNombre() + " es: " + nuevoEstudiante.calcularPromedio(8, 7, 10));
	}

}
