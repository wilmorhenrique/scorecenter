package com.scorecenter.model.futebol;


import com.scorecenter.enums.TipoCompetidor;
import com.scorecenter.model.Competidor;
import com.scorecenter.model.Jogo;
import com.scorecenter.model.PlacarInterface;

public class MainClassTest {
	public static void main(String[] args) throws Exception {

		Competidor compA = Competidor.builder().nome("Competidor A").tipo(TipoCompetidor.CASA).build();
		Competidor compB = Competidor.builder().nome("Competidor B").tipo(TipoCompetidor.VISITANTE).build();
		PlacarInterface placarFutebol = new PlacarFutebol();
		Jogo jogo = new JogoFutebol(compA, compB, placarFutebol);

		System.out.println(jogo.showPlacar());
		jogo.atualizarPlacar(TipoCompetidor.CASA, 1);
		System.out.println(jogo.showPlacar());
		jogo.atualizarPlacar(TipoCompetidor.VISITANTE, 1);
		System.out.println(jogo.showPlacar());
		jogo.atualizarPlacar(TipoCompetidor.CASA, 1);
		System.out.println(jogo.showPlacar());
		jogo.atualizarPlacar(TipoCompetidor.CASA, 1);
		System.out.println(jogo.showPlacar());
		jogo.atualizarPlacar(TipoCompetidor.CASA, 1);
		System.out.println(jogo.showPlacar());
		jogo.atualizarPlacar(TipoCompetidor.VISITANTE, 1);
		System.out.println(jogo.showPlacar());

		jogo.finalizarJogo();
		jogo.atualizarPlacar(TipoCompetidor.VISITANTE, 1);
		System.out.println(jogo.showPlacar());

	}

}
