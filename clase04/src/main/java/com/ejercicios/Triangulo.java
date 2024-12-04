package com.ejercicios;

//Crea una clase Triangulo con atributos base y altura, y un método calcularArea.
public class Triangulo {
	
	private int base;
	private int altura;
	
	public int getBase() {
		return this.base;
	}
	public void setBase(int base) {
		this.base = base;
	}

	public int getAltura() {
		return this.altura;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}

	public double calcularArea(int base, int altura) {
		return 0.5 * base * altura;
	}

	public static void main(String[] args) {
		Triangulo newTriangulo = new Triangulo();
		newTriangulo.setBase(27);
		newTriangulo.setAltura(58);
		
		System.out.println("Area del triangulo: " + newTriangulo.calcularArea(newTriangulo.getBase(), newTriangulo.getAltura()));
	}

}
