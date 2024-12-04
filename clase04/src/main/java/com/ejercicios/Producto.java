package com.ejercicios;

//Crea una clase Producto con atributos nombre y precio, y un método para calcular el precio con impuestos.
public class Producto {
	
	private String nombre;
	private double precio;
	

	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return this.precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public double precioConImpuestos(double impuesto) {
		return precio + (precio * impuesto / 100);
	}
	//Crea una clase Producto con atributos nombre y precio, y métodos calcularPrecioConDescuento.
	public double precioConDescuento(double descuento) {
		return precio - (precio * descuento / 100);
	}

	public static void main(String[] args) {

		Producto nuevoProducto = new Producto();
		nuevoProducto.setNombre("Cuaderno");
		nuevoProducto.setPrecio(20.5);
		
		System.out.println("Precio con impuestos: " + nuevoProducto.precioConImpuestos(15));
		System.out.println("Precio con descuento: " + nuevoProducto.precioConDescuento(20));
	}

}
