package br.com.alura.subasta.dominio;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MatematicaLocaTest {

    @Test
    public void debeMultiplicarNumerosMayoresQue30() {
        MatematicaLoca matematica = new MatematicaLoca();
        assertEquals(50*4, matematica.cuentaLoca(50));
    }

    @Test
    public void debeMultiplicarNumerosMayoresQue10EMenoresQue30() {
        MatematicaLoca matematica = new MatematicaLoca();
        assertEquals(20*3, matematica.cuentaLoca(20));
    }

    @Test
    public void debeMultiplicarNumerosMenoresQue10() {
        MatematicaLoca matematica = new MatematicaLoca();
        assertEquals(5*2, matematica.cuentaLoca(5));
    }
}
