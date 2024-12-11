package com.ejerciciosI;

//Crea una clase Circulo con un método calcularArea() que calcule el área según el radio. Sobrecarga el método para aceptar diferentes tipos de valores (int, double).
public class Circulo {
	
	public void calcularArea(int radio) {
		double resultado = Math.PI * radio * radio;
		System.out.println(resultado);
	}
	
	public void calcularArea(double radio) {
		double resultado = Math.PI * radio * radio;
		System.out.println(resultado);
	}

	public static void main(String[] args) {
		Circulo circulo = new Circulo();
		circulo.calcularArea(2);
		circulo.calcularArea(2.2);

	}

}
