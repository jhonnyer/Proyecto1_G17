package com.unab.app.models;

public class Test2 {
	private String id;
	private String materia;
	private String nota;
	
	public Test2(String id, String materia, String nota) {
		this.id = id;
		this.materia = materia;
		this.nota = nota;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getMateria() {
		return materia;
	}
	public void setMateria(String materia) {
		this.materia = materia;
	}
	public String getNota() {
		return nota;
	}
	public void setNota(String nota) {
		this.nota = nota;
	}
	
	
}
