package pl.kazimierczak.jakub.spring.learn.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.kazimierczak.jakub.spring.learn.repository.entity.DashboardEntity;

@Repository
public interface DashboardRepository extends JpaRepository<DashboardEntity, Long> {
}
