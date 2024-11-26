package com.coderhouse;

public class EjerciciosCombinados {

	public static void main(String[] args) {

		//Determina si un número es positivo, negativo o cero usando un operador ternario.
		int numero = -8;
		boolean positivo = numero > 0;
		boolean negativo = numero < 0;
		
		String positivoONegativo = positivo ? numero + " es positivo" : negativo ? numero + " es negativo" : numero + " es cero";
		System.out.println(positivoONegativo);
		
		//Simula un semáforo. Muestra el estado (verde, amarillo, rojo) según un número aleatorio del 1 al 3.
		int numeroSemaforo = (int)(Math.random() * 3) + 1;
		String semaforo = switch(numeroSemaforo) {
			case 1 ->  "verde";
			case 2-> "amarillo";
			case 3 -> "rojo";
			default -> "color invalido";
		};
		
		System.out.println(numeroSemaforo + ": el semaforo esta en " + semaforo);
		
		//Crea un programa que simule una lotería. Genera un número aleatorio y verifica si es igual a un número predeterminado.
		int numeroPredeterminado = 2;
		int numeroLoteria = (int) (Math.random() * 10) + 1;
		
		if(numeroPredeterminado == numeroLoteria) {
			System.out.println(numeroLoteria + ", loteria!!");
		}else {
			System.out.println(numeroLoteria + ", keep trying");
		}
		
		//Genera un número aleatorio entre 1 y 100 y evalúa si es divisible por 3 o por 5.
		int numeroDivisible = (int)(Math.random() * 100) + 1;
		if(numeroDivisible % 3 == 0 ) {
			System.out.println(numeroDivisible + " es divisible por 3");
		} else if(numeroDivisible % 5 == 0) {
			System.out.println(numeroDivisible + " es divisible por 5");
		}else {
			System.out.println(numeroDivisible + " no es divisible por 3 ni 5");
		}
		
		//Simula un dado y determina si el número obtenido es mayor o igual a 4.
		int dado = (int)(Math.random() * 6) + 1;
		
		if(dado > 4) {
			System.out.println("Dado: " + dado + ", es mayor a 4");
		} else if (dado == 4){
			System.out.println("Dado: " + dado + ", es igual a 4");
		} else {
			System.out.println("Dado: " + dado + ", es menor a 4");
		}
		
		//Genera un número aleatorio entre 1 y 100 y clasifícalo en categorías: bajo (<30), medio (>=30 y <=70), alto (>70).
		int numeroAleatorio = (int) (Math.random() * 100) + 1;
		if (numeroAleatorio <30) {
			System.out.println(numeroAleatorio + " es bajo");
		} else if( numeroAleatorio >= 30 && numeroAleatorio <= 70) {
			System.out.println(numeroAleatorio + " es medio");
		} else {
			System.out.println(numeroAleatorio + " es alto");
		}
		
		//Simula una adivinanza de un número entre 1 y 10. El usuario ingresa un número y el programa le dice si acertó o no.
		int numeroAdivinado = 1;
		int numeroAdivinanza = (int) (Math.random() * 10) + 1; 
		
		if(numeroAdivinado == numeroAdivinanza) {
			System.out.println(numeroAdivinado + " == " + numeroAdivinanza + ", adivinaste :)");
		} else {
			System.out.println(numeroAdivinado + " != " + numeroAdivinanza + ", no adivinaste :(");
		}
		
		//Genera un número aleatorio entre 1 y 50 y verifica si está en el rango de [20, 30].
		int numero50 = (int)(Math.random() * 50) + 1;
		if (numero50 >= 20 && numero50 <= 30) {
			System.out.println(numero50 + " esta entre 20 y 30");
		} else {
			System.out.println(numero50 + " NO esta dentro del rango");
		}
		
	}

}
