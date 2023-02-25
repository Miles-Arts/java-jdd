package br.com.alura.subasta.dominio;

public class MatematicaLoca {

	
	
    public int cuentaLoca(int numero) {
    	
    	
    	
        if (numero > 30)
            return numero * 4;
        else if (numero > 10)
            return numero * 3;
        else
            return numero * 2;
        
    
        
    }
}
	


