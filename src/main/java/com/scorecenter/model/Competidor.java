package com.scorecenter.model;

import com.scorecenter.enums.TipoCompetidor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Competidor {
	private String nome;
	private TipoCompetidor tipo;
	

}
