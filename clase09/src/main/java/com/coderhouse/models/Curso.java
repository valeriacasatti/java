package com.coderhouse.models;

import java.util.ArrayList;
import java.util.List;

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

@Entity
@Table(name = "cursos")
public class Curso {

	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
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
	private List<Alumno> alumnos = new ArrayList<>();
	
	@ManyToOne(fetch= FetchType.EAGER)
	private Categoria categoria;
	
	public Categoria getCategoria() {
		return this.categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Alumno> getAlumnos() {
		return this.alumnos;
	}

	public void setAlumnos(List<Alumno> alumnos) {
		this.alumnos = alumnos;
	}

	@Override
	public String toString() {
		return "Curso [id=" + id + ", nombre=" + nombre + ", alumnos=" + alumnos + "]";
	}

	public Curso() {
		super();
	}
	
	public Curso(String nombre) {
		this();
		this.nombre = nombre;
	}
	
	
	
}
