package com.coderhouse.dtos;

import java.util.List;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Schema(description="Modelo de inscripcion de alumnos DTO", title="Inscripciones DTO")
public class InscripcionDto {
	
	@Schema(description="ID del alumno", requiredMode=Schema.RequiredMode.REQUIRED, example="1")
	private Long alumnoId;
	
	@Schema(description="Listado de IDs de cursos", requiredMode=Schema.RequiredMode.REQUIRED, example="1")
	private List<Long> cursoIds;
}
