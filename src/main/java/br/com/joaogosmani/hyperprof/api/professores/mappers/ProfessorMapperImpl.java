package br.com.joaogosmani.hyperprof.api.professores.mappers;

import org.springframework.stereotype.Component;

import br.com.joaogosmani.hyperprof.api.professores.dtos.ProfessorRequest;
import br.com.joaogosmani.hyperprof.api.professores.dtos.ProfessorResponse;
import br.com.joaogosmani.hyperprof.core.models.Professor;

@Component
public class ProfessorMapperImpl implements ProfessorMapper {

    @Override
    public ProfessorResponse toProfessorResponse(Professor professor) {
        if (professor == null) {
            return null;
        }

        return ProfessorResponse.builder()
            .id(professor.getId())
            .nome(professor.getNome())
            .email(professor.getEmail())
            .idade(professor.getIdade())
            .descricao(professor.getDescricao())
            .valorHora(professor.getValorHora())
            .fotoPerfil(professor.getFotoPerfil())
            .createdAt(professor.getCreatedAt())
            .updatedAt(professor.getUpdatedAt())
            .build();
    }

    @Override
    public Professor toProfessor(ProfessorRequest professorRequest) {
        if (professorRequest == null) {
            return null;
        }

        return Professor.builder()
            .nome(professorRequest.getNome())
            .email(professorRequest.getEmail())
            .idade(professorRequest.getIdade())
            .descricao(professorRequest.getDescricao())
            .valorHora(professorRequest.getValorHora())
            .password(professorRequest.getPassword())
            .build();
    }
    
}
