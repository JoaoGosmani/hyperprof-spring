package br.com.joaogosmani.hyperprof.api.alunos.services;

import java.util.List;

import br.com.joaogosmani.hyperprof.api.alunos.dtos.AlunoRequest;
import br.com.joaogosmani.hyperprof.api.alunos.dtos.AlunoResponse;

public interface AlunoService {
    
    List<AlunoResponse> listarAlunosPorProfessorLogado();
    AlunoResponse cadastrarAluno(AlunoRequest alunoRequest, Long professorId);

}
