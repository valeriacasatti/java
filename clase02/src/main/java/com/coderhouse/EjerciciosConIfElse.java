package com.coderhouse;

public class EjerciciosConIfElse {

	public static void main(String[] args) {
		//Verifica si un número es par o impar y muestra un mensaje correspondiente.
		int numero = 10;
		
		if( numero == 0) {
			System.out.println("El numero " + numero + " es cero"); 
		} else if (numero % 2 == 0){
			System.out.println("El numero " + numero + " es par");
		} else {
			System.out.println("El numero " + numero + " es impar");
		}
		
		//Determina si una persona puede votar (mayor de 18 años) o no.
		int edad = 18;
		
		if(edad >= 18 && edad <= 100) {
			System.out.println("Eres mayor de edad");
		} else if (edad > 0 && edad < 18) {
			System.out.println("Eres menor de edad"); 
		} else {
			System.out.println("El numero ingresado no es valido");	
		}
		
		//Verifica si una letra es vocal o consonante (para simplificar, considera solo las letras en minúsculas).
		String letra = "A";
		letra = letra.toLowerCase();
		
		if(letra.equals("a")  || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u")) {
			System.out.println("La letra " + letra + " es vocal");
		} else {
			System.out.println("La letra " + letra + " es consonante");
		}
		
		//Revisa si un número es positivo, negativo o cero.
		if(numero < 0) {
			System.out.println(numero + " es negativo");
		} else if (numero > 0) {
			System.out.println(numero + " es positivo");
		} else {
			System.out.println(numero + " es cero");
		}
			
		//Determina si un año es bisiesto. (Pista: un año es bisiesto si es divisible por 4 y no por 100, excepto si es divisible por 400).
		int anio = 2024;
		if(anio % 4 == 0 && anio % 100 != 0 && anio % 400 == 0) {
			System.out.println(anio + " es un año bisiesto.");
		} else { 
			System.out.println(anio + " NO es un año bisiesto.");
		}
		
		//Determina la categoría de una persona según su edad: bebé (<2), niño (2-12), adolescente (13-18), adulto (19-64), anciano (65+).
		if(edad <2) {
			System.out.println("Bebe");
		} else if (edad >=2 && edad <=12 ) {
			System.out.println("Niño");
		} else if (edad >= 13 && edad <= 18){
			System.out.println("Adolescente");
		} else if (edad >= 19 && edad <= 64) {
			System.out.println("Adulto");
		} else {
			System.out.println("Anciano");
		}
		
		//Calcula el precio de una entrada al cine según la edad: niño (5€), adulto (10€), anciano (7€).
		if (edad >=2 && edad <=12 ) {
			System.out.println("La entrada para niños sale 5€");
		} else if (edad >= 13 && edad <= 64 ){
			System.out.println("La entrada para adultos sale 10€");
		} else {
			System.out.println("La entrada para ancianos sale 7€");
		}
		
		//Asigna una nota en función de la calificación: A (>=90), B (>=80), C (>=70), D (>=60), F (<60).
		int nota = 90;
		
		if(nota >= 90) {
			System.out.println("La calificacion es A");
		} else if (nota >= 80) {
			System.out.println("La calificacion es B");
		} else if (nota >= 70) {
			System.out.println("La calificacion es C");
		} else if (nota >= 60){
			System.out.println("La calificacion es D");
		} else {
			System.out.println("La calificacion es F");
		}
		
		//Determina el nivel de peligro de un volcán según su estado (dormido, activo, erupción inminente).
		String volcan = "erupcion inminente";
		
		if(volcan == "dormido") {
			System.out.println("El peligro es bajo");
		} else if (volcan == "activo") {
			System.out.println("El peligro es medio");
		} else if (volcan == "erupcion inminente") {
			System.out.println("El peligro es alto");
		} else {
			System.out.println("Valor invalido");
		}
		
	}

}
