package com.ejerciciosI;

//Crea una clase Producto con atributos nombre y precio. Agrega métodos para modificar y obtener sus valores. Implementa los métodos getNombre(), setNombre(), getPrecio(), y setPrecio().
public class Producto {
	
	private String nombre;
	private int precio;
	
	
	//obtener sus valores
	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPrecio() {
		return this.precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	//modificar sus valores
	public String updateNombre(String nuevoNombre) {
		return nombre = nuevoNombre;
	}
	public int updatePrecio(int nuevoPrecio) {
		return precio = nuevoPrecio;
	}


	public static void main(String[] args) {
		Producto miProducto = new Producto();
		miProducto.setNombre("celular");
		miProducto.setPrecio(9999);
		System.out.println("el producto " + miProducto.getNombre() + " sale $" + miProducto.getPrecio());

	}

}
