package br.com.alura.subasta.dominio;

import org.junit.Assert;
import org.junit.Test;


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

}
