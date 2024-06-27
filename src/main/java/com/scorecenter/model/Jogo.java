package com.scorecenter.model;

import com.scorecenter.enums.TipoCompetidor;

public abstract class Jogo {
	
	protected Competidor competidorA;
	protected Competidor competidorB;
	protected PlacarInterface placar;
	protected Boolean finalizado = false;

	protected Jogo(Competidor competidorA, Competidor competidorB, PlacarInterface placar) {
		validateNull(competidorA, competidorB, placar);
		validateCompetidores(competidorA, competidorB);
		this.competidorA = competidorA;
		this.competidorB = competidorB;
		this.placar = placar;
	}

	private static void validateNull(Competidor competidorA, Competidor competidorB, PlacarInterface placar) {
		if (competidorA ==null|| competidorB ==null || placar ==null) {
			throw new RuntimeException("Nenhum parametro pode ser null");
		}
	}

	private static void validateCompetidores(Competidor competidorA, Competidor competidorB) {
		if (competidorA.getTipo().equals(competidorB.getTipo())) {
			throw new RuntimeException("Escolha tipos diferentes para cada competidor!!");
		}
	}

	public abstract String showPlacar();

	public  void atualizarPlacar(TipoCompetidor competidor, Integer pontos) throws Exception {
		if (finalizado){
			throw new Exception("O jogo está finalizado");
		}
	}

	public void finalizarJogo() {
		finalizado=true;
	};



}
