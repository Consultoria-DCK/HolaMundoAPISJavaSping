package com.desarrollo.software.holamundo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.desarrollo.software.holamundo.service.ApiService;

/**
 *  
 *
 * Anotacion utilizada para representar un componente con capaz de atender las solicitudes entrantes
 * 
 */
@RestController
public class ApiController {

	@Autowired//Anotacion para inyectar la el servicio
	@Qualifier("service")//Anotacion utilizada para invocar un servicio en especifico en caso de tener mas de una implementacion
	private ApiService servicio;
	
	/**
	 * 
	 * Anotacion que se utiliza con el verbo GET comunmente para obtener informacion
	 * 
	 */
	@GetMapping( value = "/hola")
	public String obtenerDatos() {
		return servicio.obtenerDatos();//Invocacion al metodo declarado en el servicio a travez de la interfaz
	
	}
}