package com.ejerciciosII;

import com.ejerciciosII.interfaces.OperableInterface;

public class Restar implements OperableInterface{	

	@Override
	public void operar(int num1, int num2) {
		int resultado = num1 - num2;
		System.out.println(resultado);
	}
	
	public static void main(String[] args) {
		Restar resta = new Restar();
		resta.operar(6, 1);
	}

}
