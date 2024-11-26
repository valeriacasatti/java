package com.coderhouse;

public class EjerciciosMathRandom {

	public static void main(String[] args) {

		//Genera un número aleatorio entre 1 y 10 y muestra un mensaje si es mayor que 5.
		int aleatorio = 0;
		int minimo = 1;
		int maximo = 10;
				
		int rango = maximo - minimo + 1; 
				
		aleatorio = (int) (Math.random() * rango ) + minimo;
		
		if(aleatorio > 5) {			
			System.out.println(aleatorio + " es mayor que 5");
		}
		
		//Simula el lanzamiento de un dado con Math.random() y muestra el resultado.
		int maximoDado = 6;
		
		int rangoDado = maximoDado - minimo + 1;
		aleatorio = (int) (Math.random() * rangoDado ) + minimo;
		
		System.out.println("Dado: " + aleatorio);
		
		
		//Genera un número aleatorio entre 0 y 100 y determina si es mayor, menor o igual a 50.
		int maximo2 = 100;
		int rango2 = maximo2 - minimo + 1;
		
		aleatorio = (int) (Math.random() * rango2 ) + minimo;
		
		if(aleatorio <50) {
			System.out.println(aleatorio + " es menor a 50");
		} else if (aleatorio >50) {
			System.out.println(aleatorio + " es mayor a 50");
		}else {
			System.out.println(aleatorio + " es igual a 50");
		}
		
		//Simula una moneda (cara o cruz) usando Math.random().
		int cara = 1, cruz = 2;
		int rango3 = cruz - cara +1;
		
		int caraCruz = (int) (Math.random() * rango3 ) + cara;
		
		if(caraCruz == 1) {
			System.out.println("Cara");
		}else {
			System.out.println("Cruz");
		}
		
		//Genera un número aleatorio entre 1 y 100 y determina si es múltiplo de 10.
		int num = (int)(Math.random() * 100) + 1;
		System.out.println(num % 10 == 0 ? num + " es múltiplo de 10" : num + " no es múltiplo de 10");
		
	}

}
