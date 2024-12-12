package com.coderhouse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.coderhouse.dao.DaoFactory;
import com.coderhouse.models.Alumno;
import com.coderhouse.models.Curso;

@SpringBootApplication
public class Clase08Application implements CommandLineRunner{
	
	@Autowired
	private DaoFactory dao;

	public static void main(String[] args) {
		SpringApplication.run(Clase08Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		try {
			
			Curso curso1 = new Curso("Java");
			Curso curso2 = new Curso("HTML");
			Curso curso3 = new Curso("CSS");
			Curso curso4 = new Curso("Javascript");
			
			Alumno alumno1 = new Alumno("Valeria", "Casatti", 42511590, "L111");
			Alumno alumno2 = new Alumno("Martin", "Ferreyra", 31585562, "L222");
			Alumno alumno3 = new Alumno("Rodrigo", "Diaz", 29543321, "L333");
			Alumno alumno4 = new Alumno("Maria", "Lopez", 41952236, "L444");
			
			//persistir los datos
			dao.persistirAlumno(alumno1);
			dao.persistirAlumno(alumno2);
			dao.persistirAlumno(alumno3);
			dao.persistirAlumno(alumno4);
			
			dao.persistirCurso(curso1);
			dao.persistirCurso(curso2);
			dao.persistirCurso(curso3);
			dao.persistirCurso(curso4);
			
		}catch(Exception e) {
			e.printStackTrace(System.err);
		}
	}

}
