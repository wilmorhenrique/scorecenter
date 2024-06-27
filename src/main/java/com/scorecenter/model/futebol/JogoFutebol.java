package com.scorecenter.model.futebol;

import java.util.StringJoiner;

import com.scorecenter.enums.TipoCompetidor;
import com.scorecenter.model.Competidor;
import com.scorecenter.model.Jogo;
import com.scorecenter.model.PlacarInterface;


public class JogoFutebol extends Jogo {


	protected JogoFutebol(Competidor competidorA, Competidor competidorB, PlacarInterface placar) {
		super(competidorA, competidorB, placar);
	}

	@Override
	public String showPlacar() {
		StringJoiner resultado = new StringJoiner("", "Placar Atualizado -> ", "");
		resultado.add(competidorA.getNome());
		resultado.add(" ");
		resultado.add(placar.showPlacarA());
		resultado.add(" x ");
		resultado.add(placar.showPlacarB());
		resultado.add(" ");
		resultado.add(competidorB.getNome());
		return resultado.toString();
	}

	@Override
	public void atualizarPlacar(TipoCompetidor competidor, Integer pontos) throws Exception {
		super.atualizarPlacar(competidor, pontos);
		placar.atualizarPlacar(competidor, pontos);

	}

}
