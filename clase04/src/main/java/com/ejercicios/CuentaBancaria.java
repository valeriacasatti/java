package com.ejercicios;

//Crea una clase CuentaBancaria con atributos saldo y titular, y un método para mostrar el saldo.
public class CuentaBancaria {
	
	private double saldo;
	private String titular;
	

	public double getSaldo() {
		return this.saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getTitular() {
		return this.titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	public void mostrarSaldo() {
		System.out.println("Saldo inicial: $" + saldo);
	}
	
	//Crea una clase CuentaBancaria con atributos saldo y titular, y métodos para depositar y retirar.
	public double depositar(double bono) {
		return saldo + bono;

	}
	
	public double retirar(double retiro) {
		return retiro;
	}

	public static void main(String[] args) {
		CuentaBancaria nuevaCuenta = new CuentaBancaria();
		nuevaCuenta.setSaldo(1111.11);
		nuevaCuenta.setTitular("Valeria");
		
		nuevaCuenta.mostrarSaldo();
		double bono = 500;
		double saldoActualizado = nuevaCuenta.depositar(bono);
		System.out.println("Se deposita en la cuenta de " + nuevaCuenta.getTitular() + " un bono de $500, saldo actualizado: $" + saldoActualizado);
		System.out.println("Se retiran $50 de la cuenta de " + nuevaCuenta.getTitular() + ", saldo restante: $" + (saldoActualizado - nuevaCuenta.retirar(200)));
	}

}
