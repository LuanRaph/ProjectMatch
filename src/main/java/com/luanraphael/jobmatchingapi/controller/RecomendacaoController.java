package com.luanraphael.jobmatchingapi.controller;

import com.luanraphael.jobmatchingapi.dto.RecomendacaoDTO;
import com.luanraphael.jobmatchingapi.entity.Freelancer;
import com.luanraphael.jobmatchingapi.entity.Projeto;
import com.luanraphael.jobmatchingapi.repository.FreelancerRepository;
import com.luanraphael.jobmatchingapi.repository.ProjetoRepository;
import com.luanraphael.jobmatchingapi.service.RecomendacaoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/recomendacoes")
public class RecomendacaoController {

    private final RecomendacaoService recomendacaoService;
    private final FreelancerRepository freelancerRepository;
    private final ProjetoRepository projetoRepository;

    public RecomendacaoController(RecomendacaoService recomendacaoService,
                                  FreelancerRepository freelancerRepository,
                                  ProjetoRepository projetoRepository) {
        this.recomendacaoService = recomendacaoService;
        this.freelancerRepository = freelancerRepository;
        this.projetoRepository = projetoRepository;
    }

    @PostMapping
    public ResponseEntity<RecomendacaoDTO> calcular(
            @RequestParam Long freelancerId,
            @RequestParam Long projetoId) {

        Freelancer freelancer = freelancerRepository.findById(freelancerId)
                .orElseThrow(() -> new RuntimeException("Freelancer não encontrado"));

        Projeto projeto = projetoRepository.findById(projetoId)
                .orElseThrow(() -> new RuntimeException("Projeto não encontrado"));

        RecomendacaoDTO resultado = recomendacaoService.calcularMatching(freelancer, projeto);

        return ResponseEntity.ok(resultado);
    }
}