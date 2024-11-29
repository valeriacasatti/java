package com.coderhouse;

public class EjerciciosConOperadores {

	public static void main(String[] args) {

		//Determina si un número es positivo y par usando &&.
		int numero = 12;
		if(numero > 0 && numero % 2 == 0) {
			System.out.println(numero + " es positivo y par");
		}else {
			System.out.println(numero + " no es positivo o no es par");
		}
		
		//Verifica si una persona es mayor de edad o tiene un permiso especial usando ||.
		int edad = 17;
		boolean permisoEspecial = true;
		if(edad >= 18 || permisoEspecial) {
			System.out.println("eres mayor o tienes permiso especial");
		}else {
			System.out.println(" no eres mayor o no tienes permiso especial");
		}
		
		//Comprueba si un número no es negativo usando !.
		int numeroPositivo = 10;
		if(!(numeroPositivo >0)) {
			System.out.println("el numero es negativo");
		}else {
			System.out.println("el numero es positivo");
		}
		
		//Determina si una persona puede entrar a una película (mayor de 18 y tiene boleto) usando &&.
		boolean tieneBoleto = true;
		if(edad >=18 && tieneBoleto) {
			System.out.println("puedes entrar");
		}else {
			System.out.println("no puedes entrar");
		}
		
		//Verifica si un número está en un rango (mayor que 10 y menor que 20) usando &&.
		if(numero <=20 && numero >=10) {
			System.out.println(numero + " esta dentro del rango entre 10 y 20");
		}else {
			System.out.println(numero + " no esta dentro del rango");
		}
		
		//Determina si un número no es par usando !.
		int numeroPar = 2;
		if(!(numeroPar % 2 == 0)) {
			System.out.println("es impar");
		}else {
			System.out.println("es par");
		}
		
		//Verifica si una cadena no está vacía y su longitud es mayor que 5 usando &&.
		String cadena = "holaaa";
		if(!cadena.isEmpty() && cadena.length()>5) {
			System.out.println("condicion verdadera");
		}else {
			System.out.println("condicion falsa");
		}
		
		//Comprueba si un número es divisible por 2 o por 3 usando ||.
		if(numero % 2 == 0 || numero % 3 == 0) {
			System.out.println(numero + " es divisible por 2 y/o por 3");
		}else {
			System.out.println(numero + " NO es divisible por 2 y/o por 3");
		}
		
		//Determina si una cadena no contiene un carácter específico usando !.
		if(!(cadena.contains("p"))) {
			System.out.println(cadena + " NO contiene ese caracter");
		}else {
			System.out.println(cadena + " contiene ese caracter");
		}
		
		//Verifica si un número es impar o mayor que 100 usando ||.
		if(numero % 2 != 0 || numero > 100) {
			System.out.println(numero + " es impar o mayor que 100");
		}else {
			System.out.println(numero + " no es impar o mayor que 100");

		}
	}

}
