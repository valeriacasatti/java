package com.coderhouse.entidades;

import com.coderhouse.interfaces.SerVivoInterface;

public class Ave implements SerVivoInterface{
	
	private String nombre;
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public void emitirSonido() {
		System.out.println(getNombre() + " hace pipipi");
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

}
