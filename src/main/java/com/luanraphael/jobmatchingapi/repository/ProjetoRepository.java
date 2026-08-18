package com.luanraphael.jobmatchingapi.repository;

import com.luanraphael.jobmatchingapi.entity.Projeto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjetoRepository extends JpaRepository<Projeto, Long> {

}