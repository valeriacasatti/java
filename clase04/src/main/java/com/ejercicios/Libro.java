package com.ejercicios;

//Crea una clase Libro con atributos titulo y autor y un método que imprima la información del libro.
public class Libro {

	private String titulo;
	
	//Crea una clase Libro donde el atributo autor sea private y define un método para cambiarlo.
	private String autor;	
	
	public String getTitulo() {
		return this.titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return this.autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}

	public void informacion() {
		System.out.println("Titulo: " + titulo);
		System.out.println("Autor: " + autor);
	}
	
	public void cambiarAutor(String nuevoAutor) {
		autor = nuevoAutor;
	}

	public static void main(String[] args) {
		Libro nuevoLibro = new Libro();
		nuevoLibro.setTitulo("El Alquimista");
		nuevoLibro.setAutor("Paulo Coelho");
		
		nuevoLibro.informacion();
		nuevoLibro.cambiarAutor("Julio Verne");
		System.out.println("Nuevo autor: " + nuevoLibro.getAutor());	
	}

}
