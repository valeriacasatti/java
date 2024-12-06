package com.ejercicios;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Objects;

import com.coderhouse.exceptions.SaldoInsuficienteException;

//Define una clase CuentaBancaria con atributos numeroCuenta y titular, y sobrescribe hashCode y equals para que dos cuentas sean iguales si tienen el mismo número de cuenta.
public class CuentaBancaria {
	protected int numeroCuenta;
	protected String titular;
	
	public int getNumeroCuenta() {
		return this.numeroCuenta;
	}
	public void setNumeroCuenta(int numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}
	public String getTitular() {
		return this.titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	@Override
	public boolean equals(Object o) {
		if(this == o) return true;
		if(o == null || getClass() != o.getClass()) return false;
		CuentaBancaria that = (CuentaBancaria) o;
		return Objects.equals(numeroCuenta, that.numeroCuenta);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(numeroCuenta);
	}
	
	//Crea un método leerArchivo que lanza una excepción FileNotFoundException si el archivo no existe.
	public static void leerArchivo(String ruta) throws FileNotFoundException{
		File archivo = new File(ruta);
		if(!archivo.exists()) {
			throw new FileNotFoundException("El archivo no existe");
		}else {
			System.out.println(archivo);
		}
	}
	
	//Crea una clase CuentaBancaria con un método retirar que lance una excepción SaldoInsuficienteException si el saldo es insuficiente.
	private static int saldo = 400;
	public void retirar(double monto) throws SaldoInsuficienteException {
        if (monto > saldo) {
            throw new SaldoInsuficienteException("Saldo insuficiente.");
        }
        saldo -= monto;
    }
	
	public static void main(String[] args) {
		CuentaBancaria cuenta = new CuentaBancaria();
		cuenta.setNumeroCuenta(111);
		cuenta.setTitular("lola");
		
		//mismo hashcode
		System.out.println(cuenta.hashCode());
		System.out.println(cuenta.equals(cuenta));
		
		CuentaBancaria cuenta2 = new CuentaBancaria();
		cuenta2.setNumeroCuenta(111);
		cuenta.setTitular("pepe");
		
		//mismo hashcode
		System.out.println(cuenta2.hashCode());
		//exception
		try {
			cuenta.retirar(2000);
		}catch(SaldoInsuficienteException e) {
			System.out.println("Error: " + e);
		}
	}	
}
