package ar.edu.unlam.pb2;

public abstract class Libro {
	
	private Integer id;
	private String nombre;
	private String autor;
	private Boolean prestamo=false;
	private TipoLibro tipo;
	
	public Libro(Integer id, String nombre, String autor,TipoLibro tipo) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.autor = autor;
		this.tipo = tipo;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	public Boolean getPrestamo() {
		return prestamo;
	}

	public void setPrestamo(Boolean prestamo) {
		this.prestamo = prestamo;
	}
	
	

	public TipoLibro getTipo() {
		return tipo;
	}

	public void setTipo(TipoLibro tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Libro \n[id=" + id + "\nnombre=" + nombre + "\nautor=" + autor + "]";
	}
	
	

}
