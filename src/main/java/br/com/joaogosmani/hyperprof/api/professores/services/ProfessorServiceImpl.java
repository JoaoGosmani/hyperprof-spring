package br.com.joaogosmani.hyperprof.api.professores.services;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.joaogosmani.hyperprof.api.professores.dtos.ProfessorResponse;
import br.com.joaogosmani.hyperprof.api.professores.mappers.ProfessorMapper;
import br.com.joaogosmani.hyperprof.core.exceptions.ProfessorNotFoundException;
import br.com.joaogosmani.hyperprof.core.repositories.ProfessorRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProfessorServiceImpl implements ProfessorService {

    private final ProfessorMapper professorMapper;
    private final ProfessorRepository professorRepository;

    @Override
    public List<ProfessorResponse> buscarProfessores(String descricao) {
        return professorRepository.findByDescricaoContaining(descricao)
            .stream()
            .map(professorMapper::toProfessorResponse)
            .toList();
    }

    @Override
    public ProfessorResponse buscarProfessorPorId(Long professorId) {
        return professorRepository.findById(professorId)
            .map(professorMapper::toProfessorResponse)
            .orElseThrow(ProfessorNotFoundException::new);
    }
    
}
