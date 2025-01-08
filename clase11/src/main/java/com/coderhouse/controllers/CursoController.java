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

import com.coderhouse.models.Curso;
import com.coderhouse.services.CursoService;


@RestController
@RequestMapping("/api/cursos")
public class CursoController {

	@Autowired
	private CursoService cursoService;
	
	@GetMapping
	public ResponseEntity<List<Curso>> getAllCursos(){
		try {
			List<Curso> cursos = cursoService.getAllCursos();
			return ResponseEntity.ok(cursos);
		}catch(Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Curso> getCursoById(@PathVariable Long id){
		try {
			Curso curso = cursoService.findById(id);
			return ResponseEntity.ok(curso);
		}catch(IllegalArgumentException e) {
			return ResponseEntity.notFound().build();
		}catch(Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
	
	@PostMapping
	public ResponseEntity<Curso> createCurso(@RequestBody Curso curso){
		try {
			Curso cursoCreado = cursoService.saveCurso(curso);
			return ResponseEntity.status(HttpStatus.CREATED).body(cursoCreado);
		}catch(Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
}
