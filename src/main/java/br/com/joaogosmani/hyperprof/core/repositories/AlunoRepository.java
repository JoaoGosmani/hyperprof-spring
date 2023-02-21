package br.com.joaogosmani.hyperprof.core.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.joaogosmani.hyperprof.core.models.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {
    
}
