package test;

import org.junit.Test;

import br.com.alura.subasta.dominio.Evaluador;
import br.com.alura.subasta.dominio.Oferta;
import br.com.alura.subasta.dominio.Subasta;
import br.com.alura.subasta.dominio.Usuario;
import junit.framework.Assert;

public class TestJunitEvaluador {

	@Test
	public void deberiaRetornarElMayorValor() {

		// Primer escenario
		Usuario diego = new Usuario(1, "Diego");
		Usuario alexis = new Usuario(2, "Alexis");
		Usuario daniel = new Usuario(3, "Daniel");

		Oferta oferta1 = new Oferta(diego, 300.00);
		Oferta oferta2 = new Oferta(alexis, 500.00);
		Oferta oferta3 = new Oferta(daniel, 700.00);

		Subasta subasta = new Subasta("Auto del año");
		subasta.propone(oferta1);
		subasta.propone(oferta2);
		subasta.propone(oferta3);

		Evaluador evaluador = new Evaluador();
		evaluador.evalua(subasta);

		// System.out.println("La mayor oferta es de: " + evaluador.getMayorQueTodos());

		// System.out.println(evaluador.getMenorQueTodos());

		Assert.assertEquals(700, evaluador.getMayorQueTodos(), 0.00001);

		Assert.assertEquals(300, evaluador.getMenorQueTodos(), 0.00001);
	}
	

	@Test
	public void deberiaRetornarElMayorValorConNumerosde5Cifras() {
		// Primer escenario
		Usuario diego = new Usuario(1, "Diego");
		Usuario alexis = new Usuario(2, "Alexis");
		Usuario daniel = new Usuario(3, "Daniel");

		Oferta oferta1 = new Oferta(diego, 30044.00);
		Oferta oferta2 = new Oferta(alexis, 50077.00);
		Oferta oferta3 = new Oferta(daniel, 70088.00);

		Subasta subasta = new Subasta("Auto del año");
		subasta.propone(oferta1);
		subasta.propone(oferta2);
		subasta.propone(oferta3);

		Evaluador evaluador = new Evaluador();
		evaluador.evalua(subasta);

		// System.out.println("La mayor oferta es de: " + evaluador.getMayorQueTodos());

		// System.out.println(evaluador.getMenorQueTodos());

		Assert.assertEquals(70088, evaluador.getMayorQueTodos(), 0.00001);

		Assert.assertEquals(30044, evaluador.getMenorQueTodos(), 0.00001);
	
	
	}
	
	@Test
	public void deberiaRetornarLasLas3MayoresOfertas( ) {
		Usuario diego = new Usuario(1, "Diego");
		Usuario alexis = new Usuario(2, "Alexis");
		Usuario daniel = new Usuario(3, "Daniel");
		Usuario sandro = new Usuario(4, "Sandro");
		Usuario eduardo = new Usuario(5, "Eduardo");

		Oferta oferta1 = new Oferta(diego, 3044.00);
		Oferta oferta2 = new Oferta(alexis, 50077.00);
		Oferta oferta3 = new Oferta(daniel, 70088.00);
		Oferta oferta4 = new Oferta(sandro, 54333.00);
		Oferta oferta5 = new Oferta(eduardo, 9888.00);
		
		
		Subasta subasta = new Subasta("Auto del año");
		subasta.propone(oferta1);
		subasta.propone(oferta2);
		subasta.propone(oferta3);
		subasta.propone(oferta4);
		subasta.propone(oferta5);

		Evaluador evaluador = new Evaluador();
		evaluador.evalua(subasta);
		
		Assert.assertEquals(evaluador.getMayoresOfertas().size(), 3);
		
		Assert.assertEquals(evaluador.getMayoresOfertas().get(0).getValor(), 70088.00);
		Assert.assertEquals(evaluador.getMayoresOfertas().get(1).getValor(), 54333.00);
		Assert.assertEquals(evaluador.getMayoresOfertas().get(2).getValor(), 50077.00);
		
	}

}
