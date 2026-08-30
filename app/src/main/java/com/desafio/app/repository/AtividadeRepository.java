package com.desafio.app.repository;

import com.desafio.app.model.Atividade;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AtividadeRepository extends JpaRepository<Atividade, Integer> {
}
