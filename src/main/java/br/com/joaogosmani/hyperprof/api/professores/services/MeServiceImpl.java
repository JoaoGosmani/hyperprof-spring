package br.com.joaogosmani.hyperprof.api.professores.services;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import br.com.joaogosmani.hyperprof.api.professores.dtos.ProfessorResponse;
import br.com.joaogosmani.hyperprof.api.professores.mappers.ProfessorMapper;
import br.com.joaogosmani.hyperprof.core.models.AuthenticatedUser;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MeServiceImpl implements MeService {
    
    private final ProfessorMapper professorMapper;

    @Override
    public ProfessorResponse buscarProfessorLogado() {
        var authentication = SecurityContextHolder.getContext().getAuthentication();
        var professor = ((AuthenticatedUser) authentication.getPrincipal()).getProfessor();

        return professorMapper.toProfessorResponse(professor);
    }

}
