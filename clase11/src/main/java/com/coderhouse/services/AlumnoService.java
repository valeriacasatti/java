package com.coderhouse.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coderhouse.dtos.InscripcionDto;
import com.coderhouse.models.Alumno;
import com.coderhouse.models.Curso;
import com.coderhouse.repositories.AlumnoRepository;
import com.coderhouse.repositories.CursoRepository;

import jakarta.transaction.Transactional;

@Service
public class AlumnoService {

	@Autowired
	private AlumnoRepository alumnoRepository;
	
	@Autowired
	private CursoRepository cursoRepository;
	
	public List<Alumno> getAllAlumnos() {
		return alumnoRepository.findAll();
	}
	
	public Alumno findById(Long id) {
		return alumnoRepository.findById(id).orElseThrow(()-> new IllegalArgumentException("Alumno no encontrado"));
	}
	
	@Transactional
	public Alumno saveAlumno(Alumno alumno) {
		return alumnoRepository.save(alumno);
	}
	
	@Transactional
	public Alumno updateAlumnobyId(Long id, Alumno alumnoInfo) {
		Alumno alumno = alumnoRepository.findById(id).orElseThrow(()-> new IllegalArgumentException("Alumno no encontrado"));
		alumno.setNombre(alumnoInfo.getNombre());
		alumno.setApellido(alumnoInfo.getApellido());
		if(alumnoInfo.getDni() != 0) {
			alumno.setDni(alumnoInfo.getDni());
		}
		if(alumnoInfo.getLegajo() != null && !alumnoInfo.getLegajo().isEmpty()) {
			alumno.setLegajo(alumnoInfo.getLegajo());
		}
		return alumnoRepository.save(alumno);
	}
	
	public void deleteAlumno(Long id) {
		if(!alumnoRepository.existsById(id)) {
			throw new IllegalArgumentException("Alumno no encontrado");
		}
		alumnoRepository.deleteById(id);

	}
	
	@Transactional
	public Alumno incribirAlumnoACursos(InscripcionDto dto) {
		Alumno alumno = alumnoRepository.findById(dto.getAlumnoId()).orElseThrow(()-> new IllegalArgumentException("Alumno no encontrado"));
		for(Long cursoId : dto.getCursoIds()) {
			Curso curso = cursoRepository.findById(cursoId).orElseThrow(()-> new IllegalArgumentException("Curso no encontrado"));
			alumno.getCursos().add(curso);
			curso.getAlumnos().add(alumno);
			cursoRepository.save(curso);
		}
		return alumnoRepository.save(alumno);
	}
	
	
	
	
	
	
	
}
