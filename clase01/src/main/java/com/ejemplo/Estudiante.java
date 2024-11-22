package com.ejemplo;
import java.util.ArrayList;

//Crear una clase Estudiante con atributos como nombre y nota
public class Estudiante {
	private String nombre;
	private double nota;
	
	public Estudiante(String nombre, double nota) {
		this.nombre = nombre;
		this.nota = nota;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public double getNota() {
		return nota;
	}
	
	public void mostrarInfo() {
		System.out.println("Nombre: " + nombre);
		System.out.println("Nota: " + nota);
	}

	public static void main(String[] args) {
		Estudiante estudiante = new Estudiante("Valeria Casatti", 9.9);
		estudiante.mostrarInfo();
		//Desarrollar un pequeño sistema de gestión de notas que almacene las notas de varios estudiantes y calcule su promedio.
		ArrayList<Double> notas = new ArrayList<>();
		notas.add(9.8);
		notas.add(3.5);
		notas.add(6.9);
		notas.add(8.7);
		
		//Sumar notas
		double suma = 0;
		for(double nota : notas) {
			suma += nota;
		}
		//Promediar
		double promedio = suma / notas.size();
		System.out.println("El promedio de notas es: " + promedio);
	}

}
