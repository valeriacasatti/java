package com.coderhouse.dtos;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Schema(description="Modelo de asignacion de categoria DTO", title="Asignaciones DTO")
public class AsignacionCategoriaCursoDto {

	@Schema(description="ID de la categoria", requiredMode=Schema.RequiredMode.REQUIRED, example="1")
	private Long categoriaId;
	
	@Schema(description="ID del curso", requiredMode=Schema.RequiredMode.REQUIRED, example="['1', '2']")
	private Long cursoId;
}
