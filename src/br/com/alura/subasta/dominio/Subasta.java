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

		int total = 0;
		for (Oferta l : ofertas) {
			if (l.getUsuario().equals(oferta.getUsuario()))
				total++;
		}

		// Si la oferta esta vacia
		if (ofertas.isEmpty() ||
		// Es un usuario diferente del anterior
				!ofertas.get(ofertas.size() - 1).getUsuario().equals(oferta.getUsuario()) && total < 5) {
			// Entonces agrega esa oferta
			ofertas.add(oferta);
		}

	}

	private int getTotalOfertasUsuario(Usuario usuario, List<Oferta> ofertas) {
		int total = 0;
		for (Oferta l : ofertas) {
			if (l.getUsuario().equals(usuario))
				total++;
		}
		return total;

	}

	public String getDescripcion() {
		return descripcion;
	}

	public List<Oferta> getOfertas() {
		return Collections.unmodifiableList(ofertas);
	}

}
