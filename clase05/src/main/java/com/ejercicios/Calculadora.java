package com.ejercicios;

//Crea un método calcularDivision que lanza una excepción ArithmeticException si se intenta dividir por cero.
public class Calculadora {
	
	public int calcularDivision(int numerador, int denominador) {
		if(denominador == 0) {
			throw new ArithmeticException("No se puede dividir por cero");
		}else {
			return numerador / denominador;
		}
	}
	
	//Crea un método convertirStringAEntero que lanza una excepción NumberFormatException si el formato es incorrecto.
	public static int convertirStringAEntero(String numero) {
        try {
            return Integer.parseInt(numero);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Formato incorrecto para convertir a entero.");
        }
    }

	public static void main(String[] args) {
		Calculadora division = new Calculadora();
		int resultado = division.calcularDivision(10, 2);
		System.out.println(resultado);
		System.out.println(Calculadora.convertirStringAEntero("56254"));
	}

}
