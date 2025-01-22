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

import com.coderhouse.dtos.InscripcionDto;
import com.coderhouse.models.Alumno;
import com.coderhouse.services.AlumnoService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/api/alumnos")
@Tag(name="Gestion de alumnos", description="Endpoints para gestionar alumnos")
public class AlumnoController {

	@Autowired
	private AlumnoService alumnoService;
	
	@Operation(summary="Obtener lista de alumnos")
	@ApiResponses(value= {
			@ApiResponse(responseCode="200", description="Lista de alumnos obtenida correctamente",
					content= {
							@Content(mediaType="application/json", schema=@Schema(implementation=Alumno.class))
					}),
			@ApiResponse(responseCode="404", description="Error al obtener los alumnos", content= @Content),
			@ApiResponse(responseCode="500", description="Error interno del servidor", content= @Content)
	})
	@GetMapping
	public ResponseEntity<List<Alumno>> getAllAlumnos() {
		try {
			List<Alumno> alumnos = alumnoService.getAllAlumnos();
			return ResponseEntity.ok(alumnos); // 200
		}catch(IllegalArgumentException e) {
			return ResponseEntity.notFound().build(); //404
		}catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build(); // 500
		}

	}
	
	@Operation(summary="Obtener un alumno por ID")
	@ApiResponses(value= {
			@ApiResponse(responseCode="200", description="Alumno obtenido correctamente",
					content= {
							@Content(mediaType="application/json", schema=@Schema(implementation=Alumno.class))
					}),
			@ApiResponse(responseCode="404", description="Error al obtener el alumno", content= @Content),
			@ApiResponse(responseCode="500", description="Error interno del servidor", content= @Content)
	})
	@GetMapping("/{id}")
	public ResponseEntity<Alumno> getAlumnoById(@PathVariable Long id){
		try {
			Alumno alumno = alumnoService.findById(id);
			return ResponseEntity.ok(alumno); //200
		}catch(IllegalArgumentException e) {
			return ResponseEntity.notFound().build(); //404
		}catch(Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build(); //500
		}
	}
	
	@Operation(summary="Creacion de un alumno")
	@ApiResponses(value= {
			@ApiResponse(responseCode="201", description="Alumno creado correctamente",
					content= {
							@Content(mediaType="application/json", schema=@Schema(implementation=Alumno.class))
					}),
			@ApiResponse(responseCode="500", description="Error interno del servidor", content= @Content)
	})
	@PostMapping
	public ResponseEntity<Alumno> createAlumno(@RequestBody Alumno alumno){
		try {
			Alumno alumnoCreado = alumnoService.saveAlumno(alumno);
			return ResponseEntity.status(HttpStatus.CREATED).body(alumnoCreado);
		}catch(Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build(); 
		}
	}
	
	@Operation(summary="Modificar un alumno por ID")
	@ApiResponses(value= {
			@ApiResponse(responseCode="200", description="Alumno modificado correctamente",
					content= {
							@Content(mediaType="application/json", schema=@Schema(implementation=Alumno.class))
					}),
			@ApiResponse(responseCode="404", description="Error al modificar el alumno", content= @Content),
			@ApiResponse(responseCode="500", description="Error interno del servidor", content= @Content)
	})
	@PutMapping("/{id}")
	public ResponseEntity<Alumno> updateAlumnoById(@PathVariable Long id, @RequestBody Alumno alumno){
		try {
			Alumno updateAlumno = alumnoService.updateAlumnobyId(id, alumno);
			return ResponseEntity.ok(updateAlumno);
		}catch(IllegalArgumentException e) {
			return ResponseEntity.notFound().build(); 
		}catch(Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build(); 
		}
	}
	
	@Operation(summary="Eliminar un alumno por ID")
	@ApiResponses(value= {
			@ApiResponse(responseCode="204", description="Alumno eliminado correctamente",
					content= {
							@Content(mediaType="application/json", schema=@Schema(implementation=Alumno.class))
					}),
			@ApiResponse(responseCode="404", description="Error al eliminar el alumno", content= @Content),
			@ApiResponse(responseCode="500", description="Error interno del servidor", content= @Content)
	})
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteAlumnoById(@PathVariable Long id){
		try {
			alumnoService.deleteAlumno(id);
			return ResponseEntity.noContent().build(); //204
		}catch(IllegalArgumentException e) {
			return ResponseEntity.notFound().build(); 
		}catch(Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build(); 
		}
	}
	
	@Operation(summary="Inscribir un alumno a un curso")
	@ApiResponses(value= {
			@ApiResponse(responseCode="200", description="Alumno inscripto correctamente",
					content= {
							@Content(mediaType="application/json", schema=@Schema(implementation=Alumno.class))
					}),
			@ApiResponse(responseCode="500", description="Error interno del servidor", content= @Content)
	})
	@PostMapping("/inscribir")
	public ResponseEntity<Alumno> incribirAlumnoACursos(@RequestBody InscripcionDto dto){
		try {
			Alumno alumno = alumnoService.incribirAlumnoACursos(dto);
			return ResponseEntity.ok(alumno);
		}catch(Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build(); 

		}
	}
}
