package test;

import junit.framework.Assert;

import org.junit.Test;

import br.com.alura.subasta.dominio.Oferta;
import br.com.alura.subasta.dominio.Subasta;
import br.com.alura.subasta.dominio.Usuario;

public class TestJunitNuevasReglasNegocio {

	// Reglas negocio
	// 1 - Un usuario no puede hacer dos ofertas consecutivas.
	// 2 - Un usuario no puede hacer mas de cinco ofertas por subasta

	@Test
	public void deberiaAceptarSolo1OfertaConsecutiva() {

		Usuario alexis = new Usuario(2, "Alexis");

		Oferta oferta1 = new Oferta(alexis, 500.00);
		Oferta oferta2 = new Oferta(alexis, 500.00);

		Subasta subasta = new Subasta("Auto del año");
		subasta.propone(oferta1);
		subasta.propone(oferta2);

		Assert.assertEquals(subasta.getOfertas().size(), 1);

	}

	@Test
	public void deberiaAceptar5ofertasComoMaximo() {

		// Escenario de puebla con Junit Asser
		int cantidadMaximaAceptada = 10;

		Usuario alexis = new Usuario(2, "Alexis");
		Usuario diego = new Usuario(2, "Diego");

		Oferta oferta1 = new Oferta(alexis, 500.00);
		Oferta oferta2 = new Oferta(diego, 500.00);
		Oferta oferta3 = new Oferta(alexis, 500.00);
		Oferta oferta4 = new Oferta(diego, 500.00);
		Oferta oferta5 = new Oferta(alexis, 500.00);
		Oferta oferta6 = new Oferta(diego, 500.00);
		Oferta oferta7 = new Oferta(alexis, 500.00);
		Oferta oferta8 = new Oferta(diego, 500.00);
		Oferta oferta9 = new Oferta(alexis, 500.00);
		Oferta oferta10 = new Oferta(diego, 500.00);
		Oferta oferta11 = new Oferta(alexis, 500.00);

		Subasta subasta = new Subasta("Auto del año");
		subasta.propone(oferta1);
		subasta.propone(oferta2);
		subasta.propone(oferta3);
		subasta.propone(oferta4);
		subasta.propone(oferta5);
		subasta.propone(oferta6);
		subasta.propone(oferta7);
		subasta.propone(oferta8);
		subasta.propone(oferta9);
		subasta.propone(oferta10);
		subasta.propone(oferta11);

		Assert.assertEquals(subasta.getOfertas().size(), cantidadMaximaAceptada);

	}
}
