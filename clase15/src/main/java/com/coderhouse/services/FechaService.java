package com.coderhouse.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import com.coderhouse.dtos.TimeResponseDTO;

@Service
public class FechaService {

	@Autowired
	private RestTemplate rt;
	
	public TimeResponseDTO obtenerFechaActual() {
		try {
			final String URL = "https://timeapi.io/api/Time/current/zone?timeZone=America/Argentina/Buenos_Aires";
			return rt.getForObject(URL, TimeResponseDTO.class);
		}catch(RestClientException e) {
			System.err.println("error, no se pudo conectar a la api externa: " + e.getMessage());
			return null;
		}
	}
	
}
