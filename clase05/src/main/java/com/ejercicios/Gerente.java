package com.ejercicios;

public class Gerente extends Empleado {
	
	public double calcularBonificaciones() {
		sueldo = 100;
		return sueldo * 0.12;
}

	public static void main(String[] args) {
		Gerente gerente = new Gerente();
		System.out.println("Bonificacion: $" + gerente.calcularBonificaciones());
	}

}
