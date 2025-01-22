package com.coderhouse.models;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import io.swagger.v3.oas.annotations.media.Schema;
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
@Schema(description="Modelo de alumnos", title="Alumno")

@Entity
@Table(name = "alumnos") // genera una tabla
public class Alumno {

	@Schema(description="ID del alumno", requiredMode=Schema.RequiredMode.REQUIRED, example="1")
	@Id //asigna la variable como Primary Key
	@GeneratedValue(strategy = GenerationType.IDENTITY) // autoincremental
	private Long id;
	
	@Schema(description="Nombre del alumno", requiredMode=Schema.RequiredMode.REQUIRED, example="Valeria")
	@Column(name = "nombre") // genera una columna
	private String nombre;
	
	@Schema(description="Apellido del alumno", requiredMode=Schema.RequiredMode.REQUIRED, example="Casatti")
	@Column(name = "apellido")
	private String apellido;
	
	@Schema(description="DNI del alumno", requiredMode=Schema.RequiredMode.REQUIRED, example="25896457")
	@Column(unique = true, nullable = false) // unico y no nulo
	private int dni;
	
	@Schema(description="Legajo del alumno", requiredMode=Schema.RequiredMode.REQUIRED, example="L111")
	@Column(unique = true, nullable = false)
	private String legajo;
	
	//indica que el tipo de relacion es many to many
	//mappea la tabla alumnos y envia la informacion a cursos
	@Schema(description="Listado de cursos del alumno")
	@ManyToMany(mappedBy = "alumnos", fetch = FetchType.EAGER)
	private List<Curso> cursos = new ArrayList<>();
	
	@Schema(description="Fecha de alta del alumno", example="2025/01/17")
	private LocalDateTime createdAt;
		
}