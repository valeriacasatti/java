package com.ejercicios;

import java.util.HashSet;

import com.coderhouse.exceptions.RegistroDuplicadoException;

//Crea una clase Persona con un atributo nombre y una subclase Empleado con un método para calcular el sueldo mensual.
public class Persona {
	protected String nombre;

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	//Crea una clase Registro con un método agregar que lance una excepción RegistroDuplicadoException si se intenta agregar un registro duplicado.
	
    private HashSet<String> registros = new HashSet<>();

	public void agregar(String registro) throws RegistroDuplicadoException {
		if(registros.contains(registro)) {
			throw new RegistroDuplicadoException("Registro duplicado");
		}
		registros.add(registro);
	}
	
	public static void main(String[] args) {
		Persona persona = new Persona();
		try {
			persona.agregar(null);
			System.out.println("Try exitoso");
		}catch(RegistroDuplicadoException e) {
			System.out.println("Error: " + e);
		}
	}
}
