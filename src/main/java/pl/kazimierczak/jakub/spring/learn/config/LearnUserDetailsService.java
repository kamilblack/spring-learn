package pl.kazimierczak.jakub.spring.learn.config;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import pl.kazimierczak.jakub.spring.learn.repository.UserRepository;

@Service
public class LearnUserDetailsService implements UserDetailsService {

    private UserRepository userRepository;

    public LearnUserDetailsService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

//        userRepository.fi

        return null;
    }
}
// TODO: 18.05.2023
// dokończyć implementację userDetailsService, czyli połączyć mechanizm SpringSecurity z własną tabela użytkowników