package br.com.joaogosmani.hyperprof.core.exceptions;

public class ProfessorNotFoundException extends ModelNotFoundException {

    public ProfessorNotFoundException() {
        super("Professor não encontrado");
    }

    public ProfessorNotFoundException(String message) {
        super(message);
    }
    
}
