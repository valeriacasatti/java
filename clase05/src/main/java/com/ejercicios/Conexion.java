package com.ejercicios;

import java.sql.SQLException;

//Crea un método abrirConexion que lanza una excepción SQLException si falla la conexión a la base de datos.
public class Conexion {
	
	public static void abrirConexion() throws SQLException{
		boolean conexionExitosa = false;
		if(conexionExitosa == false) {
			throw new SQLException("Error en la conexion");
		}
	}

	public static void main(String[] args) {
		try {			
			Conexion.abrirConexion();
		}catch(SQLException e) {
			System.out.println("Error: " + e); 
		}
	}

}
