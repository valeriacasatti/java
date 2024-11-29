package com.coderhouse;

public class EjerciciosConMath {

	public static void main(String[] args) {
		
		//Genera un número aleatorio entre 0 y 1 y muestra si es mayor o menor que 0.5.
		double numero = Math.random();
		if(numero < 0.5) {
			System.out.println(numero + " es menor que 0.5");
		}else {
			System.out.println(numero + " es mayor que 0.5");
		}
		
		//Simula un lanzamiento de un dado y muestra el resultado.
		int dado = (int) (Math.random() * 6) + 1;
		System.out.println(dado);
		
		//Genera un número aleatorio entre 1 y 100 y muestra si es par o impar.
		int aleatorio = (int) (Math.random() * 100) + 1;
		if(aleatorio % 2 == 0) {
			System.out.println(aleatorio + " es par");
		}else {
			System.out.println(aleatorio + " es impar");
		}
		
		//Simula una moneda y muestra "Cara" o "Cruz" dependiendo del resultado.
		int moneda = (int) (Math.random() *2 ) +1;
		if(moneda == 1) {
			System.out.println("cara");
		}else {
			System.out.println("cruz");
		}
		
		//Genera un número aleatorio entre -50 y 50 y determina si es positivo o negativo.
		int minimo = -50;
		int maximo = 50;
		int rango = maximo - minimo + 1; 
		int aleatorio2 = (int) (Math.random() * rango ) + minimo;
		if(aleatorio2 < 0) {
			System.out.println(aleatorio2 + " es negativo");
		}else {
			System.out.println(aleatorio2 + " es positivo");
		}
		
		//Simula un lanzamiento de dos dados y muestra si la suma es mayor que 7.
		int dado2 = (int) (Math.random() * 6) + 1;
		int sumaDados = dado + dado2;
		if(sumaDados > 7) {
			System.out.println(sumaDados + " es mayor a 7");
		}else if(sumaDados < 7){
			System.out.println(sumaDados + " es menor a 7");
		}else {
			System.out.println(sumaDados + " es 7");
		}
		
		//Genera 10 números aleatorios entre 1 y 100 y muestra el mayor.
		int mayor =  Integer.MIN_VALUE; // Inicializamos con el valor más bajo posible
        System.out.println("numeros generados: ");
        
        for(int i = 0; i < 10; i++) {
			int num = (int) (Math.random() * 100) + 1;
			System.out.println(num + " ");
			if(num > mayor) {
				mayor = num;
			}
		}
		System.out.println(mayor + " es el mayor");
		
		//Genera un número aleatorio y verifica si está entre 10 y 20.
		if(aleatorio <20 && aleatorio >10) {
			System.out.println(aleatorio + " esta entre 10 y 20");
		}
		
		//Simula un juego de adivinanza en el que el usuario debe adivinar un número generado aleatoriamente entre 1 y 50.
		int adivinanza = (int) (Math.random() *50 ) + 1;
		int usuario = 3;
		if(usuario == adivinanza) {
			System.out.println("adivinaste :)");
		}else {
			System.out.println("no adivinaste :(");
		}
		
		//Genera números aleatorios hasta que el número sea divisible por 7 y muestra cuántos intentos fueron necesarios.
		int intentos = 0;
		int num;
		
		do {
			num = (int) (Math.random() * 100) + 1;
			intentos++;
			System.out.println("intento numero " + intentos + ": " + num);
		} while(num % 7 != 0);
		
		System.out.println("¡Se encontró un número divisible por 7: " + num + "!");
        System.out.println("Número de intentos: " + intentos);
	}

}
