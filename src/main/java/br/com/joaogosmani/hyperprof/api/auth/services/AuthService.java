package br.com.joaogosmani.hyperprof.api.auth.services;

import br.com.joaogosmani.hyperprof.api.auth.dtos.LoginRequest;
import br.com.joaogosmani.hyperprof.api.auth.dtos.LoginResponse;

public interface AuthService {
    
    LoginResponse login(LoginRequest loginRequest);

}
