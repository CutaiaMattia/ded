package it.ded.pg.repo;

import it.ded.pg.model.Incantesimo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IIncantesimoRepo extends JpaRepository<Incantesimo,String> {

    List<Incantesimo> findByClasseAndLvl(String classe, int lvl);
}
