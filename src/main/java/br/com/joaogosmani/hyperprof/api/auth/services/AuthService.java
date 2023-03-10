package br.com.joaogosmani.hyperprof.api.auth.services;

import br.com.joaogosmani.hyperprof.api.auth.dtos.LoginRequest;
import br.com.joaogosmani.hyperprof.api.auth.dtos.LoginResponse;
import br.com.joaogosmani.hyperprof.api.auth.dtos.RefreshRequest;

public interface AuthService {
    
    LoginResponse login(LoginRequest loginRequest);
    LoginResponse refresh(RefreshRequest refreshRequest);
    void logout(String token, RefreshRequest refreshRequest);

}
