package br.com.joaogosmani.hyperprof.api.professores.mappers;

import br.com.joaogosmani.hyperprof.api.professores.dtos.ProfessorRequest;
import br.com.joaogosmani.hyperprof.api.professores.dtos.ProfessorResponse;
import br.com.joaogosmani.hyperprof.core.models.Professor;

public interface ProfessorMapper {
    
    Professor toProfessor(ProfessorRequest professorRequest);
    ProfessorResponse toProfessorResponse(Professor professor);

}
