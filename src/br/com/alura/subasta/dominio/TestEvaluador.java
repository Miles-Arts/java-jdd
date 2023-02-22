package br.com.alura.subasta.dominio;

public class TestEvaluador {
	
	
	public static void main(String[] args) {
		
		
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
		
		
		System.out.println("La mayor  oferta es de: " + evaluador.getMayorQueTodos());
		
		System.out.println(evaluador.getMenorQueTodos());
		
	}
}
