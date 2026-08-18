package com.luanraphael.jobmatchingapi.controller;

import com.luanraphael.jobmatchingapi.entity.Projeto;
import com.luanraphael.jobmatchingapi.repository.ProjetoRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController

@RequestMapping("/api/projetos")
public class ProjetoController {
    private final ProjetoRepository repository;

    public ProjetoController(ProjetoRepository repository) {
        this.repository = repository;
    }
    @PostMapping
    public ResponseEntity<Projeto> criar(@RequestBody Projeto projeto) {
        Projeto salvo = repository.save(projeto);
        return ResponseEntity.ok(salvo);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Projeto> buscar(@PathVariable Long id) {
        return repository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}