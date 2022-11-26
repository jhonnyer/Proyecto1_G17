package com.unab.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.unab.app.service.IServicio;
import com.unab.app.service.IndexService;

@RestController
@RequestMapping(value="/test")
public class IndexController {
	
//	private IndexService miservicio =new IndexService();	
//	@Autowired
//	private IndexService miservicio;	
	
	@Autowired
	private IServicio miservicio;
	
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
		return miservicio.operacion(nombre);
	}
	
}
