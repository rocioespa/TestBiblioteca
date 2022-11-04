package ar.edu.unlam.pb2;

import java.util.*;

public class Registro {
	
	private Integer id;
	private Libro libro;
	private Set<Libro> libroPrestados;
	private Estudiante estudiante;
	private final Integer LIMITE_DE_LIBROS_PRESTADOS = 2;
	
	public Registro(Integer id, Libro libro, Estudiante estudiante) {
		super();
		this.id = id;
		this.libro = libro;
		this.estudiante = estudiante;
		this.libroPrestados = new HashSet<>();
	    
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Libro getLibro() {
		return libro;
	}
	public void setLibro(Libro libro) {
		this.libro = libro;
	}
	public Set<Libro> getLibroPrestados() {
		return libroPrestados;
	}
	public void setLibroPrestados(Set<Libro> libroPrestados) {
		this.libroPrestados = libroPrestados;
	}
	public Estudiante getEstudiante() {
		return estudiante;
	}
	public void setEstudiante(Estudiante estudiante) {
		this.estudiante = estudiante;
	}
	
	public void prestarLibro(Libro l) throws NoEstaDisponible, MuchosPrestamos {
		if(this.libroPrestados.size()<LIMITE_DE_LIBROS_PRESTADOS) {	
			if(l.getPrestamo()==false) {
				this.libroPrestados.add(l);
			}
			else {
				throw new NoEstaDisponible();
			}
		}
		else throw new MuchosPrestamos();
	}
	
	public void habilitarPrestamoLibros(Libro l,Libro l2) {
		if((l.getId().equals(l2.getId()))) {
			l.setPrestamo(true);
		}
	}
//	public void devolverLibro(Libro l) throws NoSePresto {
//		for (Libro libro : libroPrestados) {
//			if(l.getPrestamo()==true){
//				this.libroPrestados.remove(l);
//				l.setPrestamo(false);
//			}
//			throw new NoSePresto();
//		
//	}
		
	
	

}
