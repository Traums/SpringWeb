package main.service;

import main.domain.Hero;
import main.repos.HeroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.List;
@Service
@Transactional
public class DatabaseServiceImpl implements DatabaseService{
    @Autowired
    private HeroRepository heroRepository;

    public DatabaseServiceImpl( HeroRepository heroRepository){
        this.heroRepository = heroRepository;
    }

    @Override
    public Hero saveHero(Hero hero) {
        return heroRepository.save(hero);
    }

    @Override
    public Hero getHeroById(Long id) {
        return heroRepository.getReferenceById(id);
    }

    @Override
    public List<Hero> getAll() {
        return heroRepository.findAll();
    }
}
