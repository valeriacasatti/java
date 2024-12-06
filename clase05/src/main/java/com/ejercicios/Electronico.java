package com.ejercicios;

public class Electronico extends Producto {
	
	@Override
	public double calcularPrecio(double monto, double impuesto, double envio) {
		double precio = monto + impuesto + envio;
		return precio;
	}
	
	public double garantia(double precio) {
		return precio + 8;
	}

	public static void main(String[] args) {
		Electronico microondas = new Electronico();
		double total = microondas.calcularPrecio(80, 0.21, 15);
		System.out.println("El precio sin garantia es: $" + total);
		System.out.println("El precio con garantia incluida es: $" + microondas.garantia(total));
	}

}
