package com.ejerciciosII;

import com.ejerciciosII.abstractas.EmpleadoInterface;

public class EmpleadoMedioTiempo extends EmpleadoInterface {

	@Override
	protected void calcularSalario(int tiempo, int salario) {
		int resultado = (tiempo/2) * salario;
		System.out.println("el empleado debe cobrar $" + resultado + " por trabajar " + tiempo + " horas");
	}

	public static void main(String[] args) {
		EmpleadoMedioTiempo vendedor = new EmpleadoMedioTiempo();
		vendedor.calcularSalario(4, 1000);
	}

}
