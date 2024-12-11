package com.ejerciciosII.abstractas;

//Crea una clase abstracta Empleado con un método abstracto calcularSalario(). Crea subclases EmpleadoTiempoCompleto y EmpleadoMedioTiempo que implementen el método.
public abstract class EmpleadoInterface {
	
	protected abstract void calcularSalario(int tiempo, int salario);
}
