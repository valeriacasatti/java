package com.coderhouse.objetos;

public class Gato {
	
	//variable de clase, constante
	private static final int EDAD_MAXIMA = 15;
	
	//mensaje de error
	String errorMsg = "El gato no vive mas de " + EDAD_MAXIMA + " anios";

	//variables de instancia, ATRIBUTOS del objeto
	private String nombre;
	private int edad;
	private String tamanio;
	private String color;
	
	//metodos, funciones
	public void maullar(){
		//variable local
		String nombreDelGato = getNombre();
		System.out.println("el gato " + nombreDelGato + " esta maullando");
	}
	public void comer() {
		System.out.println("comiendo");
	}
	public void caminar() {
		System.out.println("caminando");
	}
	
	//ENCAPSULAMIENTO

	//getters y setters
	
	//metodo que retorna un valor
	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getEdad() {
		return this.edad;
	}
	public void setEdad(int edad) throws Exception{
		if(edad > EDAD_MAXIMA) {
			throw new Exception(errorMsg);
		} else {			
			this.edad = edad;
		}
	} 
	
	public String getTamanio() {
		return this.tamanio;
	}
	public void setTamanio(String tamanio) {
		this.tamanio = tamanio;
	}
	
	public String getColor() {
		return this.color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	@Override
	public String toString() {
		return "Gato [nombre=" + nombre + ", edad=" + edad + ", tamanio=" + tamanio + ", color=" + color + "]";
	}
	
	
	
	
	
}
