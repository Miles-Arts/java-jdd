package br.com.alura.subasta.dominio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Subasta {

	private String descripcion;
	private List<Oferta> ofertas;

	public Subasta(String descripcion) {
		this.descripcion = descripcion;
		this.ofertas = new ArrayList<Oferta>();
	}

	public void propone(Oferta oferta) {
		//Si la oferta esta vacia
		if (ofertas.isEmpty() || 
			//Es un usuario diferente del anterior
				!ofertas.get(ofertas.size()-1).getUsuario().equals(oferta.getUsuario())) {
			//Entonces agrega esa oferta
			ofertas.add(oferta);
		}
	}

	public String getDescripcion() {
		return descripcion;
	}

	public List<Oferta> getOfertas() {
		return Collections.unmodifiableList(ofertas);
	}

}
