package com.ejerciciosII;

import com.ejerciciosII.abstractas.EmpleadoInterface;

public class EmpleadoTiempoCompleto extends EmpleadoInterface {

	@Override
	protected void calcularSalario(int tiempo, int salario) {
		int resultado = tiempo * salario;
		System.out.println("el empleado debe cobrar $" + resultado + " por trabajar " + tiempo + " horas");
	}

	public static void main(String[] args) {
		EmpleadoTiempoCompleto vendedor = new EmpleadoTiempoCompleto();
		vendedor.calcularSalario(4, 1000);
	}
}
