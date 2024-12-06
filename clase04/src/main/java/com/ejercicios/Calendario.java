package com.ejercicios;

//Crea una constante MESES_ANO en una clase Calendario y úsala en un método que calcule cuántos meses faltan para fin de aco.
public class Calendario {

	private final int MESES_ANIO = 12;
	private int mesActual = 4;
	public int cuantosMesesParaFinDeAnio(int mesActual) {
		return MESES_ANIO - mesActual;
	}
	
	public static void main(String[] args) {
		Calendario c2024 = new Calendario();
		System.out.println("Mes " + c2024.mesActual + ", faltan " + c2024.cuantosMesesParaFinDeAnio(c2024.mesActual) + " meses para que termine el año");
	}

}
