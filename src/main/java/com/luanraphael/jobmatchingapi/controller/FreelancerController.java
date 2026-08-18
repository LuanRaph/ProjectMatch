package com.luanraphael.jobmatchingapi.controller;

import com.luanraphael.jobmatchingapi.entity.Freelancer;
import com.luanraphael.jobmatchingapi.repository.FreelancerRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController

@RequestMapping("/api/freelancers")
public class FreelancerController {
    private final FreelancerRepository repository;

    public FreelancerController(FreelancerRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    public ResponseEntity<Freelancer> criar(@RequestBody Freelancer freelancer) {
        Freelancer salvo = repository.save(freelancer);
        return ResponseEntity.ok(salvo);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Freelancer> buscar(@PathVariable Long id) {
        return repository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}
