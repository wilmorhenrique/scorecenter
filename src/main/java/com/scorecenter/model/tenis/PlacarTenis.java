package com.scorecenter.model.tenis;

import com.scorecenter.enums.TipoCompetidor;
import com.scorecenter.model.PlacarInterface;

public class PlacarTenis implements PlacarInterface {
	String pontuacao[] = {"0", "15", "30", "40", "AD", "GAME"};
	protected Integer casa = 0;
	protected Integer visitante = 0;


	public String showPlacarA() {
		return pontuacao[casa];
	}

	public String showPlacarB() {
		return pontuacao[visitante];
	}

	public void atualizarPlacar(TipoCompetidor competidor, Integer pontos) {

		if (competidor.equals(TipoCompetidor.CASA)) {
			if (casa <= 2) {
				casa++;
				return;
			}
			if (casa == 3 && visitante <= 3) {
				casa++;
				return;
			}
			if (casa == 3 && visitante == 4) {
				visitante--;
				return;
			}
			casa++;
		}
		if (competidor.equals(TipoCompetidor.VISITANTE)) {
			if (visitante <= 2) {
				visitante++;
				return;
			}
			if (visitante == 3 && casa <= 3) {
				visitante++;
				return;
			}
			if (visitante == 3 && casa == 4) {
				casa--;
				return;
			}
			visitante++;
		}
	}

}
