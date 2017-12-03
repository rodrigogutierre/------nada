package pe.edu.upeu.didierAc.entity;

public class Curso {

	//estudar que las aplicaciones tengan muy bajo acoplamiento y alta cohecion
	
	private int idCurso;
	private String nombre;
	
	private int idDocente;

	public Curso() {
		
	}
	public Curso(String nombre, int idDocente) {
		
		this.nombre = nombre;
		this.idDocente = idDocente;

	}
	public int getIdCurso() {
		return idCurso;
	}
	public void setIdCurso(int idCurso) {
		this.idCurso = idCurso;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getIdDocente() {
		return idDocente;
	}
	public void setIdDocente(int idDocente) {
		this.idDocente = idDocente;
	}

	
	
	
}
