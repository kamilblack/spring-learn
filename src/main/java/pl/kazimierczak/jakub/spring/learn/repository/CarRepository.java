package pl.kazimierczak.jakub.spring.learn.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.kazimierczak.jakub.spring.learn.repository.entity.CarEntity;

@Repository
public interface CarRepository extends JpaRepository<CarEntity, Long> {
}
