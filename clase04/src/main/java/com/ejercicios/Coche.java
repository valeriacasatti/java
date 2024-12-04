package com.ejercicios;

//Crea un objeto Coche con atributos marca, modelo y año e imprime los valores.
public class Coche {
	
	private String marca;
	private String modelo;
	private int anio;
	private double combustible;

	public String getMarca() {
		return this.marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return this.modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAnio() {
		return this.anio;
	}
	public void setAnio(int anio) {
		this.anio = anio;
	}
	
	public double getCombustible() {
		return combustible;
	}
	public void setCombustible(double combustible) {
		this.combustible = combustible;
	}
	
	//mostrar datos
	public void mostrarDatos() {
		System.out.println("Marca: " + marca);
		System.out.println("Modelo: " + modelo);
		System.out.println("Año: " + anio);
	}
	
	//Crea una clase Coche con atributos marca y combustible, y un método calcularCombustible para una distancia.
	public double calcularCombustible(double distancia, double consumoPorKM) {
		return distancia * consumoPorKM;
	}
	
	public static void main(String[] args) {
		Coche nuevoCoche = new Coche();
		nuevoCoche.setMarca("Audi");
		nuevoCoche.setModelo("tt");
		nuevoCoche.setAnio(2020);
		nuevoCoche.setCombustible(45);
		
		nuevoCoche.mostrarDatos();
		System.out.println("Combustible disponible: " + nuevoCoche.getCombustible() + " litros");
		System.out.println("Combustible necesario: " + nuevoCoche.calcularCombustible(100, 0.5) + " litros");
	}

}
