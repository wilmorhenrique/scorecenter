package com.scorecenter.model;

import com.scorecenter.enums.TipoCompetidor;

public interface PlacarInterface {
	public void atualizarPlacar(TipoCompetidor competidor, Integer pontos);
	public String showPlacarA();
	public String showPlacarB();

}
