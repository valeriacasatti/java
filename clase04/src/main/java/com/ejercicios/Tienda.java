package com.ejercicios;

//Crea una clase Tienda con una constante DESCUENTO y úsala en un método para calcular el precio final.
public class Tienda {
	
	private final double DESCUENTO = 0.10;
	
	public double precioFinal(double precio) {
		return precio - (precio * DESCUENTO);
	}

	public static void main(String[] args) {
		Tienda newTienda = new Tienda();
		System.out.println("Precio final: $" + newTienda.precioFinal(100));		
	}

}
