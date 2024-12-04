package com.ejercicios;

//Crea una clase Rectangulo con un método que calcule el área dada su base y altura.
public class Rectangulo {

	public int calcularArea(int base, int altura) {
		return base * altura;
	}
	
	public static void main(String[] args) {
		Rectangulo newRectangulo = new Rectangulo();
		System.out.println("Area del rectangulo: " + newRectangulo.calcularArea(35, 9));
	}

}
