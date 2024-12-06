package com.ejercicios;

//Define una constante IVA en una clase Factura y úsala en un método para calcular el total con impuestos.
public class Factura {
	
	private final double IVA = 0.21;
	
	public double calcularTotal(double monto) {
		return monto + (monto * IVA);
	}
	
	//Crea una clase Factura con un atributo total y define un setter que valide que el total es mayor que 0.
	private double total;
	
	public double getTotal() {
		return this.total;
	}
	public void setTotal(double total) {
		if(total < 0) {
			System.out.println("El total es menor que cero");
		}else {
			System.out.println("El total es: " + (this.total = total));
		}
	}


	public static void main(String[] args) {
		Factura factura = new Factura();		
		factura.setTotal(50);
		System.out.println("El precio final con impuestos incluidos es: $" + factura.calcularTotal(factura.getTotal()));
	}

}
