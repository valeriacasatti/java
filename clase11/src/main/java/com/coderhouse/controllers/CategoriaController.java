package com.coderhouse.controllers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coderhouse.models.Categoria;
import com.coderhouse.services.CategoriaService;

@RestController
@RequestMapping("/api/categorias")

public class CategoriaController {

	@Autowired
	private CategoriaService categoriaService;
	
	@GetMapping
	public ResponseEntity<List<Categoria>> getAllCategorias(){
		try {
			List<Categoria> categorias = categoriaService.getAllCategorias();
			return ResponseEntity.ok(categorias);
		}catch(Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build(); 
		}
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Categoria> getCategoriaById(@PathVariable Long id){
		try {
			Categoria categoria = categoriaService.findById(id);
			return ResponseEntity.ok(categoria);
		}catch(IllegalArgumentException e) {
			return ResponseEntity.notFound().build(); 
		}catch(Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build(); 
		}
	}
	
	@PostMapping
	public ResponseEntity<Categoria> createCategoria(@RequestBody Categoria categoria){
		try {
			Categoria categoriaCreada = categoriaService.saveCategoria(categoria);
			return ResponseEntity.status(HttpStatus.CREATED).body(categoriaCreada);
		}catch(Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build(); 
		}
	}
}
