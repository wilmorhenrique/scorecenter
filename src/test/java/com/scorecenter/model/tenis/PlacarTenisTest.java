package com.scorecenter.model.tenis;

import com.scorecenter.enums.TipoCompetidor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlacarTenisTest {

    @Test
    void testaCasaFazendo15_30_40(){
        PlacarTenis placar = new PlacarTenis();
        placar.atualizarPlacar(TipoCompetidor.CASA, 1);
        System.out.println(placar.showPlacarA());
        assertEquals(1, placar.casa );
        placar.atualizarPlacar(TipoCompetidor.CASA, 1);
        System.out.println(placar.showPlacarA());
        assertEquals(2, placar.casa );
        placar.atualizarPlacar(TipoCompetidor.CASA, 1);
        System.out.println(placar.showPlacarA());
        assertEquals(3, placar.casa );
    }

    @Test
    void testaVisitanteFazendo15_30_40(){
        PlacarTenis placar = new PlacarTenis();
        placar.atualizarPlacar(TipoCompetidor.VISITANTE, 1);
        System.out.println(placar.showPlacarB());
        assertEquals(1, placar.visitante );
        placar.atualizarPlacar(TipoCompetidor.VISITANTE, 1);
        System.out.println(placar.showPlacarB());
        assertEquals(2, placar.visitante );
        placar.atualizarPlacar(TipoCompetidor.VISITANTE, 1);
        System.out.println(placar.showPlacarB());
        assertEquals(3, placar.visitante );
    }


    @Test
    void testaCasaFazendo40x30(){
        PlacarTenis placar = new PlacarTenis();
        placar.atualizarPlacar(TipoCompetidor.VISITANTE, 1);
        placar.atualizarPlacar(TipoCompetidor.VISITANTE, 1);
        placar.atualizarPlacar(TipoCompetidor.CASA, 1);
        placar.atualizarPlacar(TipoCompetidor.CASA, 1);
        placar.atualizarPlacar(TipoCompetidor.CASA, 1);
        System.out.println(placar.showPlacarA());
        System.out.println(placar.showPlacarB());
        assertEquals(3, placar.casa );
        assertEquals(2, placar.visitante );
    }

    @Test
    void testaFazendo40x40(){
        PlacarTenis placar = new PlacarTenis();
        placar.atualizarPlacar(TipoCompetidor.VISITANTE, 1);
        placar.atualizarPlacar(TipoCompetidor.VISITANTE, 1);
        placar.atualizarPlacar(TipoCompetidor.VISITANTE, 1);
        placar.atualizarPlacar(TipoCompetidor.CASA, 1);
        placar.atualizarPlacar(TipoCompetidor.CASA, 1);
        placar.atualizarPlacar(TipoCompetidor.CASA, 1);
        System.out.println(placar.showPlacarA());
        System.out.println(placar.showPlacarB());
        assertEquals(3, placar.casa );
        assertEquals(3, placar.visitante );
    }

    @Test
    void testaFazendoVantagemDepoisDeIGuais(){
        PlacarTenis placar = new PlacarTenis();
        placar.atualizarPlacar(TipoCompetidor.VISITANTE, 1);
        placar.atualizarPlacar(TipoCompetidor.VISITANTE, 1);
        placar.atualizarPlacar(TipoCompetidor.VISITANTE, 1);
        placar.atualizarPlacar(TipoCompetidor.CASA, 1);
        placar.atualizarPlacar(TipoCompetidor.CASA, 1);
        placar.atualizarPlacar(TipoCompetidor.CASA, 1);

        placar.atualizarPlacar(TipoCompetidor.VISITANTE, 1);
        System.out.println(placar.showPlacarA());
        System.out.println(placar.showPlacarB());
        assertEquals(3, placar.casa );
        assertEquals(4, placar.visitante );
    }

    @Test
    void testaFazendoIguaisDepoisDeVantagem(){
        PlacarTenis placar = new PlacarTenis();
        placar.atualizarPlacar(TipoCompetidor.VISITANTE, 1);
        placar.atualizarPlacar(TipoCompetidor.VISITANTE, 1);
        placar.atualizarPlacar(TipoCompetidor.VISITANTE, 1);
        placar.atualizarPlacar(TipoCompetidor.CASA, 1);
        placar.atualizarPlacar(TipoCompetidor.CASA, 1);
        placar.atualizarPlacar(TipoCompetidor.CASA, 1);

        placar.atualizarPlacar(TipoCompetidor.VISITANTE, 1);
        placar.atualizarPlacar(TipoCompetidor.CASA, 1);
        System.out.println(placar.showPlacarA());
        System.out.println(placar.showPlacarB());
        assertEquals(3, placar.casa );
        assertEquals(3, placar.visitante );
    }

    @Test
    void testaCasaFazendoVantagemDepoisDeEstarIguais(){
        PlacarTenis placar = new PlacarTenis();
        placar.atualizarPlacar(TipoCompetidor.VISITANTE, 1);
        placar.atualizarPlacar(TipoCompetidor.VISITANTE, 1);
        placar.atualizarPlacar(TipoCompetidor.VISITANTE, 1);
        placar.atualizarPlacar(TipoCompetidor.CASA, 1);
        placar.atualizarPlacar(TipoCompetidor.CASA, 1);
        placar.atualizarPlacar(TipoCompetidor.CASA, 1);

        placar.atualizarPlacar(TipoCompetidor.VISITANTE, 1);
        placar.atualizarPlacar(TipoCompetidor.CASA, 1);
        placar.atualizarPlacar(TipoCompetidor.CASA, 1);
        System.out.println(placar.showPlacarA());
        System.out.println(placar.showPlacarB());
        assertEquals(4, placar.casa );
        assertEquals(3, placar.visitante );
    }

    @Test
    void testaCasaFazendoGame(){
        PlacarTenis placar = new PlacarTenis();
        placar.atualizarPlacar(TipoCompetidor.VISITANTE, 1);
        placar.atualizarPlacar(TipoCompetidor.VISITANTE, 1);
        placar.atualizarPlacar(TipoCompetidor.VISITANTE, 1);
        placar.atualizarPlacar(TipoCompetidor.CASA, 1);
        placar.atualizarPlacar(TipoCompetidor.CASA, 1);
        placar.atualizarPlacar(TipoCompetidor.CASA, 1);

        placar.atualizarPlacar(TipoCompetidor.VISITANTE, 1);
        placar.atualizarPlacar(TipoCompetidor.CASA, 1);
        placar.atualizarPlacar(TipoCompetidor.CASA, 1);
        placar.atualizarPlacar(TipoCompetidor.CASA, 1);
        System.out.println(placar.showPlacarA());
        System.out.println(placar.showPlacarB());
        assertEquals(5, placar.casa );
        assertEquals(3, placar.visitante );
    }

    @Test
    void testaVisitanteFazendoGame(){
        PlacarTenis placar = new PlacarTenis();
        placar.atualizarPlacar(TipoCompetidor.VISITANTE, 1);
        placar.atualizarPlacar(TipoCompetidor.VISITANTE, 1);
        placar.atualizarPlacar(TipoCompetidor.VISITANTE, 1);
        placar.atualizarPlacar(TipoCompetidor.CASA, 1);
        placar.atualizarPlacar(TipoCompetidor.CASA, 1);
        placar.atualizarPlacar(TipoCompetidor.CASA, 1);

        placar.atualizarPlacar(TipoCompetidor.VISITANTE, 1);
        placar.atualizarPlacar(TipoCompetidor.CASA, 1);
        placar.atualizarPlacar(TipoCompetidor.VISITANTE, 1);
        placar.atualizarPlacar(TipoCompetidor.VISITANTE, 1);
        System.out.println(placar.showPlacarA());
        System.out.println(placar.showPlacarB());
        assertEquals(3, placar.casa );
        assertEquals(5, placar.visitante );
    }

}