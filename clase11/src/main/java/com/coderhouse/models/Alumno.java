package com.coderhouse.models;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

@Entity
@Table(name = "alumnos") // genera una tabla
public class Alumno {

	@Id //asigna la variable como Primary Key
	@GeneratedValue(strategy = GenerationType.IDENTITY) // autoincremental
	private Long id;
	
	@Column(name = "nombre") // genera una columna
	private String nombre;
	
	@Column(name = "apellido")
	private String apellido;
	
	@Column(unique = true, nullable = false) // unico y no nulo
	private int dni;
	
	@Column(unique = true, nullable = false)
	private String legajo;
	
	//indica que el tipo de relacion es many to many
	//mappea la tabla alumnos y envia la informacion a cursos
	@ManyToMany(mappedBy = "alumnos", fetch = FetchType.EAGER)
	private List<Curso> cursos = new ArrayList<>();
	
	private LocalDateTime createdAt;
		
}