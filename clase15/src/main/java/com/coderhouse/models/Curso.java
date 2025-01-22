package com.coderhouse.models;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
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
@Schema(description="Modelo de curso", title="Curso")

@Entity
@Table(name = "cursos")
public class Curso {

	@Schema(description="ID del curso", requiredMode=Schema.RequiredMode.REQUIRED, example="1")
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Schema(description="Nombre del curso", requiredMode=Schema.RequiredMode.REQUIRED, example="Java")
	@Column(nullable=false)
	private String nombre;
	
	@ManyToMany (fetch = FetchType.EAGER)
	// genera una nueva tabla mostrando las dos tablas relacionadas
	@JoinTable(
			//la nueva tabla se va a llamar "curso_alumno"
			name = "curso_alumno",
			// primera columna indica el id del curso
			joinColumns = @JoinColumn(name = "curso_id"),
			//segunda columna indica el id del alumno
			inverseJoinColumns = @JoinColumn(name = "alumno_id"))
	@JsonIgnore
	private List<Alumno> alumnos = new ArrayList<>();
	
	@Schema(description="Categoria del curso", requiredMode=Schema.RequiredMode.REQUIRED, example="Backend")
	@ManyToOne(fetch= FetchType.EAGER)
	private Categoria categoria;


}
