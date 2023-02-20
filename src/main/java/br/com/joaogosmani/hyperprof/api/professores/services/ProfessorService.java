package br.com.joaogosmani.hyperprof.api.professores.services;

import java.util.List;

import br.com.joaogosmani.hyperprof.api.professores.dtos.ProfessorResponse;

public interface ProfessorService {
    
    List<ProfessorResponse> buscarProfessores(String descricao);

}
