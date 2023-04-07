package it.ded.pg.repo;

import it.ded.pg.model.Pg;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPgRepo extends JpaRepository<Pg,Integer> {
}
