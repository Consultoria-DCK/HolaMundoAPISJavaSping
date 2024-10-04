package com.desarrollo.software.holamundo.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.desarrollo.software.holamundo.service.ApiService;

@Service("service")
public class ApiServiceImpl implements ApiService {

	private static Logger log = LoggerFactory.getLogger(ApiServiceImpl.class);
	
	
	@Override
	public String obtenerDatos() {
		log.info("Para imprimir mensajes NO se recomienda utilizar System.out");
		log.info("Hola Mundo desde Capa de Negocio");
		return "Hola Mundo desde Capa de Negocio / Service";
	}

}
