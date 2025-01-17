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

import com.coderhouse.models.Categoria;
import com.coderhouse.services.CategoriaService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/api/categorias")
@Tag(name="Gestion de categorias", description="Endpoints para gestionar categorias")
public class CategoriaController {

	@Autowired
	private CategoriaService categoriaService;
	
	@Operation(summary="Obtener lista de categorias")
	@ApiResponses(value= {
			@ApiResponse(responseCode="200", description="Lista de categorias obtenida correctamente",
					content= {
							@Content(mediaType="application/json", schema=@Schema(implementation=Categoria.class))
					}),
			@ApiResponse(responseCode="404", description="Error al obtener las categorias", content= @Content),
			@ApiResponse(responseCode="500", description="Error interno del servidor", content= @Content)
	})
	@GetMapping
	public ResponseEntity<List<Categoria>> getAllCategorias(){
		try {
			List<Categoria> categorias = categoriaService.getAllCategorias();
			return ResponseEntity.ok(categorias);
		}catch(IllegalArgumentException e) {
			return ResponseEntity.notFound().build(); 
		}catch(Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build(); 
		}
	}
	
	@Operation(summary="Obtener categoria por ID")
	@ApiResponses(value= {
			@ApiResponse(responseCode="200", description="Categoria obtenida correctamente",
					content= {
							@Content(mediaType="application/json", schema=@Schema(implementation=Categoria.class))
					}),
			@ApiResponse(responseCode="404", description="Error al obtener la categoria", content= @Content),
			@ApiResponse(responseCode="500", description="Error interno del servidor", content= @Content)
	})
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
	
	@Operation(summary="Creacion de categoria")
	@ApiResponses(value= {
			@ApiResponse(responseCode="201", description="Categoria creada correctamente",
					content= {
							@Content(mediaType="application/json", schema=@Schema(implementation=Categoria.class))
					}),
			@ApiResponse(responseCode="500", description="Error interno del servidor", content= @Content)
	})
	@PostMapping
	public ResponseEntity<Categoria> createCategoria(@RequestBody Categoria categoria){
		try {
			Categoria categoriaCreada = categoriaService.saveCategoria(categoria);
			return ResponseEntity.status(HttpStatus.CREATED).body(categoriaCreada);
		}catch(Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build(); 
		}
	}
	
	@Operation(summary="Modificar categoria por ID")
	@ApiResponses(value= {
			@ApiResponse(responseCode="200", description="Categoria modificada correctamente",
					content= {
							@Content(mediaType="application/json", schema=@Schema(implementation=Categoria.class))
					}),
			@ApiResponse(responseCode="404", description="Error al obtener la categoria", content= @Content),
			@ApiResponse(responseCode="500", description="Error interno del servidor", content= @Content)
	})
	@PutMapping("/{id}")
	public ResponseEntity<Categoria> updateCategoriaById(@PathVariable Long id, @RequestBody Categoria categoria){
		try {
			Categoria categoriaActualizada = categoriaService.updateCategoriaById(id, categoria);
			return ResponseEntity.ok(categoriaActualizada);
		}catch(IllegalArgumentException e) {
			return ResponseEntity.notFound().build(); 
		}catch(Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build(); 
		}
	}
	
	@Operation(summary="Eliminar categoria por ID")
	@ApiResponses(value= {
			@ApiResponse(responseCode="204", description="Categoria eliminada correctamente",
					content= {
							@Content(mediaType="application/json", schema=@Schema(implementation=Categoria.class))
					}),
			@ApiResponse(responseCode="404", description="Error al obtener la categoria", content= @Content),
			@ApiResponse(responseCode="500", description="Error interno del servidor", content= @Content)
	})
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteCategoriaById(@PathVariable Long id) {
		try {
			categoriaService.deleteCategoriaById(id);
			return ResponseEntity.noContent().build();
		}catch(IllegalArgumentException e) {
			return ResponseEntity.notFound().build(); 
		}catch(Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build(); 
		}
	}
}
