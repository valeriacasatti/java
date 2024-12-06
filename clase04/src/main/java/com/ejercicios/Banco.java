package com.ejercicios;

//Crea una clase Banco que tenga una variable de clase interes y un método para calcular los intereses.
public class Banco {
	
	private double interes = 17.5;
	
	public double calcularInteres(double saldo) {
		return saldo * interes / 100;
	}
	
	public static void main(String[] args) {
		Banco banco = new Banco();
		System.out.println("Intereses a cobrar: $" + banco.calcularInteres(542));
	}

}
