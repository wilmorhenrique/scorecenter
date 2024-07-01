package com.scorecenter.model;

import com.scorecenter.enums.TipoCompetidor;
import com.scorecenter.exceptions.GameFinalizadoException;

public interface PlacarInterface {
	public void atualizarPlacar(TipoCompetidor competidor, Integer pontos) throws GameFinalizadoException;
	public String showPlacarA();
	public String showPlacarB();

}
