package com.luanraphael.jobmatchingapi.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter

public class RecomendacaoDTO {
    private Long freelancerId;
    private String freelancerNome;
    private String freelancerLinguagens;
    private String freelancerSenioridade;

    private Long projetoId;
    private String projetoTitulo;
    private String projetoDescricao;
    private String projetoTecnologiasNecessarias;

    private Integer scoreTotal;
}