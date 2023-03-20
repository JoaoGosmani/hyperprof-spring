package br.com.joaogosmani.hyperprof.api.professores.services;

import java.util.List;

import br.com.joaogosmani.hyperprof.api.professores.dtos.ProfessorRequest;
import br.com.joaogosmani.hyperprof.api.professores.dtos.ProfessorResponse;

public interface ProfessorService {
    
    void excluirProfessorLogado();
    List<ProfessorResponse> buscarProfessores(String descricao);
    ProfessorResponse buscarProfessorPorId(Long professorId);
    ProfessorResponse cadastrarProfessor(ProfessorRequest professorRequest);
    ProfessorResponse atualizarProfessorLogado(ProfessorRequest professorRequest);

}
