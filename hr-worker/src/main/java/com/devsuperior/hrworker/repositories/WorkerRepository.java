package com.devsuperior.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.devsuperior.hrworker.entities.Worker;

@EnableJpaRepositories
public interface WorkerRepository extends JpaRepository<Worker, Long> {

	
	
	
	
	
}
