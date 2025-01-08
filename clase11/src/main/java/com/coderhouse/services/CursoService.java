package com.coderhouse.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coderhouse.models.Curso;
import com.coderhouse.repositories.CursoRepository;

import jakarta.transaction.Transactional;

@Service
public class CursoService {
	
	@Autowired
	private CursoRepository cursoRepository;
	
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
}
