package it.ded.pg.repo;

import it.ded.pg.model.Talento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITalentoRepo extends JpaRepository<Talento,String > {
}
