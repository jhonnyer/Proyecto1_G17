package com.unab.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/test")
public class IndexController {
	
	@RequestMapping(value="/prueba", method = RequestMethod.GET)
	public String getPrueba() {
		System.out.println("Hola mundo, bienvenidos");
		return "index";
	} 
	
	@GetMapping("/pruebasinretorno")
	public void getPruebsinRetorno() {
		System.out.println("Prueba sin retorno");
	}
	
	@GetMapping("/getObjeto")
	public Object getObjecto(@RequestBody Object object) {
		System.out.println("Test Request Body");
		System.out.println(object);
		return object;
	}
}
