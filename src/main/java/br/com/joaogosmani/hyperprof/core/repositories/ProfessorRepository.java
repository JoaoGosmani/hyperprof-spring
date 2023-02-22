package br.com.joaogosmani.hyperprof.core.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.joaogosmani.hyperprof.core.models.Professor;

public interface ProfessorRepository extends JpaRepository<Professor, Long> {
    
    boolean existsByEmail(String email);
    Optional<Professor> findByEmail(String email);
    List<Professor> findByDescricaoContaining(String descricao);

}
