package com.ejercicios;

//Crea una clase Producto con el método calcularPrecio, y una subclase Electronico que tenga un método adicional para calcular garantía.
public class Producto {
	public double calcularPrecio(double monto, double impuesto, double envio) {
		return monto + impuesto + envio;
	}
}
