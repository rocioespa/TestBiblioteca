package ar.edu.unlam.pb2;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestBiblioteca {

	@Test
	public void queSePuedaCrearUnaBiblioteca() {
		Biblioteca b = new Biblioteca("Bs As");
		assertNotNull(b);
	}
	
	@Test
	public void queSePuedaCrearUnLibro() {
		Historia h = new Historia(1,"lavacalola","rocio",TipoLibro.HISTORIA);
		assertNotNull(h);
	}
	
	@Test
	public void queSePuedaCrearUnEstudiante() {
		Estudiante e = new Estudiante(43446347,"rocio","españa");
		assertNotNull(e);
	}
	
	@Test
	public void queSePuedaFotocopiarUnLibroDeHistoria() {
		Historia libro= new Historia(12346551,"Segunda Guerra Mundial","Alejandro Gomes",TipoLibro.HISTORIA);
		assertNotNull(libro);
		assertEquals("Segunda Guerra Mundial", libro.puedoSerFotocopiado());
	}
	
	@Test
	public void queUnEstudiantePuedaPedirPrestadoUnLibro() throws NoEstaDisponible, MuchosPrestamos{
		Biblioteca b = new Biblioteca("Bs As");
		Historia h = new Historia(1,"lavacalola","rocio",TipoLibro.HISTORIA);
		Estudiante e = new Estudiante(43446347,"rocio","españa");
		Registro r = new Registro(11,h,e);
		b.agregarRegistro(r);
		r.prestarLibro(h);
		
		
		assertEquals(1, r.getLibroPrestados().size());
		System.out.println(r.getLibroPrestados().toString());
	}
	
	@Test (expected= MuchosPrestamos.class)
	public void queNoSePuedaPrestarUnLibroSiElEstudianteYaTieneDos() throws NoEstaDisponible, MuchosPrestamos {
		Biblioteca b = new Biblioteca("Bs As");
		Historia h = new Historia(1,"lavacalola","rocio", TipoLibro.HISTORIA);
		Matematicas m = new Matematicas (2,"lavacalola","rocio",TipoLibro.MATEMATICA);
		Geografia g = new Geografia (3,"lavacalola","rocio",TipoLibro.GEOGRAFIA);
		Estudiante e = new Estudiante(43446347,"rocio","españa");
		Registro r = new Registro(11,h,e);
		b.agregarRegistro(r);
		r.habilitarPrestamoLibros(h, m);
		r.prestarLibro(h);
		r.prestarLibro(m);
		r.prestarLibro(g);
		
	}
	
//	@Test
//	public void queNoSePuedaDevolverUnLibro() throws NoSePresto, NoEstaDisponible, MuchosPrestamos {
//		Biblioteca b = new Biblioteca("Bs As");
//		Historia h = new Historia(1,"lavacalola","rocio", TipoLibro.HISTORIA);
//		Matematicas m = new Matematicas (2,"lavacalola","rocio",TipoLibro.MATEMATICA);
//		
//		Estudiante e = new Estudiante(43446347,"rocio","españa");
//		Registro r = new Registro(11,h,e);
//		b.agregarRegistro(r);
//		r.habilitarPrestamoLibros(h, m);
//		r.prestarLibro(h);
//		r.prestarLibro(m);
//		r.devolverLibro(m);
//		assertEquals(1, r.getLibroPrestados().size());
//		
//	}

	
	
	

}
