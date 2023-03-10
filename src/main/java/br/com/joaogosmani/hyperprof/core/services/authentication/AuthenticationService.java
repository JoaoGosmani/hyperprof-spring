package br.com.joaogosmani.hyperprof.core.services.authentication;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import br.com.joaogosmani.hyperprof.core.models.AuthenticatedUser;
import br.com.joaogosmani.hyperprof.core.repositories.ProfessorRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AuthenticationService implements UserDetailsService {

    private final ProfessorRepository professorRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return professorRepository.findByEmail(username)
            .map(AuthenticatedUser::new)
            .orElseThrow(() -> new UsernameNotFoundException("Credenciais inválidas"));
    }
    
}
