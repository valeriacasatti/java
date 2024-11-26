package com.coderhouse;

public class EjerciciosBasicosAvanzados {

	public static void main(String[] args) {

		//Simula un lanzamiento de tres dados y verifica si la suma de los resultados es mayor que 10.
		int dado1 = (int)(Math.random() * 6) + 1;
		int dado2 = (int)(Math.random() * 6) + 1;
		int dado3 = (int)(Math.random() * 6) + 1;
		int suma = dado1 + dado2 + dado3;
		System.out.println(dado1 + " + " + dado2 + " + " + dado3 + " = " + suma);
		String resultado = suma > 10 ? "La suma de los dados es mayor que 10" : "La suma de los dados es menor que 10";
		System.out.println(resultado);
		
		//Simula una ruleta de colores: genera un número aleatorio del 1 al 5 y asigna un color.
		int ruleta = (int)(Math.random() *5) + 1;
		
		String colores = switch(ruleta) {
			case 1 -> "Rojo";
			case 2 -> "Amarillo";
			case 3 -> "Azul";
			case 4 -> "Naranja";
			case 5 -> "Verde";
			default -> "Invalido";
		};
		
		System.out.println("Numero " + ruleta + " -> " + colores);
		
		//Calcula el descuento en una tienda dependiendo del tipo de cliente: 1. Normal (sin descuento), 2. Miembro (10% de descuento), 3. VIP (20% de descuento).
		String cliente = "normal";
		String tipo = cliente.toLowerCase() == "vip" ? "20% de descuento" : cliente.toLowerCase() == "miembro" ? "10% de descuento" : cliente.toLowerCase() == "normal" ? "Sin descuento" : "Cliente no registrado";
		System.out.println(tipo);
		
		//Evalúa el clima: genera un número aleatorio y asigna un estado del tiempo (soleado, nublado, lluvioso, nevando).
		int numeroTiempo = (int)(Math.random() * 4) + 1;
		String tiempo = switch(numeroTiempo) {
			case 1 -> "soleado";
			case 2 -> "nublado";
			case 3 -> "lluvioso";
			case 4 -> "nevando";
			default -> "invalido";
		};
		
		System.out.println("El dia esta " + tiempo);
		
		//Determina el ganador de un juego de piedra, papel o tijera usando números aleatorios y switch.
		// 1: Piedra, 2: Papel, 3: Tijera
		int jugador1 = (int)(Math.random() * 3) + 1; 
		int jugador2 = (int)(Math.random() * 3) + 1;
		
		String ganador = switch(jugador1 - jugador2) {
			case 0 -> "Empate";
			case -1,2 -> "Jugador 2 gana";
			default -> "Jugador 1 gana";
		};
		
		System.out.println("Jugador 1: " + jugador1 + " / Jugador 2: " + jugador2);
		System.out.println(ganador);
	
		//Simula un juego de adivinanza: el usuario tiene que adivinar un número entre 1 y 5 generado aleatoriamente.
		int adivinanza = (int)(Math.random() * 5) + 1; 
		int numero = 5;
		
		String resultadoAdivinanza = adivinanza == numero ? "Adivinaste!" : "No adivinaste :(";
		System.out.println(adivinanza + " / " + numero + ": " + resultadoAdivinanza);
		
		//Crea un programa que asigne una beca: si la nota es >= 85 y la edad < 25, el estudiante recibe una beca.
		int nota = 90;
		int edad = 30;
		
		String beca = nota >= 85 && edad >25 ? "Beca asignada" : "No puedes acceder a la beca";
		System.out.println(beca);
		
		//Genera dos números aleatorios entre 1 y 100 y muestra cuál es mayor.
		int numero1 =  (int)(Math.random() * 100) + 1; 
		int numero2 =  (int)(Math.random() * 100) + 1; 
		
		String mayor = numero1 > numero2 ? numero1 + " es mayor que " + numero2 : numero2 + " es mayor que " + numero1;
		System.out.println(mayor);

		//Genera un número aleatorio entre 1 y 100 y evalúa si es mayor que 75 usando un operador ternario.
		String mayorQue75 = numero1 > 75 ? numero1 + " es mayor que 75" : numero1 + " NO es mayor que 75";
		System.out.println(mayorQue75);
		
		//Simula un juego de dados: si la suma de dos dados es 7 o 11, el jugador gana.
		int suma2 = dado1 + dado2;
		System.out.println(dado1 + " + " + dado2 + " = " + suma2);
		String resultado2 = suma2 == 7 || suma2 == 11 ? "Ganaste" : "Perdiste";
		System.out.println(resultado2);
	}

}
