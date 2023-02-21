package br.com.joaogosmani.hyperprof.api.alunos.mappers;

import br.com.joaogosmani.hyperprof.api.alunos.dtos.AlunoRequest;
import br.com.joaogosmani.hyperprof.api.alunos.dtos.AlunoResponse;
import br.com.joaogosmani.hyperprof.core.models.Aluno;

public interface AlunoMapper {
    
    Aluno toAluno(AlunoRequest alunoRequest);
    AlunoResponse toAlunoResponse(Aluno aluno);

}
