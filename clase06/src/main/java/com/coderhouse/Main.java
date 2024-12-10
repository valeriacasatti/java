package com.coderhouse;

import com.coderhouse.entidades.Auto;
import com.coderhouse.entidades.Ave;
import com.coderhouse.entidades.Gato;
import com.coderhouse.entidades.Perro;
import com.coderhouse.interfaces.SerVivoInterface;
import com.coderhouse.sobrecarga.Impresora;

public class Main {

	public static void main(String[] args) {
		Perro miPerro = new Perro();
		miPerro.setNombre("Firulai");
		miPerro.comer();
		System.out.println(miPerro.getNombre() + " esta vivo? " + miPerro.estaVivo());
		System.out.println("La ubicacion de " + miPerro.getNombre() + " es en " + SerVivoInterface.UBICACION);
		
		Gato miGato = new Gato();
		miGato.setNombre("Mishi");
		System.out.println(miGato);
		miGato.jugar();
		
		Ave miAve = new Ave();
		miAve.setNombre("Tweety");
		miAve.emitirSonido();
		
		Auto miAuto = new Auto();
		miAuto.setMarca("Audi");
		miAuto.setModelo("tt");
		miAuto.setColor("Negro");
		miAuto.setRuedas(4);
		miAuto.mostrarCantidadRuedas();
		System.out.println(miAuto);
		
		Impresora impresora = new Impresora();
		impresora.imprimir(3);
		impresora.imprimir(2, 8);
		impresora.imprimir("Palabra");
		int [] enteros = {1,2,3,4};
		impresora.imprimir(enteros);
	}

}
