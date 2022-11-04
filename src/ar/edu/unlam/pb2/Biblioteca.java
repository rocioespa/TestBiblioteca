package ar.edu.unlam.pb2;

import java.util.*;

public class Biblioteca {

	private String nombre;
	private Set<Registro> registros;
	private Integer librosPrestados=0;

	public Biblioteca(String nombre) {
		super();
		this.nombre = nombre;
		this.registros = new HashSet<>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Set<Registro> getRegistros() {
		return registros;
	}

	public void setRegistros(Set<Registro> registros) {
		this.registros = registros;
	}

	public void agregarRegistro(Registro registro) {
		this.registros.add(registro);
	}

	public Boolean buscarRegistro(Integer id) throws NoExisteLibro {

		for (Registro registro : registros) {

			if (registro.getId().equals(id)) {
				return true;
			}

		}
		throw new NoExisteLibro();
	}
	

}
