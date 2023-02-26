package test;

import org.junit.Test;

import br.com.alura.subasta.dominio.CreadorDeSubasta;
import br.com.alura.subasta.dominio.Evaluador;
import br.com.alura.subasta.dominio.Subasta;

public class TestEvaluadorExcepcion {

	@Test(expected = RuntimeException.class)
	public void deberiaRetornarExceptionCuandoNoHayOfertas() {

		Subasta subasta = new CreadorDeSubasta().para("TV").construir();

		
		Evaluador evaluador = new Evaluador();
		evaluador.evalua(subasta);
		
		
		//Con RUNTIME EXCEPTION no necesito en Try Catch
		/*try {

			Evaluador evaluador = new Evaluador();
			evaluador.evalua(subasta);

		} catch (Exception ex) {
			System.out.println("Funcionó!");
		}*/

	}

}
