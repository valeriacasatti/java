package com.coderhouse.controllers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coderhouse.dtos.AsignacionCategoriaCursoDto;
import com.coderhouse.models.Curso;
import com.coderhouse.services.CursoService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name="Gestion de cursos", description="Endpoints para gestionar cursos")
@RestController
@RequestMapping("/api/cursos")
public class CursoController {

	@Autowired
	private CursoService cursoService;
	
	@Operation(summary="Obtener lista de cursos")
	@ApiResponses(value= {
			@ApiResponse(responseCode="200", description="Lista de cursos obtenida correctamente",
					content= {
							@Content(mediaType="application/json", schema=@Schema(implementation=Curso.class))
					}),
			@ApiResponse(responseCode="404", description="Error al obtener los cursos", content= @Content),
			@ApiResponse(responseCode="500", description="Error interno del servidor", content= @Content)
	})
	@GetMapping
	public ResponseEntity<List<Curso>> getAllCursos(){
		try {
			List<Curso> cursos = cursoService.getAllCursos();
			return ResponseEntity.ok(cursos);
		}catch(IllegalArgumentException e) {
			return ResponseEntity.notFound().build();
		}catch(Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
	
	@Operation(summary="Obtener un curso por ID")
	@ApiResponses(value= {
			@ApiResponse(responseCode="200", description="Curso obtenido correctamente",
					content= {
							@Content(mediaType="application/json", schema=@Schema(implementation=Curso.class))
					}),
			@ApiResponse(responseCode="404", description="Error al obtener el curso", content= @Content),
			@ApiResponse(responseCode="500", description="Error interno del servidor", content= @Content)
	})
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
	
	@Operation(summary="Creacion de un curso")
	@ApiResponses(value= {
			@ApiResponse(responseCode="201", description="Curso creado correctamente",
					content= {
							@Content(mediaType="application/json", schema=@Schema(implementation=Curso.class))
					}),
			@ApiResponse(responseCode="500", description="Error interno del servidor", content= @Content)
	})
	@PostMapping
	public ResponseEntity<Curso> createCurso(@RequestBody Curso curso){
		try {
			Curso cursoCreado = cursoService.saveCurso(curso);
			return ResponseEntity.status(HttpStatus.CREATED).body(cursoCreado);
		}catch(Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
	
	@Operation(summary="Modificacion de un curso por ID")
	@ApiResponses(value= {
			@ApiResponse(responseCode="200", description="Curso modificado correctamente",
					content= {
							@Content(mediaType="application/json", schema=@Schema(implementation=Curso.class))
					}),
			@ApiResponse(responseCode="404", description="Error al obtener el curso", content= @Content),
			@ApiResponse(responseCode="500", description="Error interno del servidor", content= @Content)
	})
	@PutMapping("/{id}")
	public ResponseEntity<Curso> updateCursoById(@PathVariable Long id, @RequestBody Curso curso){
		try {
			Curso cursoActualizado = cursoService.updateCursoById(id, curso);
			return ResponseEntity.ok(cursoActualizado);
		}catch(IllegalArgumentException e) {
			return ResponseEntity.notFound().build();
		}catch(Exception e){
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
	
	@Operation(summary="Eliminar un curso por ID")
	@ApiResponses(value= {
			@ApiResponse(responseCode="204", description="Curso eliminado correctamente",
					content= {
							@Content(mediaType="application/json", schema=@Schema(implementation=Curso.class))
					}),
			@ApiResponse(responseCode="404", description="Error al obtener el curso", content= @Content),
			@ApiResponse(responseCode="500", description="Error interno del servidor", content= @Content)
	})
	@DeleteMapping("/{id}")
	public ResponseEntity<Curso> deleteCursoById(@PathVariable Long id){
		try {
			cursoService.deleteCursoById(id);
			return ResponseEntity.noContent().build();
		}catch(IllegalArgumentException e) {
			return ResponseEntity.notFound().build();
		}catch(Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
	
	@Operation(summary="Asignar categoria a un curso")
	@ApiResponses(value= {
			@ApiResponse(responseCode="200", description="Categoria asignada correctamente",
					content= {
							@Content(mediaType="application/json", schema=@Schema(implementation=Curso.class))
					}),
			@ApiResponse(responseCode="404", description="Error al obtener el curso o categoria", content= @Content),
			@ApiResponse(responseCode="500", description="Error interno del servidor", content= @Content)
	})
	@PostMapping("/asignar-categoria")
	public ResponseEntity<Curso> AsignarCategoriaCurso(@RequestBody AsignacionCategoriaCursoDto dto){
		try {
			Curso curso = cursoService.AsignarCategoriaCurso(dto.getCursoId(), dto.getCategoriaId());
			return ResponseEntity.ok(curso);
		}catch(Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
}
