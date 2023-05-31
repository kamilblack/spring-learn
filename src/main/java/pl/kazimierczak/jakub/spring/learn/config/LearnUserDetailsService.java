package pl.kazimierczak.jakub.spring.learn.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import pl.kazimierczak.jakub.spring.learn.repository.UserRepository;
import pl.kazimierczak.jakub.spring.learn.repository.entity.RoleEntity;
import pl.kazimierczak.jakub.spring.learn.repository.entity.UserEntity;

import java.util.Set;

@Service
public class LearnUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;

//    public LearnUserDetailsService(UserRepository userRepository) {
//        this.userRepository = userRepository;
//    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        UserEntity userEntity = userRepository.findByUsername(username);
        if (userEntity == null) {
            throw new UsernameNotFoundException(username);
        }

        // FIXME: pobrać role i przerobić na tablicę String[]
        Set<RoleEntity> roles = userEntity.getRoles();

        UserDetails userDetails = User.withUsername(userEntity.getUsername())
                .password(userEntity.getPassword())
                .roles("ADMIN", "USER") // tablica ról String[]
                .build();
        return userDetails;

//        return new LearnUserPrincipal(userEntity);
    }
}
// TODO: 18.05.2023
// dokończyć implementację userDetailsService, czyli połączyć mechanizm SpringSecurity z własną tabela użytkowników