package br.com.joaogosmani.hyperprof.api.alunos.services;

import org.springframework.stereotype.Service;

import br.com.joaogosmani.hyperprof.api.alunos.dtos.AlunoRequest;
import br.com.joaogosmani.hyperprof.api.alunos.dtos.AlunoResponse;
import br.com.joaogosmani.hyperprof.api.alunos.mappers.AlunoMapper;
import br.com.joaogosmani.hyperprof.core.exceptions.ProfessorNotFoundException;
import br.com.joaogosmani.hyperprof.core.repositories.AlunoRepository;
import br.com.joaogosmani.hyperprof.core.repositories.ProfessorRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AlunoServiceImpl implements AlunoService {

    private final AlunoMapper alunoMapper;
    private final AlunoRepository alunoRepository;
    private final ProfessorRepository professorRepository;

    @Override
    public AlunoResponse cadastrarAluno(AlunoRequest alunoRequest, Long professorId) {
        var professor = professorRepository.findById(professorId)
            .orElseThrow(ProfessorNotFoundException::new);

        var alunoParaCadastrar = alunoMapper.toAluno(alunoRequest);
        alunoParaCadastrar.setProfessor(professor);
        var alunoCadastrado = alunoRepository.save(alunoParaCadastrar);

        return alunoMapper.toAlunoResponse(alunoCadastrado);
    }
    
}
