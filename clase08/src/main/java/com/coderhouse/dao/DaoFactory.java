package com.coderhouse.dao;

import org.springframework.stereotype.Service;

import com.coderhouse.models.Alumno;
import com.coderhouse.models.Curso;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Service
public class DaoFactory {

	@PersistenceContext
	private EntityManager em;
	
	//metodos que me permiten persistir los datos
	//alumnos
	
	@Transactional // indica que es un metodo de transaccion, valida que el alumno persista
	public void persistirAlumno(Alumno alumno) {
		em.persist(alumno);
	}
	
	@Transactional
	public void persistirCurso(Curso curso) {
		em.persist(curso);
	}
}
