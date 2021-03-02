package br.com.tarcnux.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.tarcnux.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
