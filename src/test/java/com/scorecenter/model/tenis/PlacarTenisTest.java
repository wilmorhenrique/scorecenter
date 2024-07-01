package com.scorecenter.model.tenis;

import com.scorecenter.enums.TipoCompetidor;
import com.scorecenter.exceptions.GameFinalizadoException;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatRuntimeException;
import static org.junit.jupiter.api.Assertions.*;

class PlacarTenisTest {

    @Test
    void testaCasaFazendo15_30_40() throws GameFinalizadoException{
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
    void testaVisitanteFazendo15_30_40() throws GameFinalizadoException{ 
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
    void testaCasaFazendo40x30() throws GameFinalizadoException{
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
    void testaFazendo40x40() throws GameFinalizadoException{
        PlacarTenis placar = new PlacarTenis();
        placar.atualizarPlacar(TipoCompetidor.VISITANTE, 1);
        placar.atualizarPlacar(TipoCompetidor.VISITANTE, 1);
        placar.atualizarPlacar(TipoCompetidor.VISITANTE, 1);
        placar.atualizarPlacar(TipoCompetidor.CASA, 1);
        placar.atualizarPlacar(TipoCompetidor.CASA, 1);
        placar.atualizarPlacar(TipoCompetidor.CASA, 1);
        System.out.println(placar.showPlacarA());
        System.out.println(placar.showPlacarB());
        placar.atualizarPlacar(TipoCompetidor.VISITANTE, 1);
        System.out.println(placar.showPlacarA());
        System.out.println(placar.showPlacarB());
        placar.atualizarPlacar(TipoCompetidor.CASA, 1);
        System.out.println(placar.showPlacarA());
        System.out.println(placar.showPlacarB());
        assertEquals(3, placar.casa );
        assertEquals(3, placar.visitante );
    }

    @Test
    void testaFazendoVantagemDepoisDeIGuais() throws GameFinalizadoException{
        PlacarTenis placar = new PlacarTenis();
        placar.atualizarPlacar(TipoCompetidor.VISITANTE, 1);
        placar.atualizarPlacar(TipoCompetidor.VISITANTE, 1);
        placar.atualizarPlacar(TipoCompetidor.VISITANTE, 1);
        placar.atualizarPlacar(TipoCompetidor.CASA, 1);
        placar.atualizarPlacar(TipoCompetidor.CASA, 1);
        placar.atualizarPlacar(TipoCompetidor.CASA, 1);
        System.out.println(placar.showPlacarA());
        System.out.println(placar.showPlacarB());

        placar.atualizarPlacar(TipoCompetidor.VISITANTE, 1);
        System.out.println(placar.showPlacarA());
        System.out.println(placar.showPlacarB());
        assertEquals(3, placar.casa );
        assertEquals(4, placar.visitante );
    }

    @Test
    void testaFazendoIguaisDepoisDeVantagem() throws GameFinalizadoException{
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
    void testaCasaFazendoVantagemDepoisDeEstarIguais() throws GameFinalizadoException{
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
    void testaCasaFazendoGame() throws GameFinalizadoException{
        PlacarTenis placar = new PlacarTenis();
        placar.atualizarPlacar(TipoCompetidor.CASA, 1);
        placar.atualizarPlacar(TipoCompetidor.CASA, 1);
        placar.atualizarPlacar(TipoCompetidor.CASA, 1);
        placar.atualizarPlacar(TipoCompetidor.CASA, 1);
        System.out.println(placar.showPlacarA());
        System.out.println(placar.showPlacarB());
        assertEquals(5, placar.casa );
    }

    @Test
    void testaVisitanteFazendoGame() throws GameFinalizadoException{
        PlacarTenis placar = new PlacarTenis();
        placar.atualizarPlacar(TipoCompetidor.VISITANTE, 1);
        placar.atualizarPlacar(TipoCompetidor.VISITANTE, 1);
        placar.atualizarPlacar(TipoCompetidor.VISITANTE, 1);
        placar.atualizarPlacar(TipoCompetidor.VISITANTE, 1);
        assertEquals(5, placar.visitante );
    }

    @Test
    void testaNaoDeixarPontosDepoisDoGameFinalizado() throws GameFinalizadoException{
        PlacarTenis placar = new PlacarTenis();
        placar.atualizarPlacar(TipoCompetidor.VISITANTE, 1);
        System.out.println(placar.showPlacarB());
        placar.atualizarPlacar(TipoCompetidor.VISITANTE, 1);
        System.out.println(placar.showPlacarB());
        placar.atualizarPlacar(TipoCompetidor.VISITANTE, 1);
        System.out.println(placar.showPlacarB());
    	placar.atualizarPlacar(TipoCompetidor.VISITANTE, 1);
        System.out.println(placar.showPlacarB());

        Throwable exception = assertThrows(GameFinalizadoException.class, () -> {
        	placar.atualizarPlacar(TipoCompetidor.VISITANTE, 1);
            System.out.println(placar.showPlacarA());
            System.out.println(placar.showPlacarB());
        });

        assertNotNull(exception);
        

    	
    }
    
}