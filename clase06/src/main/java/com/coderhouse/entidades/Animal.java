package com.coderhouse.entidades;

import com.coderhouse.interfaces.AccionesInterface;
import com.coderhouse.interfaces.SerVivoInterface;

public class Animal implements SerVivoInterface, AccionesInterface{
	
	private boolean friendly;
	private String nombre;
	private int edad;
	
	//constructor
	public Animal() {
		super();
	}
	
	public Animal(String nombre) {
		this();
		this.nombre = nombre;
	}

	public Animal(boolean friendly, String nombre, int edad) {
		this(nombre);
		this.friendly = friendly;
		this.edad = edad;
	}

	//getters y setters
	public boolean isFriendly() {
		return this.friendly;
	}
	public void setFriendly(boolean friendly) {
		this.friendly = friendly;
	}
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
	
	@Override
	public String toString() {
		return "Animal [friendly=" + friendly + ", nombre=" + nombre + ", edad=" + edad + "]";
	}

	@Override
	public void emitirSonido() {		
	}

	@Override
	public void moverse() {		
	}

	@Override
	public void comer() {		
	}

	@Override
	public boolean estaVivo() {
		return false;
	}

	@Override
	public void dormir() {		
	}

	@Override
	public void respirar() {		
	}

	@Override
	public void jugar() {		
	}
	
	
	
	
}
