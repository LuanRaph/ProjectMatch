package com.luanraphael.jobmatchingapi.service;

import com.luanraphael.jobmatchingapi.dto.RecomendacaoDTO;
import com.luanraphael.jobmatchingapi.entity.Freelancer;
import com.luanraphael.jobmatchingapi.entity.Projeto;
import org.springframework.stereotype.Service;

@Service
public class RecomendacaoService {
    public RecomendacaoDTO calcularMatching(Freelancer freelancer, Projeto projeto) {
        int scoreTecnologias = calcularTecnologias(
                projeto.getTecnologiasNecessarias(),
                freelancer.getLinguagens()
        );
        int scoreSenioridade = calcularSenioridade(
                projeto.getSenioridadeMinima(),
                freelancer.getSenioridade()
        );
        int scoreTotal = (scoreTecnologias + scoreSenioridade) / 2;

        RecomendacaoDTO dto = new RecomendacaoDTO();
        dto.setFreelancerId(freelancer.getId());
        dto.setScoreTotal(scoreTotal);
        dto.setProjetoId(projeto.getId());
        return dto;
    }

    private int calcularTecnologias(String necessarias, String doFreelancer) {
        if (necessarias == null || necessarias.isEmpty()) {
            return 100;
        }
        String[] tecNecessarias = necessarias.split(",");
        String[] tecFreelancer = doFreelancer.split(",");
        int match = 0;
        for (String tec : tecNecessarias) {
            for (String tecF : tecFreelancer) {
                if (tec.trim().equalsIgnoreCase(tecF.trim())) {
                    match++;
                }
            }
        }
        return (match * 100) / tecNecessarias.length;
    }
    private int calcularSenioridade(String minima, String doFreelancer) {
        if (minima.trim().equalsIgnoreCase(doFreelancer.trim())) {
            return 100;
        }
        return 0;
    }
}