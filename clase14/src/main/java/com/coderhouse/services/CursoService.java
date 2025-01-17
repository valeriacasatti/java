package com.coderhouse.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coderhouse.models.Curso;
import com.coderhouse.models.Categoria;
import com.coderhouse.repositories.CategoriaRepository;
import com.coderhouse.repositories.CursoRepository;

import jakarta.transaction.Transactional;

@Service
public class CursoService {
	
	@Autowired
	private CursoRepository cursoRepository;
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	public List<Curso> getAllCursos() {
		return cursoRepository.findAll();
	}
	
	public Curso findById(Long id) {
		return cursoRepository.findById(id).orElseThrow(()-> new IllegalArgumentException("Curso no encontrado"));
	}
	
	@Transactional
	public Curso saveCurso(Curso curso) {
		return cursoRepository.save(curso);
	}
	
	@Transactional
	public Curso updateCursoById(Long id, Curso cursoInfo) {
		Curso curso = cursoRepository.findById(id).orElseThrow(()-> new IllegalArgumentException("Curso no encontrado"));
		curso.setNombre(cursoInfo.getNombre());
		return cursoRepository.save(curso);
	}
	
	public void deleteCursoById(Long id) {
		if(!cursoRepository.existsById(id)) {
			throw new IllegalArgumentException("Curso no encontrado");
		}
		cursoRepository.deleteById(id);
	}
	
	@Transactional
	public Curso AsignarCategoriaCurso(Long cursoId, Long categoriaId) {
		Categoria categoria = categoriaRepository.findById(categoriaId).orElseThrow(()-> new IllegalArgumentException("Categoria no encontrada"));
		Curso curso = cursoRepository.findById(cursoId).orElseThrow(()-> new IllegalArgumentException("Curso no encontrado"));
		curso.setCategoria(categoria);
		return cursoRepository.save(curso);
	}
	
	
	
	
	
	
	
	
}
