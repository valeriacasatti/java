package com.coderhouse.mascotas;
import com.coderhouse.exceptions.PerroException;

public class Mascota {
	
	//variables
	protected String nombre;
	protected int edad;
	protected String tamanio;
	protected String color;
	
	//exception
	private static final int EDAD_MAXIMA = 15;
	String errorMsg = "El perro no vive mas de " + EDAD_MAXIMA + " anios";

	//constructor
	public Mascota() {
		super();
	}
	
	//sobrecarga de constructores
	public Mascota(String nombre, int edad, String tamanio, String color) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.tamanio = tamanio;
		this.color = color;
	}
	
	//encapsulamiento
	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return this.edad;
	}
	public void setEdad(int edad) throws PerroException {
		if(edad > EDAD_MAXIMA) {
			throw new PerroException(errorMsg);
		} else {
			this.edad = edad;
		}
	} 

	public String getTamanio() {
		return this.tamanio;
	}
	public void setTamanio(String tamanio) {
		this.tamanio = tamanio;
	}

	public String getColor() {
		return this.color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	//metodos
	public void caminar() {
		System.out.println("La mascota " + getNombre() + " esta caminando");
	}
	
	public String toString() {
		return "Mascota [nombre: " + nombre + ", edad: " + edad + ", tamanio: " + tamanio + ", color: " + color + "]" ;
	}

}
