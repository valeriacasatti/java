package com.coderhouse;

public class EjerciciosConSwitch {

	public static void main(String[] args) {
		//Asigna un día de la semana según un número del 1 al 7.
		int numeroDia = 7;
		String nombreDia = null;
		
		switch(numeroDia) {
			case 1: 
				nombreDia = "Lunes";
				break;
			case 2:
				nombreDia = "Martes";
				break;
			case 3:
				nombreDia = "Miercoles";
				break;
			case 4:
				nombreDia = "Jueves";
				break;
			case 5:
				nombreDia = "Viernes";
				break;
			case 6:
				nombreDia = "Sabado";
				break;
			case 7:
				nombreDia = "Domingo";
				break;
			default:
				nombreDia = "Dia invalido";
				break;
		}
		
		System.out.println("El dia de la semana correspondiente al numero " + numeroDia + " es " + nombreDia);
		
		//Muestra el nombre de un mes según un número del 1 al 12.
		int numeroMes = 4;
		String nombreMes = null;
		
		switch(numeroMes) {
			case 1:
				nombreMes = "Enero";
				break;
			case 2:
				nombreMes = "Febrero";
				break;
			case 3:
				nombreMes = "Marzo";
				break;
			case 4:
				nombreMes = "Abril";
				break;
			case 5:
				nombreMes = "Mayo";
				break;
			case 6:
				nombreMes = "Junio";
				break;
			case 7:
				nombreMes = "Julio";
				break;
			case 8:
				nombreMes = "Agosto";
				break;
			case 9:
				nombreMes = "Septiembre";
				break;
			case 10:
				nombreMes = "Octubre";
				break;
			case 11:
				nombreMes = "Noviembre";
				break;
			case 12:
				nombreMes = "Diciembre";
				break;
			default:
				nombreMes = "Mes invalido";
				break;
		}
		
		System.out.println(nombreMes + " es el mes " + numeroMes);

		//Determina el nombre de una estación del año según un número (1: invierno, 2: primavera, 3: verano, 4: otoño).
		int numeroEstacion = 2;
		String nombreEstacion = null;
		
		switch(numeroEstacion) {
			case 1:
				nombreEstacion = "Invierno";
				break;
			case 2:
				nombreEstacion = "Primavera";
				break;
			case 3:
				nombreEstacion = "Verano";
				break;
			case 4:
				nombreEstacion = "Otoño";
				break;
			default:
				nombreEstacion = "Estacion inexistente";
				break;
		}
		
		System.out.println("El numero de estacion " + numeroEstacion + " es " + nombreEstacion);
		
		//Calcula operaciones aritméticas básicas (suma, resta, multiplicación, división) según un operador ingresado (+, -, *, /).
		double operando1 = 10, operando2 = 5;
		char operador = '+';
		
		switch(operador) {
			case '+':
				System.out.println(operando1 + " + " + operando2 + " = " + (operando1 + operando2) );
				break;
			case'-':
				System.out.println(operando1 + " - " + operando2 + " = " + (operando1 - operando2));
				break;
			case'*':
				System.out.println(operando1 + " * " + operando2 + " = " + (operando1 * operando2));
				break;
			case'/':
				System.out.println(operando1 + " / " + operando2 + " = " + (operando1 / operando2));
				break;
			default:
				System.out.println("Operador invalido");
				break;
		}
		
		//Verifica el tipo de fruta según su código: 1: manzana, 2: plátano, 3: naranja, 4: uva.
		int codigo = 2;
		String fruta = null;
		
		switch(codigo) {
			case 1:
				fruta = "Manzana";
				break;
			case 2:
				fruta = "Platano";
				break;
			case 3:
				fruta = "Naranja";
				break;
			case 4:
				fruta = "Uva";
				break;
			default:
				fruta = "Codigo invalido";
				break;
		}
		
		System.out.println("El codigo " + codigo + " es " + fruta);
		
	}

}
