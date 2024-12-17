package com.coderhouse.dao;

import org.springframework.stereotype.Service;

import com.coderhouse.models.Alumno;
import com.coderhouse.models.Categoria;
import com.coderhouse.models.Curso;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Service
public class DaoFactory {

	@PersistenceContext
	private EntityManager em;
	
	//metodos que me permiten persistir los datos	
	@Transactional // indica que es un metodo de transaccion, valida que el alumno persista
	public void persistirAlumno(Alumno alumno) {
		em.persist(alumno);
	}
	
	@Transactional
	public void persistirCurso(Curso curso) {
		em.persist(curso);
	}
	
	@Transactional
	public void persistirCategoria(Categoria categoria) {
		em.persist(categoria);
	}
	
	@Transactional
	public Curso getCursoById(Long cursoId) throws Exception {
		try {
			TypedQuery<Curso> query = em.createQuery("SELECT c FROM Curso c WHERE c.id = :id", Curso.class);
			return query.setParameter("id", cursoId).getSingleResult();
		} catch(Exception e) {
			throw new Exception("Curso inexistente");
		}
	}
	
	@Transactional
	public Categoria getCategoriaById(Long categoriaId) throws Exception{
		try {
			TypedQuery<Categoria> query = em.createQuery("SELECT ca FROM Categoria ca WHERE ca.id = :id", Categoria.class);
			return query.setParameter("id", categoriaId).getSingleResult();
		}catch(Exception e) {
			throw new Exception("Categoria inexistente");
		}
	}
	
	@Transactional
	public Alumno getAlumnoById(Long alumnoId) throws Exception{
		try {
			TypedQuery<Alumno> query = em.createQuery("SELECT a FROM Alumno a WHERE a.id = :id", Alumno.class);
			return query.setParameter("id", alumnoId).getSingleResult();
		}catch(Exception e) {
			throw new Exception("Alumno inexistente");
		}
	}
	
	@Transactional
	public void asignarCategoriaACurso(Long cursoId, Long categoriaId) throws Exception {
		try {
			
			//obtener el curso by id
			Curso curso = getCursoById(cursoId);
			if(curso == null) {
				throw new Exception("El curso con ID " + cursoId + " no existe");
			}
			
			//obtener categoria by id
			Categoria categoria = getCategoriaById(categoriaId);
			if(categoria == null) {
				throw new Exception("La categoria con ID " + categoriaId + " no existe");
			}
			
			curso.setCategoria(categoria);
			//persistir categoria
			em.merge(curso);
			
		} catch(Exception e) {
			e.printStackTrace(System.err);
		}
	}
}
