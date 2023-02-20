package br.com.joaogosmani.hyperprof.api.professores.mappers;

import br.com.joaogosmani.hyperprof.api.professores.dtos.ProfessorResponse;
import br.com.joaogosmani.hyperprof.core.models.Professor;

public interface ProfessorMapper {
    
    ProfessorResponse toProfessorResponse(Professor professor);

}
