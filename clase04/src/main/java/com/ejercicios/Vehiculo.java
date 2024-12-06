package com.ejercicios;

//Crea una clase Vehiculo con atributos velocidad y combustible, y un método que disminuya el combustible.
public class Vehiculo {

	////Define un atributo protegido velocidad en una clase Vehiculo y accede a él desde otro método de la misma clase.
	protected double velocidad;
	
	private double combustible;
	//Crea una clase Vehiculo con atributos marca y modelo, y métodos para acelerar y frenar.
	private String marca;
	private String modelo;
	
	public double getVelocidad() {
		return this.velocidad;
	}
	public void setVelocidad(double velocidad) {
		this.velocidad = velocidad;
	}

	public double getCombustible() {
		return this.combustible;
	}
	public void setCombustible(double combustible) {
		this.combustible = combustible;
	}

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
	
	//disminuir combustible
	public void disminuirCombustible() {
		if(combustible > 0) {
			combustible--;
			System.out.println("Combustible restante: " + combustible);
		} else {
			System.out.println("Sin combustible");
		}
	}
	
	//acelerar
	public void acelerar() {
		velocidad++;
		System.out.println("Velocidad: " + velocidad);
	}
	//frenar
	public void frenar() {
		velocidad = 0;
		System.out.println("Velocidad: " + velocidad);
		System.out.println("Detencion exitosa");
	}
	
	//Crea una clase Vehiculo con una constante MAX_VELOCIDAD y un método para verificar si un vehículo supera el límite.
		private final double MAX_VELOCIDAD = 230;
		
		public void limiteVelocidad() {
			System.out.println(velocidad);

			if( velocidad > MAX_VELOCIDAD) {
				System.out.println("El vehiculo supera la velocidad maxima de " + MAX_VELOCIDAD);
			} else {
				System.out.println("El vehiculo se encuentra dentro del rango de velocidad permitida");
			}
		}
	
	public static void main(String[] args) {

		Vehiculo vehiculo = new Vehiculo();
		vehiculo.setVelocidad(550);
		vehiculo.setCombustible(20);
		
		vehiculo.disminuirCombustible();
		vehiculo.acelerar();
		vehiculo.limiteVelocidad();
		vehiculo.frenar();
	}

}
