package com.coderhouse;
import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		// Definir un ArrayList para almacenar las edades
				ArrayList<Integer> edades = new ArrayList<>();
				//Agregar edades al ArrayList
				edades.add(22);
				edades.add(10);
				edades.add(66);
				edades.add(54);
				edades.add(30);
				//Metodo remove elimina una edad (54)
				edades.remove(3);
				//Mostrar edades
				System.out.println("edades almacenadas: ");
				for (int edad : edades) {
					System.out.println(edad);
				}
				//Agregar mas edades
				edades.add(32);
				edades.add(21);
				//Mostrar cantidad de edades almacenadas
				System.out.println("cantidad de edades almacenadas: " + edades.size());
				//Muestra edades segun su posicion en el array
				System.out.println("metodo get: " + edades.get(0));
	}

}
