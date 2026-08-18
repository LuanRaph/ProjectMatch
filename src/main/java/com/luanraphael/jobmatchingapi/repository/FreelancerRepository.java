package com.luanraphael.jobmatchingapi.repository;

import com.luanraphael.jobmatchingapi.entity.Freelancer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FreelancerRepository extends JpaRepository<Freelancer, Long> {

}