package br.com.alura.subasta.dominio;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

public class EvaluadorTest {
	
	@Test
    public void debeCalcularLaMedia() {
       /* // escenario: 3 ofertas en orden creciente
        Usuario joao = new Usuario("Joao");
        Usuario jose = new Usuario("José");
        Usuario maria = new Usuario("Maria");

        Subasta subasta = new Subasta("Playstation 3 nuevo");

        subasta.propone(new Oferta(maria,300.0));
        subasta.propone(new Oferta(joao,400.0));
        subasta.propone(new Oferta(jose,500.0));

        // ejecutando la acción
        Evaluador evaluador = new Evaluador();
        evaluador.evalua(subasta);

        // comparando la salida con lo esperado
        Assert.assertEquals(400, evaluador.getMedia(), 0.00001);
    }

    @Test 
    public void testMediaDeCeroOferta(){

        // escenario
        Usuario ewertom = new Usuario("Ewertom");

        // acción
        Subasta subasta = new Subasta("Iphone 7");

        Evaluador evaluador = new Evaluador();
        evaluador.evalua(subasta);

        //validación
        assertEquals(0, evaluador.getMedia(), 0.00001);
*/
	}

}
