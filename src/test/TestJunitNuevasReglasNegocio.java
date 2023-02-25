package test;

import org.junit.Assert;
import org.junit.Test;

import junit.framework.Assert;

import br.com.alura.subasta.dominio.Oferta;
import br.com.alura.subasta.dominio.Subasta;
import br.com.alura.subasta.dominio.Usuario;

public class TestJunitNuevasReglasNegocio {

	
	//Reglas negocio
	//1 - Un usuario no puede hacer dos ofertas consecutivas.
	//2 - Un usuario no puede hacer mas de cinco ofertas por subasta
	
	
	@Test
	public void deberiaAceptarSolo1OfertaConsecutiva( ) {
		
		Usuario alexis = new Usuario(2, "Alexis");
	
		Oferta oferta1 = new Oferta(alexis, 500.00);
		Oferta oferta2 = new Oferta(alexis, 500.00);
	
		Subasta subasta = new Subasta("Auto del año");
		subasta.propone(oferta1);
		subasta.propone(oferta2);
		
		Assert.assertEquals(subasta.getOfertas().size(), 1);
		
	}
	
}
