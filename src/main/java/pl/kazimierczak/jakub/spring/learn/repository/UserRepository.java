package pl.kazimierczak.jakub.spring.learn.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.kazimierczak.jakub.spring.learn.repository.entity.UserEntity;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {

    UserEntity findByUsername(String username);
}
// TODO: 18.05.2023
// Napisać testy jednostkowe dla metody findByUsername