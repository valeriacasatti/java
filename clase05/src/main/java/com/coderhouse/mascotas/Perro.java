package com.coderhouse.mascotas;

public class Perro extends Mascota {

	private String raza;
	
	public void ladrar(){
		System.out.println("El perro " + getNombre() + " esta ladrando");
	}
	
	public String getRaza() {
		return this.raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}	
	
	@Override //sobreescritura del metodo -> POLIMORFISMO
	public void caminar() {
		System.out.println(getNombre() + " esta caminando");
	}
	
	@Override
	public String toString() {
		return "Perro [nombre: " + nombre + ", edad: " + edad + ", tamanio: " + tamanio + ", color: " + color + ", raza: " + raza + "]";
	}

}
