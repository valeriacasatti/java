package com.coderhouse.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coderhouse.models.Categoria;
import com.coderhouse.repositories.CategoriaRepository;

import jakarta.transaction.Transactional;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository categoriaRepository;
	
	public List<Categoria> getAllCategorias() {
		return categoriaRepository.findAll();
	}
	
	public Categoria findById(Long id) {
		return categoriaRepository.findById(id).orElseThrow(()-> new IllegalArgumentException("Categoria no encontrada"));
	}
	
	@Transactional
	public Categoria saveCategoria(Categoria categoria) {
		return categoriaRepository.save(categoria);
	}
}
