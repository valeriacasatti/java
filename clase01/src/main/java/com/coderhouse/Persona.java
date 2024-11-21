package com.coderhouse;

//Crear una clase Persona que tenga variables primitivas como edad y altura.

public class Persona {
	//Definir valores
		private int edad;
		private float altura;
		
		//Inicializar atributos
		public Persona(int edad, float altura) {
			this.edad = edad;
			this.altura = altura;
		}
		
		//Metodos para acceder y modificar valores
		public int getEdad() {
			return edad;
		}
		public void setEdad(int edad) {
			this.edad = edad;
		}
		
		public float getAltura() {
			return altura;
		}
		public void setAltura(float altura) {
			this.altura = altura;
		}
		
		//Metodo para mostrar la informacion
		public void mostrarInformacion() {
			System.out.println("edad: " + edad + " anos");
			System.out.println("altura: " + altura + " metros");
		}

	public static void main(String[] args) {
		//Instancia de persona
				Persona persona = new Persona(24, 1.65f);
				//Mostrar datos
				persona.mostrarInformacion();
				
				//Modificar valores
				persona.setEdad(30);
				persona.setAltura(1.70f);
				
				//Mostrar informacion actualizada
				System.out.println("Datos actualizados: ");
				persona.mostrarInformacion();

	}

}
