package com.coderhouse;

public class clase01 {

	public static void main(String[] args) {
		System.out.println("anda");
		
		//Declaracion de variables
		byte variableA = 10;
		double variableConDecimales = 1111.1d;
		char miPrimerChar = 'v';
		boolean verdadero = true;
		long numeroLargo = 2222222222222222222L;
		String saludo = "hola mundo";
		
		System.out.println(saludo);
		System.out.println(saludo + ' ' + miPrimerChar);
		
		int numeroUno = 123;
		int numeroDos = 321;
		
		System.out.println(numeroUno + numeroDos);
		
		//Incremento
		int contador = 0;
		System.out.println(contador);
		
		contador++;
		System.out.println(contador);
		
		//Decremento
		contador--;
		System.out.println(contador);
		
		//ejercicios
		//Crear una variable entera que almacene la edad de un usuario.
		byte edad = 24;
		//Definir una constante para el número de días en una semana.
		final int DIAS_EN_SEMANA = 7;
		//Declarar una variable de tipo double para almacenar el precio de un producto.
		double precioProducto = 10.5d;
		//Crear una variable booleana que indique si un estudiante está aprobado o no.
		boolean aprobado = true;
		//Utilizar una variable de tipo char para almacenar la inicial del nombre de una persona.
		char initial = 'V';
		//Crear un arreglo de enteros que almacene las notas de 5 estudiantes.
		int[] notas = new int[5];
		notas[0] = 10;
		notas[1] = 5;
		notas[2] = 8;
		notas[3] = 2;
		notas[4] = 9;
		//Definir una variable de tipo String que almacene el nombre completo de una persona.
		String nombre = "Valeria Casatti";
		//Crear una variable float para almacenar el peso de una persona.
		float peso = 50.5f;
		//Declarar una constante para representar el número PI (3.14).
		final double PI = 3.14159265359;
		//Crear una constante que contenga el valor máximo de estudiantes en un aula.
		final int MAX_ESTUDIANTES = 30;
		//Realizar una suma de dos números enteros y mostrar el resultado.
		int uno = 1;
		int dos = 2;
		int resultadoSuma = uno + dos;
		System.out.println("suma entre dos numeros enteros: " + resultadoSuma);
		//Restar dos números de tipo double y mostrar el resultado.
		double tres = 3.3d;
		double cuatro = 4.1d;
		double resultadoResta = tres - cuatro;
		System.out.println("resta entre dos numeros double: " + resultadoResta);
		//Multiplicar dos números y mostrar el resultado en pantalla.
		int cinco = 5;
		float seis = 6.6f;
		float resultadoMultiplicacion = cinco * seis;
		System.out.println("multiplicacion entre dos numeros: " + resultadoMultiplicacion);
		//Dividir dos números y manejar la excepción de división por cero.
		int numerador = 8;
		int denominador = 2;
		if(denominador == 0) {
			System.out.println("error: no se puede dividir por cero");
		}else{
			int resultadoDivision = numerador / denominador;
			System.out.println("division entre dos numeros: " + resultadoDivision);
		};
		//Usar el operador % para encontrar el residuo de una división.
		double resultadoModulo = tres % cinco;
		System.out.println("residuo de una division: " + resultadoModulo);
		//Comparar dos enteros y mostrar si el primero es mayor que el segundo.
		int a = 10, b = 4;
		if(a < b) {
			System.out.println("a es mayor a b");
		}else {
			System.out.println("a NO es mayor a b");
		}
		//Verificar si un número es par usando el operador %.
		int resultadoPar = cinco % 2;
		if(resultadoPar == 0) {
			System.out.println("el numero es par");
		}else {
			System.out.println("el numero NO es par");
		}
		//Comparar dos String para ver si son iguales.
		String primerString = "lorem ipsum";
		String segundoString = "lorem ipsum";
		if(primerString == segundoString) {
			System.out.println("ambos strings son iguales");
		}else {
			System.out.println("los strings NO son iguales");
		}
		//Crear una condición que verifique si un estudiante está aprobado (nota >= 6).
		if(notas[2] >= 6) {
			System.out.println("aprobado");
		}else {
			System.out.println("desaprobado");
		}
		//Utilizar operadores lógicos para verificar si un número está entre 1 y 10.
		if(a >= 1 && a <= 10) {
			System.out.println("el numero " + a + " esta entre 1 y 10");
		}else {
			System.out.println("el numero " + a + " no se encuentra entre 1 y 10");
		}
		//Escribir un código que declare variables siguiendo las convenciones de nomenclatura (camelCase).
		String variableCamelCase = "variable representada con un nombre camelCase";
		int variableInt = 1;
		//Declarar un arreglo de String para almacenar los nombres de los días de la semana.
		String[] diasSemanales = new String[7];
		diasSemanales[0] = "Lunes";
		diasSemanales[1] = "Martes";
		diasSemanales[2] = "Miercoles";
		diasSemanales[3] = "Jueves";
		diasSemanales[4] = "Viernes";
		diasSemanales[5] = "Sabado";
		diasSemanales[6] = "Domingo";
	}
	//Organizar un código en métodos para mejorar su legibilidad.
	public int sumar (int a, int b) {
		int resultado = a + b;
		return resultado;
	}

}
