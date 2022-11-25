package com.unab.app.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/test")
public class IndexController {

//	private static final String USERNAME ="Jhonnyer";
	@Value("${text.indexController.name}")
	private String USERNAME;
	
	@RequestMapping(value="/prueba", method = RequestMethod.GET)
	public String getPrueba() {
		System.out.println("Hola mundo, bienvenidos");
		return "index";
	} 
	
	@GetMapping("/pruebasinretorno")
	public void getPruebsinRetorno() {
		System.out.println("Prueba sin retorno");
	}
	
	@PostMapping("/getObjeto")
	public Object getObjecto(@RequestBody Object object) {
		System.out.println("Test Request Body");
		System.out.println(object);
		return object;
	}
	
	@GetMapping("/indexParam/{nombre}")
	public String indexParam(@PathVariable("nombre") String nombre) {
		System.out.println(USERNAME);
		System.out.println("Hola "+nombre+" bienvenido al sistema");
		System.out.println("Test GIT 1 ");
		System.out.println("Test GIT 2 ");
		System.out.println("Test GIT 3 ");
		return nombre;
	}
	
}
