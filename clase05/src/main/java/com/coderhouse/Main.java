package com.coderhouse;

import com.coderhouse.exceptions.PerroException;
import com.coderhouse.mascotas.Mascota;
import com.coderhouse.mascotas.Perro;

public class Main {

	public static void main(String[] args) {
		//perro
		Perro unPerro = new Perro();
		unPerro.setNombre("Firulai");
		unPerro.setColor("negro");
		unPerro.setRaza("Golden");
		
		try {
			unPerro.setEdad(11);
		} catch (PerroException error) {
			System.err.println("Error: " + error.getMessage());
		} finally {
			System.out.println("Finalizo la ejecucion de perroException");
		}
		
		System.out.println("unPerro: " + unPerro);
		unPerro.ladrar();
		unPerro.caminar();
		
		//mascota
		Mascota unaMascota = new Mascota();
		unaMascota.setNombre("Luna");
		unaMascota.setColor("Blanco");
		System.out.println(unaMascota);
		unaMascota.caminar();
		
		//constructor
		//no usa setters
		Mascota nuevaMascota = new Mascota("Draco", 1, "Chico", "Gris");
		System.out.println(nuevaMascota);
		
	}

}
