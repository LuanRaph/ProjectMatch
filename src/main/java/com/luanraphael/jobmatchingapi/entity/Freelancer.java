package com.luanraphael.jobmatchingapi.entity;


import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Data
@Getter
@Setter

public class Freelancer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = "Nome é obrigatorio")
    private String nome;
    @NotNull(message = "Anos de experiencia é obrigatorio")
    @Min(0)
    private Integer anosExperiencia;
    @NotBlank(message = "Linguagens é obrigatorio")
    private String linguagens;
    @Email(message = "Email invalido")
    @Column(nullable = false, unique = true)
    private String email;
    @NotBlank(message = "Senioridade é obrigatorio")
    private String senioridade;
    @NotBlank(message = "Pais é obrigatorio")
    private String pais;


}