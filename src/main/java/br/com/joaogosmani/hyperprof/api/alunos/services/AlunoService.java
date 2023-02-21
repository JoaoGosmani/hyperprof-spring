package br.com.joaogosmani.hyperprof.api.alunos.services;

import br.com.joaogosmani.hyperprof.api.alunos.dtos.AlunoRequest;
import br.com.joaogosmani.hyperprof.api.alunos.dtos.AlunoResponse;

public interface AlunoService {
    
    AlunoResponse cadastrarAluno(AlunoRequest alunoRequest, Long professorId);

}
