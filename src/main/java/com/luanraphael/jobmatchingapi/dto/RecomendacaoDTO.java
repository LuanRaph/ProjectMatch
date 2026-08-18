package com.luanraphael.jobmatchingapi.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter

public class RecomendacaoDTO {
    private Long id;
    private Long freelancerId;
    private Long projetoId;
    private Integer scoreTotal;
}