package it.ded.pg.repo;

import it.ded.pg.model.LivelloClasse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ILivelloClasseRepo  extends JpaRepository<LivelloClasse,Integer> {
}
