package main.repos;

import main.domain.Hero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface HeroRepository extends JpaRepository<Hero,Long> {
    Optional<Hero> findById(Long id);
    void deleteById(Long id);
    List<Hero> readAll();

}
