package com.coderhouse.dtos;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class InscripcionDto {
	
	private Long alumnoId;
	private List<Long> cursoIds;
}
