package ar.edu.unlam.pb2;

public class Historia extends Libro implements Fotocopiable{

	public Historia(Integer id, String nombre, String autor, TipoLibro tipo) {
		super(id, nombre, autor, tipo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String puedoSerFotocopiado() {
		return getNombre();
	}
	
	
	
	

}
