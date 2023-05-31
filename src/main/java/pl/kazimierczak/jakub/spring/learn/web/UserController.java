package pl.kazimierczak.jakub.spring.learn.web;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.kazimierczak.jakub.spring.learn.repository.UserRepository;
import pl.kazimierczak.jakub.spring.learn.repository.entity.UserEntity;

import java.util.logging.Logger;

@RestController
@RequestMapping(value = "/api/users")
public class UserController {
    private static final Logger LOGGER = Logger.getLogger(UserController.class.getName());

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public UserController(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @PostMapping
    public UserEntity signUp(@RequestBody UserEntity userEntity) {
        LOGGER.info("signUp(" + userEntity + ")");
        userEntity.setPassword(passwordEncoder.encode(userEntity.getPassword()));
        userRepository.save(userEntity);
        return userEntity;
    }
}
