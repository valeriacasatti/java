package com.coderhouse.exceptions;

public class PerroException extends Exception {

	//el constructor siempre tiene mismo nombre que la clase
	public PerroException(String mensaje) {
		super(mensaje);
	}
}
