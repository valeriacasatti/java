package com.coderhouse;

import com.coderhouse.objetos.Gato;

public class Clase04 {
	
	public static void main(String[] args) throws Exception {

		Gato primerGato = new Gato();
		primerGato.setNombre("Draco");
		primerGato.setEdad(1);
		primerGato.setColor("gris");
		primerGato.setTamanio("bebe");
		
		System.out.println(primerGato);
		
		System.out.println(primerGato.getNombre());
		System.out.println(primerGato.getEdad());
		System.out.println(primerGato.getColor());
		System.out.println(primerGato.getTamanio());
		
		primerGato.maullar();
		primerGato.comer();
		primerGato.caminar();
		
		String[] nombres = new String[] {"Sofi", "Agus", "Vale"};
		imprimirListaNombres(nombres);
		
		//variable local dentro del main
		int radio = 3;
		System.out.println("el area del circulo con radio de " + radio + " cm es de: " + calcularArea(radio) + " cm");
		
	}
	
	private static void imprimirListaNombres(String[] nombrePersonas) {
		for(String nombre : nombrePersonas) {
			System.out.println("nombre: " + nombre);
		}
	}
	
	//inicializador estatico
	static final double PI;
	static {
		PI = 3.141592653589793;
	}
	
	//calcular area de un circulo
	private static double calcularArea(int radio) {
		return PI * Math.pow(radio, 2);
	}
	
	
}
