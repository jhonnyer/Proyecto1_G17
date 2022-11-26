package com.unab.app.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service 
public class IndexService implements IServicio{
	
	@Value("${text.indexController.titulo}")
	private String USERNAME;
	
	private static final String MESSAGE_ONE ="Proyecto 1";
	
	@Override
	public String operacion(String nombre) {
		System.out.println(USERNAME +" - "+ MESSAGE_ONE);
		System.out.println("Hola "+nombre+" bienvenido al sistema");
		return "Hola "+nombre+" bienvenido al sistema";
	}
}
