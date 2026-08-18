package com.luanraphael.jobmatchingapi.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Data
@Getter
@Setter

public class Projeto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = "Titulo é obrigatorio")
    private String titulo;
    @NotBlank(message = "Descrição é obrigatorio")
    private String descricao;
    @NotBlank(message = "É necessário acrescentar tecnologias")
    private String tecnologiasNecessarias;
    @NotBlank(message = "Senioridade é obrigatorio")
    private String senioridadeMinima;
    @NotBlank(message = "Pais é obrigatorio")
    private String pais;

}