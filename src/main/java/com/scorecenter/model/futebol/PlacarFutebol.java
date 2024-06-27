package com.scorecenter.model.futebol;

import com.scorecenter.enums.TipoCompetidor;
import com.scorecenter.model.PlacarInterface;

public class PlacarFutebol implements PlacarInterface {
	protected Integer casa = 0;
	protected Integer visitante = 0;


	public String showPlacarA() {
		return casa.toString();
	}

	public String showPlacarB() {
		return visitante.toString();
	}

	public void atualizarPlacar(TipoCompetidor competidor, Integer pontos) {
		if (competidor.equals(TipoCompetidor.CASA)) casa++;
		if (competidor.equals(TipoCompetidor.VISITANTE)) visitante++;

	}
	
	

}
