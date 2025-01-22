package com.coderhouse.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coderhouse.dtos.TimeResponseDTO;
import com.coderhouse.services.FechaService;

@RestController
@RequestMapping("/api/fecha")
public class FechaController {

	@Autowired
	private FechaService fechaService;
	
	private int contadorDeInvocaciones = 0;
	private String ultimaFechaMostrada = "N/A";
	
	@GetMapping
	public ResponseEntity<String> obtenerFechaActual() {
		contadorDeInvocaciones++;
		TimeResponseDTO fechaActual = fechaService.obtenerFechaActual();
		
		if(fechaActual == null) {
			return ResponseEntity.status(HttpStatus.SERVICE_UNAVAILABLE)
					.body("error, servicio de la API no disponible");
		}
		
		String mensaje = String.format(
				"Fecha actual: %s %d %s %d,\nHora: %s:%d,\nNumero de invocaciones: %d,\nUltima fecha mostrada: %s",
				fechaActual.getDayOfWeek(),
				fechaActual.getDay(),
				fechaActual.getMonth(),
				fechaActual.getYear(),
				fechaActual.getTime(),
				fechaActual.getSeconds(),
				contadorDeInvocaciones,
				ultimaFechaMostrada);
		
				ultimaFechaMostrada = String.format(
						"%s %d %s %d, %s:%d",
						fechaActual.getDayOfWeek(),
						fechaActual.getDay(),
						fechaActual.getMonth(),
						fechaActual.getYear(),
						fechaActual.getTime(),
						fechaActual.getSeconds());
				
				
				return ResponseEntity.ok(mensaje);
	}
	
}
