package br.com.joaogosmani.hyperprof.api.professores.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.joaogosmani.hyperprof.api.professores.dtos.ProfessorResponse;
import br.com.joaogosmani.hyperprof.api.professores.services.ProfessorService;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class ProfessorRestController {
    
    private final ProfessorService professorService;

    @GetMapping("/api/professores")
    public List<ProfessorResponse> buscarProfessores(
        @RequestParam(name = "q", required = false, defaultValue = "") String descricao
    ) {
        return professorService.buscarProfessores(descricao);
    }

}
