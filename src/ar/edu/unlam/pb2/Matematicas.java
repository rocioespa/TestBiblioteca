package ar.edu.unlam.pb2;

public class Matematicas extends Libro implements Fotocopiable{

	public Matematicas(Integer id, String nombre, String autor, TipoLibro tipo) {
		super(id, nombre, autor, tipo);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String puedoSerFotocopiado() {
		return getNombre();
	}

}
