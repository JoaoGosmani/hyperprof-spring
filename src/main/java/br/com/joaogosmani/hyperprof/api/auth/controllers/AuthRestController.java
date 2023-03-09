package br.com.joaogosmani.hyperprof.api.auth.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.joaogosmani.hyperprof.api.auth.dtos.LoginRequest;
import br.com.joaogosmani.hyperprof.api.auth.dtos.LoginResponse;
import br.com.joaogosmani.hyperprof.api.auth.services.AuthService;
import br.com.joaogosmani.hyperprof.api.common.routes.ApiRoutes;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class AuthRestController {
    
    private final AuthService authService;

    @PostMapping(ApiRoutes.LOGIN)
    public LoginResponse login(@RequestBody @Valid LoginRequest loginRequest) {
        return authService.login(loginRequest);
    }

}
