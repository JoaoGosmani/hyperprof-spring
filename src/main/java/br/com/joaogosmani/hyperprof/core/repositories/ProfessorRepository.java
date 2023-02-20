package br.com.joaogosmani.hyperprof.core.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.joaogosmani.hyperprof.core.models.Professor;

public interface ProfessorRepository extends JpaRepository<Professor, Long> {
    
    List<Professor> findByDescricaoContaining(String descricao);

}
