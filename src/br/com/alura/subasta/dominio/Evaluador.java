package br.com.alura.subasta.dominio;

public class Evaluador {

	//private double mayorQueTodos = 0.0; //Variable Global
	
	private double mayorQueTodos = Double.NEGATIVE_INFINITY;
	
	private double menorQueTodos = Double.POSITIVE_INFINITY;
	
	//private double media = 0;
	
	public void evalua(Subasta subasta) {
		
	
		//double total = 0;
		
		for (Oferta oferta: subasta.getOfertas()) {
			if  (oferta.getValor() > mayorQueTodos ) {
				mayorQueTodos = oferta.getValor();
			}	//else { ESTE ELSE GENERAL ERROR DE PRODUCCIÓN
				if(oferta.getValor() < menorQueTodos) {
					menorQueTodos = oferta.getValor();
				}
			//}  
				/*if(total == 0) {
	            media = 0;
	            return;
	        }*/
		}
	}

	public double getMayorQueTodos() {
		return mayorQueTodos;
	}

	public double getMenorQueTodos() {
		return menorQueTodos;
		
	}	
	
	/*public double getMedia() { 
		return media; 	
		
	}*/
}










